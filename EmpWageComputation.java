public class EmpWageComputation
{
        public static final int isFullTime=1;
        public static final int EmpRatePerHour=20;
        public static final int isPartTime=2;
        public static final int NumOfWorkingDays=20;
	public static final int MaxHrsInMonth=100;
        public static void main(String args [])
        {

                int EmpWage = 0;
                int TotalEmpWage=0;
		int TotalWorkingDays=0;
		int TotalEmpHrs=0;
               // double EmpCheck = (int)Math.floor(Math.random() *10) % 3 ;

		while(TotalEmpHrs <= MaxHrsInMonth && TotalWorkingDays < NumOfWorkingDays)
                {
			int EmpHrs =0;
			TotalWorkingDays++;

                        int EmpCheck = (int)Math.floor(Math.random() *10) % 3 ;

                        switch (EmpCheck)
                        {
                                case isFullTime :
                                        EmpHrs=8;
                                        break;

                                 case isPartTime :
                                        EmpHrs=4;
                                        break;

                                default :
					EmpHrs=0;
                                        break;

                        }
			TotalEmpHrs +=EmpHrs;
	                System.out.println("Day:" + TotalWorkingDays +"Emp Hr:-"+EmpHrs);
                }
		TotalEmpWage=TotalEmpHrs * EmpRatePerHour;
                System.out.println("Total EmpWage:" + TotalEmpWage);

        }
}
