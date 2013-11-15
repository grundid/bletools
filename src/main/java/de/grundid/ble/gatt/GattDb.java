package de.grundid.ble.gatt;

import java.util.ArrayList;
import java.util.List;

public class GattDb {

	// FIXME convert all UUIDs to lower case
	private static List<GattService> gattServices = new ArrayList<GattService>();
	private static List<GattCharacteristic> gattCharacteristics = new ArrayList<GattCharacteristic>();
	static {
		gattCharacteristics.add(new GattCharacteristic("Alert Category ID",
				"org.bluetooth.characteristic.alert_category_id", "00002A43-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Alert Category ID Bit Mask",
				"org.bluetooth.characteristic.alert_category_id_bit_mask", "00002A42-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Alert Level", "org.bluetooth.characteristic.alert_level",
				"00002A06-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics
				.add(new GattCharacteristic("Alert Notification Control Point",
						"org.bluetooth.characteristic.alert_notification_control_point",
						"00002A44-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Alert Status", "org.bluetooth.characteristic.alert_status",
				"00002A3F-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Appearance", "org.bluetooth.characteristic.gap.appearance",
				"00002A01-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Battery Level", "org.bluetooth.characteristic.battery_level",
				"00002A19-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Blood Pressure Feature",
				"org.bluetooth.characteristic.blood_pressure_feature", "00002A49-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Blood Pressure Measurement",
				"org.bluetooth.characteristic.blood_pressure_measurement", "00002A35-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Body Sensor Location",
				"org.bluetooth.characteristic.body_sensor_location", "00002A38-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Boot Keyboard Input Report",
				"org.bluetooth.characteristic.boot_keyboard_input_report", "00002A22-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Boot Keyboard Output Report",
				"org.bluetooth.characteristic.boot_keyboard_output_report", "00002A32-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Boot Mouse Input Report",
				"org.bluetooth.characteristic.boot_mouse_input_report", "00002A33-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("CSC Feature", "org.bluetooth.characteristic.csc_feature",
				"00002A5C-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("CSC Measurement",
				"org.bluetooth.characteristic.csc_measurement", "00002A5B-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Current Time", "org.bluetooth.characteristic.current_time",
				"00002A2B-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Cycling Power Control Point",
				"bluetooth.characteristic.cycling_power_control_point", "00002A66-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Cycling Power Feature",
				"org.bluteooth.characteristic.cycling_power_feature", "00002A65-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Cycling Power Measurement",
				"org.blueeooth.cycling_power_measurement", "00002A63-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Cycling Power Vector",
				"org.bluetooth.characteristic.cycling_power_vector", "00002A64-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Date Time", "org.bluetooth.characteristic.date_time",
				"00002A08-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Day Date Time", "org.bluetooth.characteristic.day_date_time",
				"00002A0A-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Day of Week", "org.bluetooth.characteristic.day_of_week",
				"00002A09-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Device Name", "org.bluetooth.characteristic.gap.device_name",
				"00002A00-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("DST Offset", "org.bluetooth.characteristic.dst_offset",
				"00002A0D-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Exact Time 256", "org.bluetooth.characteristic.exact_time_256",
				"00002A0C-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Firmware Revision String",
				"org.bluetooth.characteristic.firmware_revision_string", "00002A26-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Glucose Feature",
				"org.bluetooth.characteristic.glucose_feature", "00002A51-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Glucose Measurement",
				"org.bluetooth.characteristic.glucose_measurement", "00002A18-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Glucose Measurement Context",
				"org.bluetooth.characteristic.glucose_measurement_context", "00002A34-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Hardware Revision String",
				"org.bluetooth.characteristic.hardware_revision_string", "00002A27-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Heart Rate Control Point",
				"org.bluetooth.characteristic.heart_rate_control_point", "00002A39-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Heart Rate Measurement",
				"org.bluetooth.characteristic.heart_rate_measurement", "00002A37-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("HID Control Point",
				"org.bluetooth.characteristic.hid_control_point", "00002A4C-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("HID Information",
				"org.bluetooth.characteristic.hid_information", "00002A4A-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("IEEE 11073-20601 Regulatory Certification Data List",
				"org.bluetooth.characteristic.ieee_11073-20601_regulatory_certification_data_list",
				"00002A2A-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Intermediate Cuff Pressure",
				"org.bluetooth.characteristic.intermediate_blood_pressure", "00002A36-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Intermediate Temperature",
				"org.bluetooth.characteristic.intermediate_temperature", "00002A1E-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("LN Control Point", "org.bluetooth.ln_control_point",
				"00002A6B-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("LN Feature", "org.bluetooth.characteristic.ln_feature",
				"00002A6A-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Local Time Information",
				"org.bluetooth.characteristic.local_time_information", "00002A0F-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Location and Speed", "org.bluetooth.location_and_speed",
				"00002A67-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Manufacturer Name String",
				"org.bluetooth.characteristic.manufacturer_name_string", "00002A29-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Measurement Interval",
				"org.bluetooth.characteristic.measurement_interval", "00002A21-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Model Number String",
				"org.bluetooth.characteristic.model_number_string", "00002A24-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Navigation", "org.bluetooth.characteristic.navigation",
				"00002A68-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("New Alert", "org.bluetooth.characteristic.new_alert",
				"00002A46-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Peripheral Preferred Connection Parameters",
				"org.bluetooth.characteristic.gap.peripheral_preferred_connection_parameters",
				"00002A04-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Peripheral Privacy Flag",
				"org.bluetooth.characteristic.gap.peripheral_privacy_flag", "00002A02-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("PnP ID", "org.bluetooth.characteristic.pnp_id",
				"00002A50-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Position Quality", "org.bluetooth.position_quality",
				"00002A69-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Protocol Mode", "org.bluetooth.characteristic.protocol_mode",
				"00002A4E-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Reconnection Address",
				"org.bluetooth.characteristic.gap.reconnection_address", "00002A03-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Record Access Control Point",
				"org.bluetooth.characteristic.record_access_control_point", "00002A52-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Reference Time Information",
				"org.bluetooth.characteristic.reference_time_information", "00002A14-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Report", "org.bluetooth.characteristic.report",
				"00002A4D-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Report Map", "org.bluetooth.characteristic.report_map",
				"00002A4B-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Ringer Control Point",
				"org.bluetooth.characteristic.ringer_control_point", "00002A40-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Ringer Setting", "org.bluetooth.characteristic.ringer_setting",
				"00002A41-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("RSC Feature", "org.bluetooth.characteristic.rsc_feature",
				"00002A54-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("RSC Measurement",
				"org.bluetooth.characteristic.rsc_measurement", "00002A53-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("SC Control Point",
				"org.bluetooth.characteristic.sc_control_point", "00002A55-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Scan Interval Window",
				"org.bluetooth.characteristic.scan_interval_window", "00002A4F-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Scan Refresh", "org.bluetooth.characteristic.scan_refresh",
				"00002A31-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Sensor Location",
				"org.bluetooth.characteristic.sensor_location", "00002A5D-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Serial Number String",
				"org.bluetooth.characteristic.serial_number_string", "00002A25-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Service Changed",
				"org.bluetooth.characteristic.gatt.service_changed", "00002A05-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Software Revision String",
				"org.bluetooth.characteristic.software_revision_string", "00002A28-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Supported New Alert Category",
				"org.bluetooth.characteristic.supported_new_alert_category", "00002A47-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics
				.add(new GattCharacteristic("Supported Unread Alert Category",
						"org.bluetooth.characteristic.supported_unread_alert_category",
						"00002A48-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("System ID", "org.bluetooth.characteristic.system_id",
				"00002A23-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Temperature Measurement",
				"org.bluetooth.characteristic.temperature_measurement", "00002A1C-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Temperature Type",
				"org.bluetooth.characteristic.temperature_type", "00002A1D-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Time Accuracy", "org.bluetooth.characteristic.time_accuracy",
				"00002A12-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Time Source", "org.bluetooth.characteristic.time_source",
				"00002A13-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Time Update Control Point",
				"org.bluetooth.characteristic.time_update_control_point", "00002A16-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Time Update State",
				"org.bluetooth.characteristic.time_update_state", "00002A17-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Time with DST", "org.bluetooth.characteristic.time_with_dst",
				"00002A11-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Time Zone", "org.bluetooth.characteristic.time_zone",
				"00002A0E-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Tx Power Level", "org.bluetooth.characteristic.tx_power_level",
				"00002A07-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Unread Alert Status",
				"org.bluetooth.characteristic.unread_alert_status", "00002A45-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Advertising Interval", "",
				"00002b30-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Acceleration/Orientation", "",
				"00002b20-0000-1000-8000-00805f9b34fb"));
		gattCharacteristics.add(new GattCharacteristic("Temperature", "", "00002b10-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Alert Notification Service", "org.bluetooth.service.alert_notification",
				"00001811-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Battery Service", "org.bluetooth.service.battery_service",
				"0000180F-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Blood Pressure", "org.bluetooth.service.blood_pressure",
				"00001810-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Current Time Service", "org.bluetooth.service.current_time",
				"00001805-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Cycling Power", "org.bluetooth.service.cycling_power",
				"00001818-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Cycling Speed and Cadence",
				"org.bluetooth.service.cycling_speed_and_cadence", "00001816-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Device Information", "org.bluetooth.service.device_information",
				"0000180A-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Generic Access", "org.bluetooth.service.generic_access",
				"00001800-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Generic Attribute", "org.bluetooth.service.generic_attribute",
				"00001801-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Glucose", "org.bluetooth.service.glucose",
				"00001808-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Health Thermometer", "org.bluetooth.service.health_thermometer",
				"00001809-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Heart Rate", "org.bluetooth.service.heart_rate",
				"0000180D-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Human Interface Device", "org.bluetooth.service.human_interface_device",
				"00001812-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Immediate Alert", "org.bluetooth.service.immediate_alert",
				"00001802-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Link Loss", "org.bluetooth.service.link_loss",
				"00001803-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Location and Navigation", "org.bluetooth.service.location_and_navigation",
				"00001819-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Next DST Change Service", "org.bluetooth.service.next_dst_change",
				"00001807-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Phone Alert Status Service", "org.bluetooth.service.phone_alert_status",
				"0000180E-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Reference Time Update Service",
				"org.bluetooth.service.reference_time_update", "00001806-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Running Speed and Cadence",
				"org.bluetooth.service.running_speed_and_cadence", "00001814-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Scan Parameters", "org.bluetooth.service.scan_parameters",
				"00001813-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Tx Power", "org.bluetooth.service.tx_power",
				"00001804-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Advertising Interval Service", "", "00001930-0000-1000-8000-00805f9b34fb"));
		gattServices.add(new GattService("Temperature Service", "", "00001910-0000-1000-8000-00805f9b34fb"));
		gattServices
				.add(new GattService("Acceleration/Orientation Service", "", "00001920-0000-1000-8000-00805f9b34fb"));
	}

	public static List<GattService> getGattServices() {
		return gattServices;
	}

	public static List<GattCharacteristic> getGattCharacteristics() {
		return gattCharacteristics;
	}
}
