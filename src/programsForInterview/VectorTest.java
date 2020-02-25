package programsForInterview;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		v.add("K");
		v.add("I");
		v.add("K");
		v.add("O");
		v.add("L");
		v.add("K");
		v.add("M");
		v.add("K");
		v.add("K");
		v.add("null");
		v.add("null");
		System.out.println(v);
		
		v.removeIf(a->a.contains("O"));
		Iterator<String> itr=v.iterator();
	
		while(itr.hasNext()){
			System.out.print(itr.next()+ " ");
		}
		

	}

}
