package de.grundid.ble.fingerprint;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.xmlpull.v1.XmlPullParser;

import de.grundid.ble.TestUtils;

public class SensorParserTest {

	@Test
	public void itShouldParseSensors() throws Exception {
		XmlPullParser xmlPullParser = TestUtils.createXmlPullParser("sensors.xml");
		SensorParser parser = new SensorParser(xmlPullParser);
		List<Sensor> sensors = parser.parseSensors();
		assertNotNull(sensors);
		assertEquals(2, sensors.size());
	}
}
