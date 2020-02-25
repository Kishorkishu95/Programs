package programsForInterview;

class Animal{
	void eat(){System.out.println("It eats.");}
}
class Dog extends Animal{
	void walk(){System.out.println("It walks..");}
}
class Cat extends Animal{
	void sleep(){System.out.println("It sleeps..");}
}

public class HierarchicalExtends {

	public static void main(String[] args) {
		Dog c=new Dog();
		c.eat();
		//c.sleep();
		c.walk();

		
	}

}
