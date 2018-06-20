import java.util.Scanner;
class Occurance{
public static void main(String[] abc){

Scanner s=new Scanner (System.in);
System.out.print("Enter first string");
String a=s.nextLine();
System.out.print("Enter second string");
String b=s.nextLine();
boolean v=a.contains(b);
if(v==true)

System.out.println( "yes");

else 

System.out.println("no");
}}
