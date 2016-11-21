package inner;

public class Enclosing<T> {
	int first;
	T tmp;

	public interface MyInterface {
		public class Hello {}
	}
	
	public static interface MyInterface2 {
		void doNothing();
	}
	
	public class Inner {
		/*Inner(T t) {
			
		}*/
		int first;
		
		static final int staticInt = 0;
		
		
		
		public void foo() {
			this.first = 10;
			Enclosing.this.first = 20; 
		}
	}
	
	private static int sInt = 0;
	//static T var;
	public static void esFoo() {
		System.out.println("esFoo");
		System.out.println(InnerStatic.isInt);
	}
	
	public static class InnerStatic {
		
		public static class Hello2 {};
		
		private static int isInt = 100;
		
		int nonStatic = 200;
		public void nonStaticFoo() {
			System.out.println("nonStatic:" + nonStatic);
		}
				
		public static void foo() {
			System.out.println("Int:" + sInt);
			sInt = 10;
			System.out.println("Int:" + sInt);
			esFoo();
		}
	}
}

