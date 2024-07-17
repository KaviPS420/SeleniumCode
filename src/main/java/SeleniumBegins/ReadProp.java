package SeleniumBegins;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public final static String CONFIG_FILE_PATH = "./FirstSelenium/src/main/java/SeleniumBegins/config.properties";
	static Properties prop;

	public static void main(String[] args) {

		try {
			FileInputStream ip = new FileInputStream(CONFIG_FILE_PATH);
			prop = new Properties();
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
}}
