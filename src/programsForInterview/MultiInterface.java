package programsForInterview;

interface Printable{
	public abstract void print();
	default void run(){System.out.println("I am running..");}
	static int cubeRoot(int n){return n*n*n; }
}
interface Showable{
	public abstract void show();
}
class A implements Printable, Showable{
	public void print(){System.out.println("It is printing..");}
	public void show(){System.out.println("It is showing..");}
}

public class MultiInterface {

	public static void main(String[] args) {
		A a=new A();
		a.print();
		a.show();
		a.run();
		System.out.println("Cube root is : " +Printable.cubeRoot(4));


		
	}

}
