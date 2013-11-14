package de.grundid.ble.fingerprint;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

public class Sensor {

	private String name;
	private Map<UUID, Set<UUID>> services = new HashMap<UUID, Set<UUID>>();

	public Sensor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addService(UUID serviceUuid) {
		services.put(serviceUuid, new HashSet<UUID>());
	}

	public void addCharacteristic(UUID serviceUuid, UUID charUuid) {
		Set<UUID> service = services.get(serviceUuid);
		service.add(charUuid);
	}

	public boolean hasService(UUID uuid) {
		return services.containsKey(uuid);
	}

	public boolean hasCharacteristic(UUID serviceUuid, UUID characterictisUuid) {
		Set<UUID> set = services.get(serviceUuid);
		return set != null && set.contains(characterictisUuid);
	}

	public Set<Entry<UUID, Set<UUID>>> getServices() {
		return services.entrySet();
	}
}
