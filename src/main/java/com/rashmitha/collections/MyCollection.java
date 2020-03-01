package com.rashmitha.collections;

import java.util.AbstractList;
import java.util.LinkedList;

/*public static <T> List<T> asList(T[] a) {
    return new MyArrayList<T>(a);
}

private static class MyArrayList<T> extends AbstractList<T> {

    private final T[] a;

    MyArrayList(T[] array) {
        a = array;
    }

    public T get(int index) {
        return a[index];
    }

    public T set(int index, T element) {
        T oldValue = a[index];
        a[index] = element;
        return oldValue;
    }

    public int size() {
        return a.length;
    }
}*/

public  class MyCollection extends AbstractList<Details>{
	private LinkedList<Details> list;
	/*MyCollection(LinkedList<Details> x)
	{
		list=x;
	}*/
	
	public boolean add(Details x)
	{
		if(list==null) list=new LinkedList<Details>();
		list.add(x);return true;
	}
	public void delete(int index) {
		if(index>=list.size()) {
			System.out.println("Enter valid index");
			return;
		}
		Details removed=list.remove(index);
		System.out.println("Object deleted is: "+removed);
	}

	@Override
	public Details get(int index) {
		if(index>=list.size()) {
			System.out.println("Enter valid index");
			return null;
		}
		// TODO Auto-generated method stub
		return list.get(index);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return  list.size();
	}
	public void print() {
		if(list.size()==0) {
			System.out.println("List is empty");
			return;
		}
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
	
	

}
