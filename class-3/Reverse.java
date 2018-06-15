class Reverse{
public static void main(String[] abc){
int num=123;
int rem;
int rev=0;
while (num>0){
rem=num%10;;
rev=rev*10+rem;
num=num/10;
}

System.out.println(rev);
}}

