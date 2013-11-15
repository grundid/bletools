package de.grundid.ble.sensors.tokencube;

import java.util.UUID;

import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import de.grundid.ble.utils.BleUtils;

public class TokencubeTemperature implements Parcelable {

	private static final double FACTOR = 0.00390625;
	private static final UUID MY_UUID = UUID.fromString("00002b10-0000-1000-8000-00805f9b34fb");
	private float temperature;
	public static final Parcelable.Creator<TokencubeTemperature> CREATOR = new Parcelable.Creator<TokencubeTemperature>() {

		@Override
		public TokencubeTemperature createFromParcel(Parcel source) {
			return new TokencubeTemperature(source);
		}

		@Override
		public TokencubeTemperature[] newArray(int size) {
			return new TokencubeTemperature[size];
		}
	};

	private TokencubeTemperature(Parcel source) {
		this.temperature = source.readFloat();
	}

	public TokencubeTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getTemperature() {
		return temperature;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeFloat(temperature);
	}

	public static boolean isUuid(UUID uuid) {
		return MY_UUID.equals(uuid);
	}

	public static TokencubeTemperature fromCharacteristic(BluetoothGattCharacteristic characteristic) {
		byte[] byteValue = characteristic.getValue();
		Log.i("BLE", "ByteValue: " + BleUtils.convertBinToASCII(byteValue));
		Integer value = characteristic.getIntValue(BluetoothGattCharacteristic.FORMAT_SINT16, 0);
		Log.i("BLE", "Value: " + value);
		if (value != null) {
			float temp = (float)(FACTOR * value.intValue());
			return new TokencubeTemperature(temp);
		}
		else
			throw new RuntimeException("getIntValue retured null");
	}
}
