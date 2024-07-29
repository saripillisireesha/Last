package collections;

import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageTranscoder;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("gfg");
		a.add("siri");
		a.add("fgf");
		a.add("fgdfhg");
		a.add("gfg");
//		for(int i=0; i<a.size();i++) {
//			System.out.println(a.get(i));
//		}
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
			
		}
		List<String> aa=new ArrayList<String>();
		aa.add("gfg");
		aa.add("meghana");
		aa.add("gngn");
		aa.add("nhuj");
		//a.addAll(aa);
		//aa.addAll(a);
		//a.remove(0);
		//a.clear();
		//a.removeAll(aa);
		//a.retainAll(aa);
		//aa.retainAll(a);
		a.add(1,"revathi");
		//a.add(1,"revathi");
//		for(int i=0; i<aa.size();i++) {
//			System.out.println(aa.get(i));
//			System.out.println(a.get(i));
		System.out.println(a);
		System.out.println(aa);
		
		for(int j=0;j<aa.size();j++) {
			System.out.println(aa.get(j));
			
		}
		}

	

}
