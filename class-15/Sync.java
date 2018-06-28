import java.util.*;

import java.lang.Thread;

import java.io.*;

class Sync extends Thread{

	static int k;

	public  synchronized void show(){

		for(int j=1;j<=500;j++){

			

			System.out.println(++k);

			}

		



	}



	public void run(){

		show();

	}



	public static void main(String[] args) {

		Sync s1 = new Sync();

		Thread p = new Thread(s1);

		//Sync s2 = new Sync();

		Thread p1 = new Thread(s1);



		p.start();

		p1.start();

		

	}

}
