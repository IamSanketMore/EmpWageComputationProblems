public class EmpWageComputation
{
	static final int isFullTime=1;
        	static final int EmpRatePerHour=20;


	public static void main(String args [])
	{

		int EmpHrs=0;
		int EmpWage = 0;

		double EmpCheck = Math.floor(Math.random() *10) % 2 ;

		if(EmpCheck == isFullTime)
			EmpHrs=8;

		EmpWage =EmpHrs * EmpRatePerHour;
		System.out.println("Emp Wage :-"+EmpWage);
	}
}
