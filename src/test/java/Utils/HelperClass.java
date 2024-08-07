package Utils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.lang3.RandomStringUtils;

public class HelperClass {

	public static String generateRandomText() {
		String text = "";
		String Alpha = RandomStringUtils.randomAlphanumeric(6);
		text = Alpha;
		return text;
	}
	public static String generateRandomEmail() {
		String email = "";
		String Alpha = RandomStringUtils.randomAlphanumeric(4);
		String num = RandomStringUtils.randomNumeric(2);
		email = Alpha + num + "@test.com";
		return email;
	}

	public static String generateRandomNum() {
		String Number = "";
		String num = RandomStringUtils.randomNumeric(10);
		Number = num;
		return Number;
	}

	public static int getResponseCode(String urlString) {
		int responseCode = 0;
		try {
			URL url = new URL(urlString);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();
			responseCode = connection.getResponseCode();
			connection.disconnect();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return responseCode;
	}
}