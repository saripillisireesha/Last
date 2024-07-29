package exceptions;
import java.io.*; 
class Hello{
	int x,y;
	Hello(){
		 x=10; 
		 y=20;
	}
}
public class CloneAssign {

	public static void main(String[] args) {
		Hello h=new Hello();
		System.out.println(h.x+" "+h.y);
		Hello h1=h;
		h1.x=200;
		h1.y=489;
		System.out.println(h.x+" "+h.y);

		System.out.println(h1.x+" "+h1.y);

	}

}
