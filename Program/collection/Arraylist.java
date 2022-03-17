package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist{
	public static void main(String[] args) {
		ArrayList<Student> std=new ArrayList();
		std.add(new Student(1,"Name1",22));
		std.add(new Student(2,"Name2",23));
		std.add(new Student(3,"Name3",24));
		System.out.println(std);
		
		System.out.println("==============================");
		//for loop
		for (int i = 0; i < std.size(); i++) {
			System.out.println(std.get(i));
		}
		System.out.println("==============================");
		//Foreach
		for (Object object : std) {
			System.out.println(object);
		}
		
		System.out.println("==============================");
		//Iterator
		Iterator iterator = std.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("5==============================");
		//ListItrerator
		ListIterator list=std.listIterator();
		while(list.hasNext()) {
			System.out.println(list.next());
		}
		System.out.println("6==============================");
		while (list.hasPrevious()) {
			System.out.println(list.previous());
			
		}
		
	}

}
