package exceptions;

class Cloning implements Cloneable{
	int rollno;
	String name;
	public Cloning(int rollno, String name) {
		this.rollno=rollno;
		this.name=name;
	}
	public static void main(String[] args) {
		try {
			Cloning s1=new Cloning(1,"siri");
			Cloning s2=(Cloning)s1.clone();
		System.out.println(s1.rollno+" "+s1.name);
		System.out.println(s2.rollno+" "+s2.name);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
