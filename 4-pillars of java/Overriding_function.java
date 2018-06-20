class Animal{
	void speak(){
		System.out.println("animal is speaking");
	}
}

class Dog extends Animal{
	void speak(){
		System.out.println("Dog is barking");
	}
}

class Cat extends Animal{
	void speak(){
		System.out.println("hey am cat");
	}
}

public class Overriding_function{
	public static void main(String a[]){
		Animal an = new Dog();
		an.speak();
		Animal ani = new Cat();
		ani.speak();
	}
}