package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHastSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Object> lhs=new LinkedHashSet();
		lhs.add(10);
		lhs.add(10);
		lhs.add("praju");
		lhs.add(null);
		lhs.add(null);
		Iterator<Object> i=lhs.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
	}
}
}