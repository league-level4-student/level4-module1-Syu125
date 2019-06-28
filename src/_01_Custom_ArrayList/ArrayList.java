package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {

	T[] list;
	

	public ArrayList() {
		list = (T[]) new Object[0];

	}

	public T get(int loc) throws IndexOutOfBoundsException {
		System.out.println(list[loc]);
		return list[loc];
	}

	public void add(T val) {
		T[] temp = (T[]) new Object[list.length + 1];
		temp[list.length] = val;

		for (int i = 0; i < list.length; i++) {
			temp[i] = list[i];
		}
		list = temp;

	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] temp = (T[]) new Object[list.length + 1];
		for (int i = 0; i < loc; i++) {
			temp[i] = list[i];
		}
		for (int i = loc; i < list.length; i++) {
			temp[i + 1] = list[i];
		}
		temp[loc] = val;
		list = temp;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		T[] temp = (T[]) new Object[list.length];

		for (int i = 0; i < list.length; i++) {
			temp[i] = list[i];
		}
		temp[loc] = val;
		list = temp;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] temp = (T[]) new Object[list.length - 1];
		for (int i = 0; i < loc; i++) {
			temp[i] = list[i];
		}
		for (int i = loc + 1; i < list.length; i++) {
			temp[i - 1] = list[i];
		}
		list = temp;
	}

	public boolean contains(T val) {
		for (int i = 0; i < list.length; i++) {
			if (list[i].equals(val)) {
				return true;
			}
		}

		return false;
	}
	public int size() {
		return list.length;
	}
}