package utilityLayer;

import java.io.FileInputStream;
import java.util.Properties;

import baseLayer.BaseClass;

public class PropertyReader extends BaseClass {
	private Properties prop;

	public String getProperty(String key) {
		
		String path = System.getProperty("user.dir") + "//src//main//java//configurationLayer//config.properties";

		try {
			FileInputStream fis = new FileInputStream(path);

			prop = new Properties();

			prop.load(fis);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return prop.getProperty(key);

	}

}
