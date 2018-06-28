class Print_array{

	public static <R> void display(R[] arr){

		for(R show : arr){



			System.out.print(show);

			System.out.print(" ");

			System.out.println("Type :"+ show.getClass().getName());

		}

		System.out.println();

	}

	public static void main(String a[]){

		Integer[] arrint = {1,2,3,4,5,6};

		String[] arrstr = {"r","a","m","g","a","j"};

		Double[] arrdoub = {2.6,3.5 ,3.6 ,4.5 ,1.5};



		System.out.println("Integer array is");

		display(arrint);

		System.out.println("String array is");

		display(arrstr);

		System.out.println("Double array is");

		display(arrdoub);

	}

}
