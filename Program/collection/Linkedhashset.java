package collection;

import java.util.LinkedHashSet;

public class Linkedhashset {
	public static void main(String[] args) {
		LinkedHashSet<Integer> linkedHashSet= new LinkedHashSet<Integer>();
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add(20);
		linkedHashSet.add(30);
		for (Integer integer : linkedHashSet) {
			System.out.println(integer);
		}
	}
}
