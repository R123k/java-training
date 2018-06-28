
import java.util.*;

class Compare_set{

	public static void main(String args[]){

		HashSet<String> Set1 = new HashSet<String>();

		HashSet<String> Set2 = new HashSet<String>();

		Set1.add("Kumar");

		Set1.add("saini");

		Set1.add("jain");

		Set1.add("sharma");

		System.out.println("Set1 are"+Set1);

		Set2.add("rahul");

		Set2.add("kumar");

		Set2.add("Gujjar");

		Set2.add("bniye");

		System.out.println("Set2 are"+ Set2);

		HashSet<String> Set3 = new HashSet<String>();

		Set1.retainAll(Set2);

		System.out.println(Set1);

	}

} 