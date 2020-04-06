package com.Emp_Wage;

import java.util.Random;

public class Employee_Wage implements Wages
{
    static private int countDays=0;
    static private int WORKINGDAYS=20;
    static private int Employee_Monthly_Wages=0;
    static private int EMPLOYEE_WEGES=0;
    private int HOURS=0;
    static private int TOTAL_MONTHLY_WORKING_DAYS=100;
    static private int EMPLOYEE_WEG_PER_HOUR = 20;
    static private int FULL_DAY_HOUR = 8;
    static private int PARTIME_HOUR = 4;
    static private int ABSENT=0;
    //function is used for check the attendence of employee
    public int Check_Attendence()
    {
        Random attendence = new Random();
        int check_Attendence = attendence.nextInt(2);
        if (check_Attendence == 0)
            return 0;
        else
            return 1;
    }
    //function is used for the calculating daily employee wages and passing parameter as working hour
    public int Calculate_Daily_Emoployee_Wages ( int Working_Hours)
    {
        return EMPLOYEE_WEG_PER_HOUR * Working_Hours;

    }
    //function is used for calculating the employee wages for month
    public int Wages_For_Month ()
    {
        int EMPLOYEE_PRSENT_OR_ABSENT=0;
        int Working_Hours=0;
        int Total_Working_Hours=0;
        int countDays=0;
        int arr[]=new int[20];
        //while condition for Days and Hours
        while (countDays!=WORKINGDAYS && HOURS!=TOTAL_MONTHLY_WORKING_DAYS)
        {
            EMPLOYEE_PRSENT_OR_ABSENT = this.Check_Attendence();
            switch (EMPLOYEE_PRSENT_OR_ABSENT)
            {
                case 0:
                    Working_Hours=getWorkingHour();
                    System.out.println(Working_Hours);
                    Total_Working_Hours+=Working_Hours;
                    EMPLOYEE_WEGES = this.Calculate_Daily_Emoployee_Wages(Working_Hours);
                    break;
                case 1:
                    EMPLOYEE_WEGES = ABSENT;
                    break;
            }
            //store the employee wages in array
            arr[countDays]=EMPLOYEE_WEGES;
            //counting the days
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

    //function for getting the working hour
    public int getWorkingHour()
    {
        int PARTIME_OR_FULL_TIME=0;
        //calling the methode with the help of current invocking object
        PARTIME_OR_FULL_TIME=this.Check_Attendence();
        //switch case for partime and fulltime
        switch (PARTIME_OR_FULL_TIME)
        {
            case 0 :
                HOURS=FULL_DAY_HOUR;
                break;
            case 1 :

                HOURS=PARTIME_HOUR;
                break;
            default:
                break;
        }
        return HOURS;

    }
}
