package d5;

import java.util.HashSet;
public class p10 {

	public static void main(String[] args) {
		HashSet set=new HashSet();
		System.out.println("Initial size of HashSet before adding elements: "+set.size());
		System.out.println("HashSet is empty adding value: "+set.isEmpty());
		System.out.println("Contents of HashSet before adding: "+set);
		set.add("A");
		set.add("B");
		set.add("E");
		set.add("R");
		set.add("A");
		set.add("C");
		set.add(null);
		System.out.println("Size of HashSet after adding elements: "+set.size());
		System.out.println("HashSet is empty after adding values: "+set.isEmpty());
		System.out.println("Contents of HashSet after adding values: "+set);
		boolean b1=set.contains("E");
		System.out.println("Value E is present: "+b1);
		boolean b2=set.contains("R");
		System.out.println("Value R is present: "+b2);
		set.remove("B");
		System.out.println("Size of HashSet after deletion:"+set.size());
		System.out.println("Contents of HashSet after deletion:"+set);
		set.clear();
		System.out.println("Size of HashSet after clearing: "+set.size());
		System.out.println("Contents of HashSet after clearing: "+set);

		
	}

}
