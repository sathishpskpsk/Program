package collection;

import java.util.Comparator;
import java.util.TreeSet;



public class Treeset {
	//comparable
	
	public static void main(String[] args) {
		
	TreeSet<Student> t=new TreeSet<Student>();
	t.add(new Student(1,"n1",22));
	t.add(new Student(2,"n2",42));
	t.add(new Student(2,"n2",42));
	t.add(new Student(3,"n3",23));
	t.add(new Student(3,"n4",12));
	
	for (Student student : t) {
		System.out.println(student);
	}
	System.out.println("===================================");
	
	
	}
}
