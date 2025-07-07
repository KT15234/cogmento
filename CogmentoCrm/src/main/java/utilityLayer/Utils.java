package utilityLayer;

import java.text.SimpleDateFormat;
import java.util.Date;

import baseLayer.BaseClass;

public class Utils extends BaseClass {

	public String getDateAndTime(String dateTimeFormat) {

		return new SimpleDateFormat(dateTimeFormat).format(new Date());

	}

}
