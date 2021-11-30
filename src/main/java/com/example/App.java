package com.example;
import java.util.*;
import  com.third.ThirdFile;
import  org.joda.time.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
        // String date = new DateFormatUtils();
        System.out.println( "Hello World!" );
        System.out.println("x from app.java"+ " "+ SecondFile.x);
        ThirdFile t = new ThirdFile();
        t.printWorld();
        Date d = new Date();
        DateTime dt = new DateTime(d);
        System.out.println("data is"+ " " + dt.getMonthOfYear());
    }
}
