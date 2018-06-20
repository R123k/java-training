import java.util.Scanner;
class Substring{
public static void main(String[] abc){
String subs,sub;
Scanner in=new Scanner (System.in);
System.out.println("Enter any String");
sub=in.nextLine();
int length=sub.length();
System.out.println("Substring of\""+sub+"\"are");
for( int i=0;i<length;i++)
{
for(int j=1;j<=length-1;j++)
{
subs=sub.substring(i,i+j);

System.out.println(subs);
}}}}
