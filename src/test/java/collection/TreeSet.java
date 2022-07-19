package collection;

import java.util.Iterator;

public class TreeSet {

	public static void main(String[] args) {

		java.util.TreeSet<Object> treeSet=new java.util.TreeSet();
		treeSet.add(10);
		treeSet.add(10);
		treeSet.add("praju");
		treeSet.add(null);
		treeSet.add(null);
		Iterator<Object> i=treeSet.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
