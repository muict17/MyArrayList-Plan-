
public class MyArrayList<T> {
	private T[] array;
	private int arraySize = 0;
	private T[] TempArray;

	public MyArrayList() {
		array = (T[]) new Object[arraySize];
	}


	public void add(T data) {
		TempArray = (T[]) new Object[arraySize+1];
		for (int i = 0; i < arraySize; i++) {
			TempArray[i] = array[i];
		}
		array = TempArray;
		array[arraySize] = data;
		arraySize++;
	}
	
	public void remove(int index) {
		for (int i = index; i < arraySize-1; i++) {
			array[i] = array[i+1];
		}
		TempArray = (T[]) new Object[arraySize-1];
		for (int i = 0; i < arraySize-1; i++) {
			TempArray[i] = array[i];
		}
		array = TempArray;
		arraySize--;
	}
	
	public void printData() {
		for (int i = 0; i < arraySize; i++) {
			System.out.print(array[i]);
			if (i != arraySize - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("\n");
	}
	
	public T get(int index) {
		return array[index];
	}
	
	public int size() {
		return arraySize;
	}
}