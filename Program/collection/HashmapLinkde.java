package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapLinkde {
	public static void main(String[] args) {
		//HAshMap
		HashMap<Integer, String> ha=new HashMap<Integer, String>();
		ha.put(7, "S");
		ha.put(6, "a");
		ha.put(5, "t");
		ha.put(4, "h");
		ha.put(3, "i");
		ha.put(2, "s");
		ha.put(1, "h");
		
		for (Map.Entry<Integer, String> string : ha.entrySet()) {
			System.out.println("Key:"+string.getKey()+"  "+"Value:"+string.getValue());
			
		};
		System.out.println("====================================");
		
		//LinkedHashMap
		
		LinkedHashMap<Integer, String> lm=new LinkedHashMap<Integer, String>();
		lm.put(4, "P");
		lm.put(1, "S");
		lm.put(3, "K");
		
		for (Map.Entry<Integer, String> st : lm.entrySet()) {
			System.out.println("key: "+ st.getKey()+" "+"Value: "+ st.getValue());
		}
		
		
	}

}
