package de.grundid.ble.sensors.generic;

import java.util.UUID;

import android.bluetooth.BluetoothGattCharacteristic;

public class HeartMeasurement {

	public final static UUID MY_UUID = UUID.fromString("00002a37-0000-1000-8000-00805f9b34fb");
	private int heartRate;

	public HeartMeasurement(int heartRate) {
		this.heartRate = heartRate;
	}

	public int getHeartRate() {
		return heartRate;
	}

	public static boolean isUuid(UUID uuid) {
		return MY_UUID.equals(uuid);
	}

	public static HeartMeasurement fromCharacteristic(BluetoothGattCharacteristic characteristic) {
		int flag = characteristic.getProperties();
		int format = -1;
		if ((flag & 0x01) != 0) {
			format = BluetoothGattCharacteristic.FORMAT_UINT16;
		}
		else {
			format = BluetoothGattCharacteristic.FORMAT_UINT8;
		}
		int heartRate = characteristic.getIntValue(format, 1);
		return new HeartMeasurement(heartRate);
	}
}
