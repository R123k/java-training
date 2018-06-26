

	import java.util.*;

	import java.io.*;

	import java.io.BufferedWriter;



class Pathjava{

	static ArrayList al = new ArrayList();

	public static void dir(File fil){

		

			File[] d = fil.listFiles();			

			for(File f2 : d){

				if(f2.isDirectory()){

					dir(f2);

					al.add(f2.getAbsolutePath());

					System.out.println(f2.getAbsolutePath());

				}

				else{

					System.out.println(f2.getAbsolutePath());	

					al.add(f2.getAbsolutePath());

				}

				

			}

		

		}

	

	

	public static void main(String args[]) throws IOException{

		File f1 = new File("C:\\Users\\HP\\Desktop\\class assig\\bca.txt");

		f1.createNewFile();

		File f = new File("C:\\Users\\HP\\Desktop\\class assig\\class-12");

		if(f.isDirectory()){

		dir(f);

		}

		else{

			

		}

		 FileWriter fw  = new FileWriter(f1);

		 BufferedWriter bw = new BufferedWriter(fw);

		 Iterator i = al.iterator();

		 while(i.hasNext()){

			 bw.write((String)i.next());

			 bw.newLine();

			}

		}}