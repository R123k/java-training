class Palindrom{
public static void main(String[] abc){

int num=123,temp;
temp=num;
int rem;
int rev=0;
while(num>0){
rem=num%10;
rev=rev*10+rem;
num=num/10;
}
{System.out.println(rev);}
if (rev==temp)
{ System.out.println("Palindrom");
}
else 
{
System.out.println("not palindrome");}

}}