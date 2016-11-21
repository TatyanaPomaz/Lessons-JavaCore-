package data;

public class ArrayList<T>  implements List<T> {

	private Object[] arr;
	
	public void add(T item) {
		Object[] temp = new Object[arr.length + 1];
		for (int i=0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = (T)item;
        arr = temp;	
	}
	
	public T get(int index) {
		return null;
	}
	
	public int size() {
		return arr.length;
	}
}