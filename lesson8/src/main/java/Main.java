import one.*;
import two.*;
import init.*;

class Main {
	public static void main(String ... args) {
		BB bb = new BB();
		bb.foo();
		
		print2(Types.ODD);
		
		
		System.out.println("-----------------");
		One one = new One();
	}
	
	public static void print2(Types types) {
		System.out.println(types);
	}
}