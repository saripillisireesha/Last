package collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		HashSet l=new HashSet();
		l.add(1);
		l.add("siri");
		l.add("hello");
		l.add("fhtwyh");
		l.add("siri");
		Iterator i=l.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
		}
		System.out.println(l);

	}

}
