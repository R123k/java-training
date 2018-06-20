import java.util.Scanner;
class ReverseString{
	public static void main(String[] abc){

Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
StringBuffer sb=new StringBuffer(s);

sb.reverse();
System.out.println(sb);
}
}

