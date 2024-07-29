package exceptions;

public class Propagation {
	void a() {
		int b=10;
		int c=0;
		int d=b/c;
		System.out.println(c);
	}
	void b() {
		a();
	}
	void c() {
		try {
			b();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		Propagation ob=new Propagation();
		ob.c();

	}

}
