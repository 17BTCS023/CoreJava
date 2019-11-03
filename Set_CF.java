package collection_framework;
//							SET
//========================================================================

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_CF {
	public static void main(String args[]) {	
		
// 1. HashSet: - heterogeneous data is allowed
		//does'nt allow duplicates: if exists it will ignore the repeated vallue
		
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add("PreviousElementWas10");
		hs.add(50);
		hs.add(80);
		hs.add(100);
		System.out.println(hs);
		
//2. Linked Hash Set  - child class of hash set
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(10);
		lhs.add("PreviousElementWas10");
		lhs.add(50);
		lhs.add(80);
		lhs.add(100);
		System.out.println(lhs);
		
// 3. Tree set - stores homogeneous data, does not allow duplicate
		TreeSet ts = new TreeSet();
		ts.add(50);
		ts.add(80);
		ts.add(100);
		ts.add(10);
		ts.add(10);
		ts.add(20);

		System.out.println(ts);
	}
}
