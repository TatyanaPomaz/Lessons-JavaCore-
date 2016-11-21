import data.Bag;

class Main {
	public static void main(String ... args) {
		Bag<String> bag = new Bag<>();
		Bag<Integer> bag2 = new Bag<>(); 
		bag2.add(new Integer(10));
		
		Bag.Iterator<Integer> bagIterator = bag2.iterator();
		while (bagIterator.hasNext()) {
			System.out.println(bagIterator.next());
		}
	}
}