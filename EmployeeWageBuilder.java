package employeewage;

public class EmployeeWageBuilder {

	public static final int FullTime=1;
	public static final int PartTime=2;
	public static final int wagePerHour=20;
	public static final int NumOfWorkingDays=20;
	
	public static void main(String[] args) {
		
	   int workingHrs=0;
	   int empWage=0;
	   int totalEmpWage=0;
	   
	   for (int day=0; day<NumOfWorkingDays; day++) {
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
          
		  empWage=workingHrs*wagePerHour;
		  totalEmpWage +=empWage;
		  System.out.println("Employee wage="+empWage);
		  
	      }
	   
          System.out.println("Total employee wage="+totalEmpWage);
	}

}
