package data;

public class Bag<Item> {
	private Node<Item> fistNode;
	private int size;
	
	private static class Node<Item> {
		Item value;
		Node<Item> next;
	} 
	
	public void add(Item item) {
		Node<Item> previous = firstNode;
		firstNode.value = item;
		firstNode.next = previous;
		size++;
	}
	
	public boolean isEmpty() {
		return firstNode == null;
	}
	
	public int size() {
		return size;
	}
	
	public Iterator<Item> iterator() {
		return new Iterator<Item>;
	}
	
	public class Iterator<Item> {
		Node<Item> current;
		
		Iterator(Node<Item> node) {
			current = node;
		}
		
		
		public boolean hasNext() {
			return current == null;
		}
		
		public Item next() {
			return current.value;
		}
	}
}