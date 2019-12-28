package com.intership.task.exceptionstask;

public class CheckDividing {
    public static void checkDividing(double fn, double sn) throws DividingException{
        if(fn==0||sn==0)
        {
            throw new DividingException(fn,sn);
        }
        else
            System.out.println("Dividing is possible");
    }
}
