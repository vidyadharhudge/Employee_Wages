package com.Emp_Wage;

import java.util.Random;

public class Employee_Wage
{
    public static void main(String[] args)
    {
        System.out.println("Welcome To Employee Wage Program");
        Random random=new Random();
        int number=random.nextInt(2);
        if(number==0)
            System.out.println("Employee Is Prsent");
        else
            System.out.println("Employee Is Absent");

    }
}
