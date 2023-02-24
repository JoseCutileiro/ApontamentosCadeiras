package pt.tecnico;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

/** Configuration helper. Helps an application load configuration values from a properties file. */
public class ConfigHelper {

	/** This is the object that holds the properties. */
	private Properties _properties;

	/** Lookup properties in resource path and parse the file. */
	public ConfigHelper(final String resourcePath) {
		try {
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(resourcePath);	
			_properties = new Properties();
			_properties.load(inputStream);
		} catch (IOException e) {
			System.out.printf("Failed to load configuration: %s%n", e);
		}
	}

	/** Lookup properties in default resource path. */
	public ConfigHelper() {
		this("config.properties");
	}

	/** Get property value from loaded properties. */
	public String getValue(String configName) {
		String value = _properties.getProperty(configName);
		return value;
	}

	/** Print the loaded properties. */
	public void printProperties() {
		// load configuration properties
		System.out.printf("Loaded %d properties%n", _properties.size());

		final Enumeration keys = _properties.keys();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			String value = (String) _properties.get(key);
			System.out.println(key + ": " + value);
		}
	}

}

