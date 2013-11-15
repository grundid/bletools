package de.grundid.ble.sensors.generic;

import java.util.UUID;

import android.bluetooth.BluetoothGattCharacteristic;

public class AlertLevel {

	private static final UUID MY_UUID = UUID.fromString("00002a06-0000-1000-8000-00805f9b34fb");
	private BluetoothGattCharacteristic characteristic;

	public AlertLevel(BluetoothGattCharacteristic characteristic) {
		this.characteristic = characteristic;
	}

	public void setNoAlert() {
		setValue(0);
	}

	public void setMildAlert() {
		setValue(1);
	}

	public void setHighAlert() {
		setValue(2);
	}

	public static boolean isUuid(UUID uuid) {
		return MY_UUID.equals(uuid);
	}

	private void setValue(int value) {
		characteristic.setValue(value, BluetoothGattCharacteristic.FORMAT_UINT8, 0);
		characteristic.setWriteType(BluetoothGattCharacteristic.WRITE_TYPE_NO_RESPONSE);
	}
}
