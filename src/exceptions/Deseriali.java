package exceptions;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
		class Student implements Serializable{
			int no;
			String name;
			public Student(int no, String name) {
				this.no=no;
				this.name=name;
			}
		}
		public class Deseriali {
		public static void main(String[] args) {
				try {
				FileInputStream f=new FileInputStream("me11.txt");
				ObjectInputStream o=new ObjectInputStream(f);
			
				while(f.available()>0) {
					//System.out.println((char)i);
				
				Student s4=(Student)o.readObject();
				System.out.println(s4.no+" "+s4.name);
				
				}
				}
				catch(Exception e) {
					System.out.println(e);
				}
				System.out.println("successefully worked");
	}

}
