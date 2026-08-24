package d5;

import java.util.*;

public class p11 {

    public static void main(String[] args) {

        HashSet<Object> c = new HashSet<>();

        c.add("a");
        c.add("b");
        c.add("c");
        c.add("u");
        c.add("i");
        c.add("p");
        c.add("g");
        c.add("j");
        c.add("l");
        c.add("m");
        c.add("n");
        c.add(null);

        System.out.println(c);

        c.add(2);
        c.add("vishnu");

        System.out.println(c);

        Iterator<Object> it = c.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (Object value : c) {
            System.out.println(value);
        }

        System.out.println(c);
    }
}
//	public class p11 {
//		    public static void main(String[] args) {
//		        HashSet<Object> set = new HashSet<>();
//
//		        set.add("Apple");        
//		        set.add(100);           
//		        set.add("Banana");       
//		        set.add(3.14);           
//		        set.add("Apple");        
//		        set.add(true);          
//		        set.add(100);            
//		        set.add('A');            
//		        set.add("Mango");        
//		        set.add(3.14);           
//
//		        System.out.println("Size of set: " + set.size());
//		        System.out.println("Set contents: " + set);
//
//		        System.out.println("\nIterating using Iterator:");
//		        Iterator<Object> it = set.iterator();
//		        while (it.hasNext()) {
//		            Object value = it.next();
//		            System.out.println(value + " -> type: " + value.getClass().getSimpleName());
//		        }
//		    }
//		}

