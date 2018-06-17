interface Animal{
    public void speak();
	public void eat();
	}
	
class Cat implements Animal{
public void speak(){
System.out.println("cat is speaking");
}
public void eat(){
System.out.println("cat is eating");
}
}

class Dog implements Animal{
public void speak(){
System.out.println("Dog is speaking");
}

public void eat(){
System.out.println("cat is speaking");
}
}

public class intefaces{
public static void main(String[] abc){
Animal v=new Cat();
v.speak();
v.eat();
Animal x=new Dog();
x.speak();
x.eat();
}
}



