package Collection;

import java.util.LinkedList;

import java.util.ListIterator;

public class linklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		l1.add("Asha");
		l1.add('A');
		l1.add(100);
		l1.add("Vishal");
		l1.add(null);
		l1.add(null);
		System.out.println(l1.size());
		System.out.println(l1);
		System.out.println(l1.get(4));
		System.out.println(l1.isEmpty());
		System.out.println(l1.contains(100));
		System.out.println(l1.get(2));
		System.out.println(l1);
		l1.add(3,200);
		System.out.println(l1);
		l1.add(1,"Akshay");
		System.out.println(l1);
		l1.remove(1);
		System.out.println(l1);
		l1.set(0, "Dipali");
		System.out.println(l1);
		l1.add(5,"jyoti");
		System.out.println(l1);
		System.out.println("printing data");
	//	ListIterator litr=(ListIterator) l1 ListIterator();
		ListIterator litr=l1.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		for(Object s1:l1)
		{
			System.out.println(s1);
		}
		
	}

}
