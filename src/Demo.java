import java.awt.Window.Type;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "11:30";
		System.out.println(a.substring(0,2));
		System.out.println(Double.valueOf(a.substring(0,2)));
	}

}

class Book {
	
	private int Week = 0;
	private double Time = 0;
	
	
	public double howMuch(String bookWeek, String time, String phoneNumber, boolean isMember, boolean isHalfPrice){
		double result = 0;
		
		if(checkWeek(bookWeek) && checkTime(time) && CheckPhoneType(phoneNumber)){
			
		}
		
		if(isMember){
			result *= 0.9;
		}
		return result;
	}

	protected boolean CheckPhoneType(String phoneNumber) {
		if(phoneNumber.length() == 10 && phoneNumber.substring(0, 2).equals("09")){
			return true;
		}
		return false;
	}

	protected boolean checkTime(String time) {
		
		Time = Double.valueOf(time.substring(0, 2));
		if(time.substring(3).equals("30")){
			Time += 0.5;
		}else if(time.substring(3).equals("00")){
			
		}else{
			return false;
		}
		
		if(Time >= 0 && Time <= 23.5){
			return true;
		}
		return false;
	}

	protected boolean checkWeek(String bookWeek) {
		
		switch (bookWeek) {
		case "�@":
			Week = 1;
			break;
		case "�G":
			Week = 2;
			break;
		case "�T":
			Week = 3;
			break;
		case "�|":
			Week = 4;
			break;
		case "��":
			Week = 5;
			break;
		case "��":
			Week = 6;
			break;
		case "��":
			Week = 7;
			break;

		default:
			return false;
		}
		return true;
	}
}
