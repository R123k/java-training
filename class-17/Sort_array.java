
import java.util.Arrays;

class Sort_array{

	public static <R> void display(R[] arr){

		for(R show : arr){

			

			Arrays.sort(arr);

            System.out.print(show);

			System.out.print(" ");

			}

		System.out.println();

	}

	public static void main(String a[]){

	

		Integer[] arrint = {1,2,3,4,5,6};

		String[] arrstr = {"rahul","ravi","vivek","khusra"};

		Double[] arrdoub = {3.6,4.5 ,5.6 ,5.5 ,6.5};



		System.out.println("Integer array is");

		display(arrint);

		System.out.println("String array is");

		display(arrstr);

		System.out.println("Character array is");

		display(arrdoub);

	}

}
