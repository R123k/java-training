import java.util.Scanner;
class Ascending{
	public static void main(String a[]){
		int[] arr = {1,1,1,1,0,0,0,1,0};
		int i,j,temp,c;
		for(i=0;i<arr.length-1;i++){
			for(j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}