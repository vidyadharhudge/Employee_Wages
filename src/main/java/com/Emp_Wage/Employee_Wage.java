package com.Emp_Wage;
import java.util.Random;
public class Employee_Wage
{
    int countDays;
    int workingDays;
    int Employee_Monthly_Wages;
    int EMPLOYEE_WEGES;

    public Employee_Wage()
    {
    countDays=0;
    workingDays=20;
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
        public int Wages_For_Month ( int EMPLOYEE_WEG_PER_HOUR,int FULL_DAY_HOUR,int PARTIME_HOUR,int ABSENT)
        {
            int EMPLOYEE_PRSENT_OR_ABSENT=0;
            int PARTIME_OR_FULLTIME=0;
            while (countDays<workingDays)
            {
                EMPLOYEE_PRSENT_OR_ABSENT = this.Check_Attendence();
                switch (EMPLOYEE_PRSENT_OR_ABSENT)
                {
                    case 0:
                            PARTIME_OR_FULLTIME = this.Check_Attendence();
                            switch (PARTIME_OR_FULLTIME)
                            {
                               case 0:
                                       EMPLOYEE_WEGES = this.Calculate_Daily_Emoployee_Wages(EMPLOYEE_WEG_PER_HOUR, FULL_DAY_HOUR);
                                       break;

                               case 1:
                                       EMPLOYEE_WEGES = this.Calculate_Daily_Emoployee_Wages(EMPLOYEE_WEG_PER_HOUR, PARTIME_HOUR);
                                       break;

                                default:
                                       break;
                            }
                            break;
                    case 1:
                            EMPLOYEE_WEGES = ABSENT;
                            break;
                }
                Employee_Monthly_Wages+=EMPLOYEE_WEGES;
                countDays++;
            }
                return Employee_Monthly_Wages;
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
            System.out.println("Total Monthly Wages Are: "+Monthely_Wages);
          }
       }
