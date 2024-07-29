package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratorAndSet {
public static void main(String[]args) {
	HashMap<Integer,String> h=new HashMap<Integer, String>();
	h.put(1,"siri");
	h.put(2,"hiiii");
	h.put(3,"sirilu");
	Set s=h.entrySet();
	Iterator i=s.iterator();
	while(i.hasNext()) {
		Map.Entry m=(Map.Entry)i.next();
		System.out.println(m.getKey()+" "+m.getValue());
	}
}
}
