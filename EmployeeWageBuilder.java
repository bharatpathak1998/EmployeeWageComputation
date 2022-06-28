package employeewage;

public class EmployeeWageBuilder {

	public static void main(String[] args) {
        int FullTime=1;
        int PartTime=2;
        int wagePerHour=20;
        int workingHrs=0;
        int empWage=0;
        
        double empCheck =Math.floor(Math.random()*10)%3;
        
        if (empCheck==FullTime)
        {   workingHrs=8;
        	System.out.println("Employee is Present Full Time");
        	
        }
        else
        
        if (empCheck==PartTime)
        {   workingHrs=4;
        	System.out.println("Employee is Present Part Time");
        	
        }
        else	
        {   workingHrs=0;
        	System.out.println("Employee is Absent");
        }
        
		empWage=wagePerHour*workingHrs;
		System.out.println("Employee wage = "+empWage);
			
	}

}
