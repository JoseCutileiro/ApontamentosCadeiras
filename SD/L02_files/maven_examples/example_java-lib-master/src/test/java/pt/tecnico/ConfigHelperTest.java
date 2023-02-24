package pt.tecnico;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;


/**
 * Unit tests for ConfigHelper.
 */
public class ConfigHelperTest {

	@Test
	public void testPrintProperties() {
		ConfigHelper config = new ConfigHelper();
		config.printProperties();
		// no easy way to check output
		// assume it is OK if it does not throw an exception
	}

	@Test
	public void testGetExistingProperty() {
		ConfigHelper config = new ConfigHelper();
		String value = config.getValue("max");
		assertNotNull(value);
		/* expected value, actual value */
		assertEquals("200", value);
	}

	@Test
	public void testGetFilteredProperty() {
		ConfigHelper config = new ConfigHelper();
		String value = config.getValue("max");
		assertNotNull(value);
		/* expected value, actual value */
		assertEquals("200", value);
	}

	@Test
	public void testGetMissingProperty() {
		ConfigHelper config = new ConfigHelper();
		String value = config.getValue("not_there");
		assertNull(value);
	}

}
