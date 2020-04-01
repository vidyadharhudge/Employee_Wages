package com.Emp_Wage;
import java.util.Random;
public class Employee_Wage
{
    int countDays;
    int WORKINGDAYS;
    int Employee_Monthly_Wages;
    int EMPLOYEE_WEGES;
    int HOURS;
    int TOTAL_MONTHLY_WORKING_DAYS;

    public Employee_Wage()
    {
        countDays=0;
        WORKINGDAYS=20;
        HOURS=0;
        TOTAL_MONTHLY_WORKING_DAYS=100;
        Employee_Monthly_Wages=0;
        EMPLOYEE_WEGES=0;
    }
    public int Check_Attendence()
     {
        Random random = new Random();
        int number = random.nextInt(2);
        if (number == 0)
             return 0;
        else
             return 1;
     }
    public int Calculate_Daily_Emoployee_Wages ( int employee_wage_per_hour, int full_day_hour)
     {
             return employee_wage_per_hour * full_day_hour;

     }
        public int Wages_For_Month (int EMPLOYEE_WEG_PER_HOUR, int FULL_DAY_HOUR, int PARTIME_HOUR, int ABSENT)
        {
            int EMPLOYEE_PRSENT_OR_ABSENT=0;
            int Working_Hours=0;
            int Total_Working_Hours=0;
            int countDays=0;
            int arr[]=new int[20];
            while (countDays!=WORKINGDAYS && HOURS!=TOTAL_MONTHLY_WORKING_DAYS)
            {
                EMPLOYEE_PRSENT_OR_ABSENT = this.Check_Attendence();
                switch (EMPLOYEE_PRSENT_OR_ABSENT)
                {
                    case 0:
                                       Working_Hours=getWorkingHour(FULL_DAY_HOUR,PARTIME_HOUR);
                                       Total_Working_Hours+=Working_Hours;
                                       EMPLOYEE_WEGES = this.Calculate_Daily_Emoployee_Wages(EMPLOYEE_WEG_PER_HOUR, Working_Hours);
                                       break;
                    case 1:
                                       EMPLOYEE_WEGES = ABSENT;
                                       break;
                }
                arr[countDays]=EMPLOYEE_WEGES;

                countDays++;


                Employee_Monthly_Wages+=EMPLOYEE_WEGES;


            }
                for (int i=0;i<20;i++)
                {
                    System.out.println("Daily Wages are : "+arr[i]);
                    System.out.println("days "+i+"= "+"DailyWagesAre : "+arr[i]);

                }
                System.out.println();
                System.out.println("Total Wages Are : "+Employee_Monthly_Wages+ "\nTotal days are : "+countDays + "\nTotal Hours Are : " +Total_Working_Hours);
                return Employee_Monthly_Wages;
            }

    public int getWorkingHour(int full_day_hour, int partime_hour)
    {
        int PARTIME_OR_FULL_TIME=0;
        PARTIME_OR_FULL_TIME=this.Check_Attendence();
        switch (PARTIME_OR_FULL_TIME)
        {
            case 0 :
                      HOURS=full_day_hour;
                      break;
            case 1 :
                      HOURS=partime_hour;
                      break;
            default:
                      break;
        }
        return HOURS;

    }
}
        class mainD
        {
          public static void main(String[] args)
          {
            int EMPLOYEE_WEG_PER_HOUR = 20;
            int FULL_DAY_HOUR = 8;
            int PARTIME_HOUR = 4;
            int ABSENT=0;
            Employee_Wage emp = new Employee_Wage();
            int Monthely_Wages=emp.Wages_For_Month(EMPLOYEE_WEG_PER_HOUR,FULL_DAY_HOUR,PARTIME_HOUR,ABSENT);
            System.out.println(Monthely_Wages);


          }
       }

