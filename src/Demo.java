import java.awt.Window.Type;
import static org.junit.Assert.*;

class Book {

	private int Week = 0;
	private double Time = 0;

	public int howMuch(String bookWeek, String time, String phoneNumber, boolean isMember, boolean isHalfPrice)
			throws Exception {
		int result = 0;

		if (!checkWeek(bookWeek) || !checkTime(time) || !CheckPhoneType(phoneNumber)) {
			throw new Exception("資料格式錯誤");
		}
		if (Week == 1) {
			if (Time >= 0 && Time <= 11.5) {
				result = 210;
			} else if (Time >= 12 && Time <= 20.5) {
				result = 180;
			} else {
				result = 150;
			}
		} else if (Week >= 2 && Week <= 4) {
			if (Time >= 12 && Time <= 20.5) {
				result = 180;
			} else {
				result = 150;
			}
		} else if (Week == 5) {
			if (Time <= 11.5) {
				result = 150;
			} else {
				result = 210;
			}
		} else {
			result = 210;
		}

		if (isHalfPrice) {
			result = 100;
		}

		if (isMember) {
			result *= 0.9;
		}
		return result;
	}

	protected boolean CheckPhoneType(String phoneNumber) {
		if (phoneNumber.length() == 10 && phoneNumber.substring(0, 2).equals("09")) {
			return true;
		}
		return false;
	}

	protected boolean checkTime(String time) {

		if (time.length() != 5) {
			return false;
		}

		Time = Double.valueOf(time.substring(0, 2));
		if (time.substring(3).equals("30")) {
			Time += 0.5;
		} else if (time.substring(3).equals("00")) {

		} else {
			return false;
		}

		if (Time == 0 || (Time >= 4 && Time <= 23.5)) {
			return true;
		}
		return false;
	}

	protected boolean checkWeek(String bookWeek) {

		switch (bookWeek) {
		case "一":
			Week = 1;
			break;
		case "二":
			Week = 2;
			break;
		case "三":
			Week = 3;
			break;
		case "四":
			Week = 4;
			break;
		case "五":
			Week = 5;
			break;
		case "六":
			Week = 6;
			break;
		case "日":
			Week = 7;
			break;

		default:
			return false;
		}
		return true;
	}
}
