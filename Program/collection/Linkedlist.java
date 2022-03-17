package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<Student> l= new LinkedList();
		l.add(new Student(1,"One",22));
		l.add(new Student(2,"Two",25));
		l.add(new Student(3,"Three",19));
		
		System.out.println(l);
		
		System.out.println("111&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		//for loop
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println("222&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		//foreach
		for (Object object : l) {
			System.out.println(object);
		}
		System.out.println("333&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		//Iterator
		Iterator iterator = l.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());	
		}
		System.out.println("444&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		//ListIterator
		ListIterator listIterator=l.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("555&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
			
		}
	}

}
