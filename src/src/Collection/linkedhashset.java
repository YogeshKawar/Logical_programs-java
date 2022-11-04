package Collection;

import java.util.LinkedHashSet;

public class linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Rainbow");
		lhs.add('A');
		lhs.add(null);
		lhs.add(null);
		lhs.add(100);
		lhs.add("Shourya");
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.contains(100));
		
		
		
		
	}

}
