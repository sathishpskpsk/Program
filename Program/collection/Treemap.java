package collection;

import java.util.TreeMap;

import com.te.learn.abstraction.interfaces.comparator;

import java.util.Comparator;
import java.util.Map.Entry;

public class Treemap {
	public static void main(String[] args) {
		
		Comparator c=(o1,o2)->{
			Integer i1 = (Integer) o1;
			Integer i2 = (Integer) o2;
			
			if(i1>i2)
				return -1;
			else if (i1<i2)
				return 1;
			return 0;	
		};
		
		TreeMap<Integer, Student> tm=new TreeMap<Integer, Student>(c);
		tm.put(1, new Student(1,"A",22));
		tm.put(2, new Student(4,"B",52));
		tm.put(3, new Student(2,"C",42));
		tm.put(4, new Student(3,"D",32));
		
		for (Entry<Integer, Student> string : tm.entrySet()) {
			System.out.println("Key: "+string.getKey() +" "+"Value: "+string.getValue());
		}
		
	}
}
