package de.grundid.ble.gatt;

import android.bluetooth.BluetoothGattCharacteristic;

public class CharacteristicHelper {

	private BluetoothGattCharacteristic characteristic;
	private int propertiesFlag;

	public CharacteristicHelper(BluetoothGattCharacteristic characteristic) {
		this.characteristic = characteristic;
		this.propertiesFlag = characteristic.getProperties();
	}

	public boolean isRead() {
		return isBitSet(BluetoothGattCharacteristic.PROPERTY_READ);
	}

	public boolean isNotify() {
		return isBitSet(BluetoothGattCharacteristic.PROPERTY_NOTIFY);
	}

	public boolean isWrite() {
		return isBitSet(BluetoothGattCharacteristic.PROPERTY_WRITE);
	}

	public boolean isWriteNoResponse() {
		return isBitSet(BluetoothGattCharacteristic.PROPERTY_WRITE_NO_RESPONSE);
	}

	private boolean isBitSet(int bit) {
		return (propertiesFlag & bit) == bit;
	}
}
