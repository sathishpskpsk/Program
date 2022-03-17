package collection;

import java.util.HashSet;

public class Hashsetapp {
	public static void main(String[] args) {
		HashSet<Student> h=new HashSet<Student>();
		h.add(new Student(1,"A",42));
		h.add(new Student(2,"B",22));
		h.add(new Student(2,"B",22));
		h.add(new Student(3,"C",32));
		for (Student student : h) {
			System.out.println(student);
		}
	}
}
