package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> h=new HashMap<Integer,String>();
		h.put(1,"dfg");
		h.put(2, "grgh");
		h.put(3, "bhcu");
		h.put(null,"fbdfg");
		h.put(34,null);
		h.put(56,null);

		for(Map.Entry e:h.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
System.out.println(h);
	}

}
