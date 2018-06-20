class Demo{

		void print()
		{
			System.out.println("null");
		}
		void print(int a){
			System.out.println(a);
		}
		void print(float a){
			System.out.println(a);
		}
	}

public class Overloading{
	public static void main(String a[]){
		Demo c = new Demo();
		c.print(5);
		c.print(6.9f);
		c.print();
	}
}