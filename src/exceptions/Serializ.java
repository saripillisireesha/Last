package exceptions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable{
	int no;
	String name;
	public Student(int no, String name) {
		this.no=no;
		this.name=name;
	}
}
public class Serializ  {

	public static void main(String[] args)  {
		
		Student s1=new Student(1,"siri");
		Student s2=new Student(2,"revu");
		Student s3=new Student(3,"megha");
		try {
		FileOutputStream f=new FileOutputStream("me11.txt");
		ObjectOutputStream o=new ObjectOutputStream(f);
		o.writeObject(s1);
		o.writeObject(s2);
		o.writeObject(s3);
		
		//f.close();
		System.out.println("File create succsessfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
