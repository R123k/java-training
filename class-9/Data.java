import java.util.Scanner;
import java.io.*;
class Data{
public static void main(String[] abc);{
file f=new file ("C:\Users\HP\Desktop\class assig\xyz.txt");
FileInputStream fis=new FileInputStream (f);
int c;
while ( (c=fis.read()) !=-1){
System.out.println((char)c);
}}}
