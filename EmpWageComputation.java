public class EmpWageComputation
{
        public static final int isFullTime=1;
        public static final int EmpRatePerHour=20;
        public static final int isPartTime=2;
	public static final int NumOfWorkingDays=2;

        public static void main(String args [])
        {

                int EmpHrs=0;
                int EmpWage = 0;
		int TotalEmpWage=0;

               // double EmpCheck = (int)Math.floor(Math.random() *10) % 3 ;

		for(int day = 0; day < NumOfWorkingDays; day++ )
		{
			int EmpCheck = (int)Math.floor(Math.random() *10) % 3 ;

                	switch (EmpCheck)
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
					EmpHrs=0;
                                	break;

                	}
                EmpWage =EmpHrs * EmpRatePerHour;
                TotalEmpWage += EmpWage;
		System.out.println("Emp Wage :-"+EmpWage);
        	}
		System.out.println("Total EmpWage:" + TotalEmpWage);
	}
}
