public class EmpWageComputation
{
        public static final int isFullTime=1;
        public static final int EmpRatePerHour=20;
	public static final int isPartTime=2;


        public static void main(String args [])
        {

                int EmpHrs=0;
                int EmpWage = 0;

                double EmpCheck = Math.floor(Math.random() *10) % 3 ;

	switch ((int)EmpCheck)
	{
               	case isFullTime :
		System.out.println("Employee is Full-Time");
                        	EmpHrs=8;
		break;

                	case isPartTime :
		System.out.println("Employee is Part-Time");
                        	EmpHrs=4;
		break;

                	default :
                        	System.out.println("Employee is Absent");
		break;

	}
                EmpWage =EmpHrs * EmpRatePerHour;
                System.out.println("Emp Wage :-"+EmpWage);
        }
}
