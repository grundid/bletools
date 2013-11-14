package de.grundid.ble.fingerprint;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.Test;

public class SensorMatcherTest {

	private static final String DEFAULT_UUID_SUFFIX = "-0000-1000-8000-00805f9b34fb";

	@Test(expected = UnknownSensorException.class)
	public void itShouldThrowExceptionIfNoMatch() throws Exception {
		SensorMatcher matcher = new SensorMatcher(new ArrayList<Sensor>());
		matcher.identifySensor(new Sensor("unknown"));
	}

	@Test
	public void itShouldMatchSensor() throws Exception {
		List<Sensor> sensors = new ArrayList<Sensor>();
		sensors.add(appendService(new Sensor("s1"), "00001800", "00002a00"));
		SensorMatcher matcher = new SensorMatcher(sensors);
		Sensor sensorToMatch = new Sensor(null);
		appendService(sensorToMatch, "00001800", "00002a00");
		String name = matcher.identifySensor(sensorToMatch);
		assertEquals("s1", name);
	}

	@Test
	public void itShouldMatchSingleSensor() throws Exception {
		SensorMatcher matcher = new SensorMatcher(null);
		Sensor sensor = new Sensor("s1");
		appendService(sensor, "00001800", "00002a00");
		Sensor sensorToMatch = new Sensor(null);
		appendService(sensorToMatch, "00001800", "00002a00");
		assertTrue(matcher.matchesSensor(sensor, sensorToMatch));
	}

	@Test
	public void itShouldMatchSensorWithMoreServices() throws Exception {
		SensorMatcher matcher = new SensorMatcher(null);
		Sensor sensor = new Sensor("s1");
		appendService(sensor, "00001800", "00002a00");
		Sensor sensorToMatch = new Sensor(null);
		appendService(sensorToMatch, "00001800", "00002a00");
		appendService(sensorToMatch, "0000180a", "00002a29");
		assertTrue(matcher.matchesSensor(sensor, sensorToMatch));
	}

	private static Sensor appendService(Sensor sensor, String serviceUuid, String... charUuids) {
		UUID uuid = UUID.fromString(serviceUuid + DEFAULT_UUID_SUFFIX);
		sensor.addService(uuid);
		for (String charUuid : charUuids) {
			sensor.addCharacteristic(uuid, UUID.fromString(charUuid + DEFAULT_UUID_SUFFIX));
		}
		return sensor;
	}
}
