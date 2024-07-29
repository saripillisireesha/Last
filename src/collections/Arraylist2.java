package collections;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int id; 
	String name;
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
}
public class Arraylist2{
	public static void main(String[] args) {
		ArrayList o=new ArrayList();
		Student s1=new Student(1,"siri");
		Student s2=new Student(2,"meghana");
		Student s3=new Student(3,"revathi");
		o.add(s1);
		o.add(s2);
		o.add(s3);
		Iterator i=o.iterator();
		while(i.hasNext()) {
			Student s4=(Student) i.next();
			System.out.println(s4.id+" "+s4.name);

		}

	}

}
