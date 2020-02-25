package programsForInterview;

class Pen{
	String color="Green";
	public Pen(){System.out.println("Got a new pen..");}
	void write(){System.out.println("Pen is writing..");}
}
class Pencil extends Pen{
	String color="Blue";
	public Pencil(){
		super();
		System.out.println("Got a new pencil..");}
	void write(){System.out.println("Pencil is writing..");}
	void throwPencil(){System.out.println("I am throwing pencil..");}

	void printColor(){
		System.out.println("Pencil color is : "+color);
		System.out.println("Pen color is : "+super.color);
	}
	void showMethod(){
		super.write();
		write();
		throwPencil();
		printColor();
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		Pencil p = new Pencil();
        p.showMethod();
	}

}
