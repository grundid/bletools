package de.grundid.ble.fingerprint;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

import org.xmlpull.v1.XmlPullParser;

public class SensorParser {

	private XmlPullParser xmlParser;

	public SensorParser(XmlPullParser xmlParser) {
		this.xmlParser = xmlParser;
	}

	private String getAttribute(String name) {
		return xmlParser.getAttributeValue(null, name);
	}

	public static String toXml(Sensor sensor) {
		StringBuilder sb = new StringBuilder();
		sb.append("<sensor name=\"").append(sensor.getName()).append("\">");
		for (Entry<UUID, Set<UUID>> entry : sensor.getServices()) {
			sb.append("<service uuid=\"").append(entry.getKey().toString()).append("\">");
			for (UUID characteristic : entry.getValue()) {
				sb.append("<characteristic uuid=\"").append(characteristic.toString()).append("\" />");
			}
			sb.append("</service>");
		}
		sb.append("</sensor>");
		return sb.toString();
	}

	public List<Sensor> parseSensors() {
		try {
			List<Sensor> result = new ArrayList<Sensor>();
			int eventType = xmlParser.getEventType();
			while (eventType != XmlPullParser.END_DOCUMENT) {
				if (eventType == XmlPullParser.START_TAG) {
					if ("sensors".equals(xmlParser.getName())) {
						processSensors(result);
					}
				}
				eventType = xmlParser.next();
			}
			return result;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private void processSensors(List<Sensor> result) throws Exception {
		int eventType = 0;
		do {
			eventType = xmlParser.next();
			if (eventType == XmlPullParser.START_TAG) {
				if ("sensor".equals(xmlParser.getName())) {
					result.add(processSensor());
				}
			}
		} while (eventType != XmlPullParser.END_TAG);
	}

	private Sensor processSensor() throws Exception {
		Sensor sensor = new Sensor(getAttribute("name"));
		int eventType = 0;
		do {
			eventType = xmlParser.next();
			if (eventType == XmlPullParser.START_TAG) {
				if ("service".equals(xmlParser.getName())) {
					processService(sensor);
				}
			}
		} while (eventType != XmlPullParser.END_TAG);
		return sensor;
	}

	private void processService(Sensor sensor) throws Exception {
		UUID serviceUuid = UUID.fromString(getAttribute("uuid"));
		sensor.addService(serviceUuid);
		int eventType = 0;
		do {
			eventType = xmlParser.next();
			if (eventType == XmlPullParser.START_TAG) {
				if ("characteristic".equals(xmlParser.getName())) {
					sensor.addCharacteristic(serviceUuid, processCharacteristic());
				}
			}
		} while (eventType != XmlPullParser.END_TAG);
	}

	private UUID processCharacteristic() throws Exception {
		UUID uuid = UUID.fromString(getAttribute("uuid"));
		int eventType = 0;
		do {
			eventType = xmlParser.next();
		} while (eventType != XmlPullParser.END_TAG);
		return uuid;
	}
}
