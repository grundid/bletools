package de.grundid.ble.sensors.tokencube;

import java.util.UUID;

import android.bluetooth.BluetoothGattCharacteristic;

public class TokencubeOrientation {

	private static final double FACTOR = 4096;
	private static final UUID MY_UUID = UUID.fromString("00002b20-0000-1000-8000-00805f9b34fb");
	private float xAxis;
	private float yAxis;
	private float zAxis;

	public TokencubeOrientation(float xAxis, float yAxis, float zAxis) {
		this.xAxis = xAxis;
		this.yAxis = yAxis;
		this.zAxis = zAxis;
	}

	public float getXAxis() {
		return xAxis;
	}

	public float getYAxis() {
		return yAxis;
	}

	public float getZAxis() {
		return zAxis;
	}

	public static boolean isUuid(UUID uuid) {
		return MY_UUID.equals(uuid);
	}

	public static TokencubeOrientation fromCharacteristic(BluetoothGattCharacteristic characteristic) {
		Integer xValue = characteristic.getIntValue(BluetoothGattCharacteristic.FORMAT_SINT16, 0);
		Integer yValue = characteristic.getIntValue(BluetoothGattCharacteristic.FORMAT_SINT16, 2);
		Integer zValue = characteristic.getIntValue(BluetoothGattCharacteristic.FORMAT_SINT16, 4);
		if (xValue != null && yValue != null && zValue != null) {
			float xAxis = (float)((float)xValue.intValue() / FACTOR);
			float yAxis = (float)((float)yValue.intValue() / FACTOR);
			float zAxis = (float)((float)zValue.intValue() / FACTOR);
			return new TokencubeOrientation(xAxis, yAxis, zAxis);
		}
		else
			throw new RuntimeException("getIntValue retured null");
	}
}
