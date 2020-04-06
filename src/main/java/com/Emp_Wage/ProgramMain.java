package com.Emp_Wage;

public class ProgramMain
{
    //main methode
    public static void main(String[] args)
    {
        //creating the emp object
        Employee_Wage emp = new Employee_Wage();
        //call the methode with the help of object
        int Monthely_Wages=emp.Wages_For_Month();
        System.out.println(Monthely_Wages);
    }
}
