public class EmpWageComputation
{
        static final int isFullTime=1;
        static final int EmpRatePerHour=20;


        public static void main(String args [])
        {
		int isPartTime=2;

                int EmpHrs=0;
                int EmpWage = 0;

                double EmpCheck = Math.floor(Math.random() *10) % 3 ;

                  if(EmpCheck == isFullTime)
	{
		System.out.println("Employee is Full-Time");
		EmpHrs=8;
	}	
	else if (EmpCheck == isPartTime)
	{
		System.out.println("Employee is Part-Time");
		EmpHrs=4;
	}
	else
	{
		System.out.println("Employee is Absent");
	}
                EmpWage =EmpHrs * EmpRatePerHour;
                System.out.println("Emp Wage :-"+EmpWage);
        }
}
