public class EmployeeWage
{

	public static void main(String args[])

         {

		 // CONSTANTS
		int isPartTime=1;
	         int isFullTime=2;
		int empRatePerHrs=20;

		//VARIABLES
		int empHrs=0;
		int empWage=0;

		//COMPUTATION
		int empCheck = (int)( Math.random() * 10 ) % 3;

		if ( empCheck == isPartTime )
			empHrs=4;

		else if ( empCheck == isFullTime )
			empHrs=8;

		else
			empHrs=0; 

		empWage=empHrs * empRatePerHr;
		System.out.println("Employee Wage:" + empWage);
	}
}
