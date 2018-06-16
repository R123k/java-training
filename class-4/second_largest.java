import java.util.Scanner;
class Second_largest{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter value of array");
		int i;
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int b,j,temp,c;
		for(b=0;b<arr.length-1;b++){
			for(j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(b=0;b<arr.length;b++){
			if(b== arr.length-2){
				System.out.println("second largest number is");
			System.out.println(arr[b]);
			}
		}
	}
}