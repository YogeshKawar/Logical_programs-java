package Collection;

import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add("Rashmika");
		hs.add(100);
		hs.add('A');
		hs.add(null);
		hs.add(null);
		hs.add(100);
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains(100));
		System.out.println(hs.size());
	//	System.out.println(hs.add(3,"Asha")); //not allowed
		hs.add("ABC");
		System.out.println(hs);
		
		
	}

}
