package de.grundid.ble.gatt;

public class GattService {

	private String name;
	private String type;
	private String uuid;

	public GattService(String name, String type, String uuid) {
		this.name = name;
		this.type = type;
		this.uuid = uuid.toLowerCase();
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getUuid() {
		return uuid;
	}
}
