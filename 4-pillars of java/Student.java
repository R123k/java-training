class Data
{
	static {
	System.out.println("Address constructor");		
	}
	Data(){
		System.out.println("student constructor");
	}
	}
	
public class Student{
	public static void main(String[] args){
	System.out.println("Main Block");
	Data ad = new Data();
		
	}
}	
	
	