package programsForInterview;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> v=new HashSet<>();
		v.add("K");
		v.add("I");
		v.add("A");
		v.add("O");
		v.add("L");
		v.add("B");
		v.add("M");
		v.add("C");
		v.add("D");
		v.add("E");
		v.add("F");
		v.add("G");
		v.add("H");
		v.add("Z");
		v.add("X");
		v.add("U");
		v.add("null");
		v.add("T");
		
		Iterator<String> itr=v.iterator();
	
		while(itr.hasNext()){
			System.out.print(itr.next()+ " ");
		}
		

	}

}
