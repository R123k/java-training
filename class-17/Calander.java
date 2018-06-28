
import java.util.*;

import java.util.Scanner;

import java.util.HashMap;

 class Calander{

	 public static void main(String args[]){

	    HashMap<Integer,String> date = new HashMap<Integer,String>();

		date.put(01,"First");

		date.put(02,"Second");

		date.put(03,"third");

		date.put(04,"Four");

		date.put(05,"Five");

		date.put(06,"Six");

		date.put(07,"Seven");

		date.put(8,"Eight");

		date.put(9,"Nine");

		date.put(10,"Ten");

		date.put(11,"Eleven");

		date.put(12,"Tweleve");

		date.put(13,"Thirteen");

		date.put(14,"Fourteen");

		date.put(15,"Fifteen");

		date.put(16,"Sixteen");

		date.put(17,"Seventeen");

		date.put(18,"Eigthteen");

		date.put(19,"Nineteen");

		date.put(20,"Twenty");

		date.put(21,"Twenty one");

		date.put(22,"Twenty Two");

		date.put(23,"Twenty Three");

		date.put(24,"Twenty Foue");

		date.put(25,"Twenty Five");

		date.put(26,"Twenty Six");

		date.put(27,"Twenty Seven");

		date.put(28,"Twenty Eight");

		date.put(29,"Twenty Nine");

		date.put(30,"Thirty");

		date.put(31,"Thirty First");

		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Date");

		int z = sc.nextInt();

		String d = date.get(z);

		

		HashMap<Integer,String>month=new HashMap<Integer,String>();

		month.put(01,"January");

		month.put(02,"Feburary");

		month.put(03,"March");

		month.put(04,"April");

		month.put(05,"May");

		month.put(06,"June");

		month.put(07,"July");

		month.put(8,"August");

		month.put(9,"September");

		month.put(10,"October");

		month.put(11,"November");

		month.put(12,"December");

		

		System.out.println("Enter Month");

		int m = sc.nextInt();

		String mo = month.get(m);

		

		HashMap<Integer,String>year=new HashMap<Integer,String>();

		

		year.put(2001,"Two Thousand one");

		year.put(2002,"Two Thousand Two");

		year.put(2003,"Two Thousand Three");

		year.put(2004,"Two Thousand Four");

		year.put(2005,"Two Thousand Five");

		year.put(2006,"Two Thousand Six");

		year.put(2007,"Two Thousand Seven");

		year.put(2008,"Two Thousand Eight");

		year.put(2009,"Two Thousand Nine");

		year.put(2010,"Two Thousand Ten");

		

		

		System.out.println("Enter Year");

		int ye = sc.nextInt();

		String l = year.get(ye);

		

		System.out.print(d+" "+mo+" "+l);

	 }

}
