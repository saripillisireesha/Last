package exceptions;

import java.io.IOException;

public class UsingThrows {
	void m()throws Exception {
		throw new IOException ("compile time error");
	}
	void n() throws Exception {
		m();
	}void p(){
		try {
			n();
		}
		catch(Exception e) {
			System.out.println("Exception is handled");
		}
	}
	

	public static void main(String[] args) {
		UsingThrows ob=new UsingThrows();
		ob.p();

	}

}
