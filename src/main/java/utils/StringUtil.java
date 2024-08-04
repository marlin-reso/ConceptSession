package utils;

public class StringUtil {

	//So that no one can create the object of this class.
	private StringUtil() {
	};

	public static String getRandomEmail() {

		return "automation" + System.currentTimeMillis() + "@" + "opencart.com";

	}

}
