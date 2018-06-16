import java.util.Scanner;
class Armstrong{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter anynumber");
		int num = sc.nextInt();
		int rem,sum=0,temp;
		temp = num;
		while(temp>0){
			rem = temp%10;
			sum = sum +rem*rem*rem;
			temp = temp/10;
		}
		if(num==sum){
			System.out.println("number is armstrong");
		}
		else{
			System.out.println("number is not armstrong");
		}
	}
}