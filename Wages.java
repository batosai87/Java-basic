
public class Wages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double regularWages;
		double basePay = 25;
		double regularHours = 40;
		double overtimeWages;
		double overtimePay = 37.5;
		double overtimeHours = 10;
		double totalWages;
		
		regularWages = basePay *  regularHours;
		overtimeWages = overtimePay * overtimeHours;
		totalWages = regularHours + overtimeWages;
		System.out.println("Wages for this week are $" + totalWages);
	}
}
