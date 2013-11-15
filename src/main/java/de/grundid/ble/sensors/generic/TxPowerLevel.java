package de.grundid.ble.sensors.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import android.bluetooth.BluetoothGattCharacteristic;

public class TxPowerLevel {

	private static final UUID MY_UUID = UUID.fromString("00002a07-0000-1000-8000-00805f9b34fb");
	private static final List<PowerLevel> LEVELS = new ArrayList<TxPowerLevel.PowerLevel>();
	private BluetoothGattCharacteristic characteristic;
	private int level;

	public static class PowerLevel {

		private byte value;
		private String label;

		public PowerLevel(int value, String label) {
			this.value = (byte)value;
			this.label = label;
		}

		public byte getValue() {
			return value;
		}

		public String getLabel() {
			return label;
		}
	}

	static {
		LEVELS.add(new PowerLevel(0x04, "4dBm"));
		LEVELS.add(new PowerLevel(0x00, "0dBm"));
		LEVELS.add(new PowerLevel(0xFC, "-4dBm"));
		LEVELS.add(new PowerLevel(0xF8, "-8dBm"));
		LEVELS.add(new PowerLevel(0xF4, "-12dBm"));
		LEVELS.add(new PowerLevel(0xF0, "-16dBm"));
		LEVELS.add(new PowerLevel(0xEC, "-20dBm"));
		LEVELS.add(new PowerLevel(0xD8, "-40dBm"));
	}

	public TxPowerLevel(BluetoothGattCharacteristic characteristic) {
		this.characteristic = characteristic;
	}

	private TxPowerLevel(int level) {
		this.level = level;
	}

	public void setLevel(int level) {
		this.level = level;
		characteristic.setValue(level, BluetoothGattCharacteristic.FORMAT_SINT8, 0);
	}

	public int getLevel() {
		return level;
	}

	public static boolean isUuid(UUID uuid) {
		return MY_UUID.equals(uuid);
	}

	public static TxPowerLevel fromCharacteristic(BluetoothGattCharacteristic characteristic) {
		Integer value = characteristic.getIntValue(BluetoothGattCharacteristic.FORMAT_SINT8, 0);
		if (value != null) {
			return new TxPowerLevel(value.intValue());
		}
		else
			throw new RuntimeException("getIntValue retured null");
	}

	public static List<PowerLevel> getLevels() {
		return LEVELS;
	}
}
