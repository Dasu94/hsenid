package com.mycompany.app;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        LocalTime currentTime = new LocalTime();
        DateTime today = new DateTime();
		System.out.println("The current local time is: " + currentTime +"\n Date : "+today.toString("yyyy-MMM-dd"));

		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());

    }
}
