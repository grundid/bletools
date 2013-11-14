package de.grundid.ble.fingerprint;

import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

public class SensorMatcher {

	private List<Sensor> sensors;

	public SensorMatcher(List<Sensor> sensors) {
		this.sensors = sensors;
	}

	public String identifySensor(Sensor sensorToMatch) throws UnknownSensorException {
		for (Sensor sensor : sensors) {
			if (matchesSensor(sensor, sensorToMatch))
				return sensor.getName();
		}
		throw new UnknownSensorException();
	}

	public boolean matchesSensor(Sensor sensor, Sensor sensorToMatch) {
		for (Entry<UUID, Set<UUID>> entry : sensor.getServices()) {
			UUID serviceUuid = entry.getKey();
			if (!sensorToMatch.hasService(serviceUuid)) {
				return false;
			}
			for (UUID charaUuid : entry.getValue()) {
				if (!sensorToMatch.hasCharacteristic(serviceUuid, charaUuid))
					return false;
			}
		}
		return true;
	}
}
