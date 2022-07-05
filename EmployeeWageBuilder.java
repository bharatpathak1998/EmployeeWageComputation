package employeewage;

public class EmployeeWageBuilder {
	
	public static final int FullTime=1;
	public static final int PartTime=2;
	public static final int wagePerHour=20;
	public static final int NumOfWorkingDays=20;
	public static final int MaxWorkingHrs=100;

	public static void main(String[] args) {
		
		int workingHrs=0, totalWorkingHrs=0, totalWorkingDays=0;
		while (totalWorkingHrs<=MaxWorkingHrs && totalWorkingDays<=NumOfWorkingDays) {
			totalWorkingDays++;
			int empCheck=(int)Math.floor(Math.random()*10)%3;
			switch (empCheck) {
			case FullTime:
				workingHrs=8;
				break;
				
			case PartTime:
				workingHrs=4;
				break;
				
			default:
				workingHrs=0;
			}
			totalWorkingHrs +=workingHrs;
		    System.out.println("Day "+totalWorkingDays+" Employee working hours= "+workingHrs);
			}
		int totalEmpWage = totalWorkingHrs * wagePerHour;
		System.out.println("Total Emp Wage: " + totalEmpWage);
	}
}
