abstract class Rectangle{
int x,y;
abstract void shape();
}
class Data extends Rectangle{
public void get_data(int c ,int d){
x=c;
y=d;
System.out.println("length"+" "+c+" "+"breadth"+" "+d);
}
void shape(){
	System.out.println("shape of square");
}
}
public class abstract_class{
public static void main(String[] abc){
Data z=new Data();
z.get_data(2,3);
z.shape();
}
}

