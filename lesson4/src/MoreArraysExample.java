
class MoreArraysExample {
	public static void main (String ...args) {
		
		LightBulb bulb = new LightBulb();
		bulb.on();
		
		LightBulb bulb2 = new LightBulb();
		bulb2.switchBulb();
		
		LightBulb bulb3 = bulb;
		
		//if (bulb.equalTo(bulb2)) {
		if (bulb == bulb3) {
			System.out.println("The balbs are equals");
		} else {
			System.out.println("The balbs are not equals");
		}
		
		
		
		/*int[] a1 = new int[5];
		int a2[] = new int[5];
		
		int[] a3 = new int[] {1, 2};
		
		
		int[] a4 = {1, 2};
		
		int[] a5 = new int[0];
		
		int[][] aa1 = new int[5][5];
		
		int[][] aa2 = new int[5][];
		aa2[0] = new int[5];
		aa2[1] = new int[4];
		aa2[2] = new int[3];
		aa2[3] = new int[2];
		aa2[4] = new int[1];
		
		int[][] aa3 = {{0,0,0,0,0},{0,0,0,0},{0,0,0},{0,0},{0}};
		
		int[][] aa4 = new int[1][];
		System.out.println(aa4[0]);
		
		int[][][] aaa1 = new int[1][][];
		System.out.println(aaa1[0]);
		
					
		printOneDimensionalArray(a3);
		printTwoDimensionalArray(aa3);
		
		varargs("Hello", "Worm", ":)");
		
		varargsWithLeadingParameter(".......", "1");*/
	}	
	
	public static void printOneDimensionalArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}	
	}
	
	public static void printTwoDimensionalArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("");
			printOneDimensionalArray(array[i]);			
		}
	}
	
	public static void varargs(String ...args) {
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
	}
	
	public static void varargsWithLeadingParameter(String leadingStrin, String ...args) {
		System.out.println("Starting from:" + leadingStrin);
		varargs(args);
	}
	
}