package employeewage;

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		//use case 1:check employee attendance
		//CONSTANTS
		int IS_PRESENT=1;
		int wagePerHour=20;
		int workingHrs=8;
		double empCheck=Math.floor(Math.random()*10)%2;
		
		if(empCheck==IS_PRESENT) {
		//use case 2:employee daily wage
			int empWage=wagePerHour*workingHrs;
			
			System.out.println("Employee is present");
			System.out.println("Employee wage = "+empWage);
		}
		else {
			System.out.println("Employee is absent");
		}

	}

}
