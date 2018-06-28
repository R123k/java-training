

import java.util.*;

class Keys{

	public static void main(String args[]){

		HashMap<Integer,String> hm = new HashMap<Integer,String>();

		hm.put(58,"rohit");

		hm.put(071,"rahul");

		hm.put(051,"ravi");

		hm.put(68,"khusra");

		hm.put(007,"vivek");

		Set set = hm.entrySet();

		Iterator i = set.iterator();

		while(i.hasNext()){

			Map.Entry me = (Map.Entry)i.next();

			System.out.print(me.getKey()+":");

			System.out.println(me.getValue()+":");

		}

	}

}
