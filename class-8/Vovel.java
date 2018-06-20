import java.util.Scanner;
class Vovel{
public static void main(String[] abc){
Scanner  sc=new Scanner(System.in);
String a=sc.nextLine();
StringBuffer b=new StringBuffer();
for (int i=0;i<a.length();i++){
if((a.charAt(i)!='A') && (a.charAt(i)!='E') && (a.charAt(i)!='I') && (a.charAt(i)!='O') && (a.charAt(i)!='U') )
{
b.append(a.charAt(i));
}}
System.out.println(b);
}}