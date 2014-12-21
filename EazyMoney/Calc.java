import java.util.*;
import java.io.*;
import java.lang.*;

/*
import java.util.*;
import java.text.*;

public class DateDemo {
   public static void main(String args[]) {

      Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

      System.out.println("Current Date: " + ft.format(dNow));
   }
}

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
 
public class GetCurrentDateTime {
  public static void main(String[] args) {
 
	   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	   //get current date time with Date()
	   Date date = new Date();
	   System.out.println(dateFormat.format(date));
 
	   //get current date time with Calendar()
	   Calendar cal = Calendar.getInstance();
	   System.out.println(dateFormat.format(cal.getTime()));
 
  }
}
*/

/*
Jan->feb regnes som jan
Feb->Mar regnes som feb
etc
*/

class Calc{
	public static void main(String[] args) {
		Ex x = new Ex();
		x.run();
	}
}
class Ex{

	HashMap<String, Integer> m_days = new HashMap<String, Integer>();

	final int balance = 5500;
	final int split = 3;
	
	public void run(){
		System.out.println("Please enter: char of month:");
		System.out.printf("Jan - j\nFeb - f\nMar - m\nApr - a\nMay - ma\nJun - ju\nJul - jul\nAug - au\nSept - s\nOkt - o\nNov - n\nDes - d\n");
		
		Scanner sc = new Scanner(System.in);

		
		initHashMap();
		String month = sc.nextLine();
		int days = m_days.get(month);
		
		if(m_days.get(month)==null)	err();

		System.out.println(" ");
		System.out.println("How much money did you spend?");
		
		int spent = sc.nextInt();

		double avgExp = (double) spent / (double) days;

		System.out.println(" ");
		System.out.println("How much is left on the account?");

		int leftOver=sc.nextInt();

		int diff = balance - leftOver;

		int deposit = diff / split;

		System.out.println(" "); 
		System.out.println("Total expenses: " + spent + ".");
		System.out.println("Expenses pr day: " + avgExp + ".");
		System.out.println("Deposit pr. person: " + deposit + ".");
		System.out.println("This calculation was for month: " + month +", and has " + days + " days!");
		System.out.println("Calculations done - exiting!");

	}

	void initHashMap(){
		m_days.put("j", 31);
		m_days.put("f", 28);
		m_days.put("m", 31);
		m_days.put("a", 30);
		m_days.put("ma", 31);
		m_days.put("ju", 30);
		m_days.put("jul", 31);
		m_days.put("au", 31);
		m_days.put("s", 30);
		m_days.put("o", 31);
		m_days.put("n", 30);
		m_days.put("d", 31);
	}

	void err(){
		System.out.println("Error occurred! Fk me!!! \\:\\(");
		System.out.println(" ");
		System.exit(-1);
	}
}