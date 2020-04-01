package com.Emp_Wage;

import java.util.Random;
public class Employee_Wage
{
    public int Check_Attendence()
    {
        Random random = new Random();
        int number = random.nextInt(2);
        if (number == 0)
            return 0;
        else
            return 1;
    }

    public int Calculate_Daily_Emoployee_Wages(int employee_wage_per_hour, int full_day_hour)
    {
        return employee_wage_per_hour * full_day_hour;

    }
}
    class mainD
    {
        public static void main(String[] args)
        {
            int EMPLOYEE_WEG_PER_HOUR = 20;
            int FULL_DAY_HOUR = 8;
            int PARTIME_HOUR = 4;
            int ABSENT = 0;
            int EMPLOYEE_PRSENT_OR_ABSENT;
            int PARTIME_OR_FULLTIME;
            int EMPLOYEE_WEGES;
            Employee_Wage emp = new Employee_Wage();
            EMPLOYEE_PRSENT_OR_ABSENT = emp.Check_Attendence();
            if (EMPLOYEE_PRSENT_OR_ABSENT == 0)
            {
                PARTIME_OR_FULLTIME = emp.Check_Attendence();
                if (PARTIME_OR_FULLTIME == 0)
                {
                    EMPLOYEE_WEGES = emp.Calculate_Daily_Emoployee_Wages(EMPLOYEE_WEG_PER_HOUR, FULL_DAY_HOUR);
                }
                else
                {
                    EMPLOYEE_WEGES = emp.Calculate_Daily_Emoployee_Wages(EMPLOYEE_WEG_PER_HOUR, PARTIME_HOUR);
                }
            }
            else
            {
                EMPLOYEE_WEGES = ABSENT;
            }
                System.out.println("Daily Employee Wage is : "+EMPLOYEE_WEGES);

        }
    }
