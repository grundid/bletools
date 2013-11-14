package de.grundid.ble;

import java.io.InputStream;

import org.kxml2.io.KXmlParser;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class TestUtils {

	public static XmlPullParser createXmlPullParser(String resourceName) {
		try {
			InputStream inputStream = TestUtils.class.getClassLoader().getResourceAsStream(resourceName);
			KXmlParser parser = new KXmlParser();
			parser.setInput(inputStream, "utf8");
			return parser;
		}
		catch (XmlPullParserException e) {
			throw new RuntimeException(e);
		}
	}
}
