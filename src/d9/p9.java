package d9;

import java.util.*;
public class p9{

	public static void main(String[] args) {
		String[] names = {"Ravi","rahul","anand","rakesh","raj"};
		String search ="Ra";
		ArrayList<String> result = new ArrayList<>();
		for(String name : names) {
			if(name.contains(search)) {
				result.add(name);
			}
		}
		System.out.println("search results:");
		for(String name : result) {
			System.out.println(name);
		}
	}

}