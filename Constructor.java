class Constructor
{
	static {
	System.out.println("Address constructor");		
	}
	Student(){
		System.out.println("student constructor");
	}
	}
	
public class static_student{
	public static void main(String[] args){
	System.out.println("Main Block");
	Student ad = new Student();
		
	}
}	
	
	