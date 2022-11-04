package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("Ganesh");
		al.add(100);
		al.add('A');
		al.add(null);
		al.add(100);
		al.add(null);
		System.out.println(al);//it will print entire data in existing sequence
		System.out.println(al.size());//it will size of ArrayList
		System.out.println(al.contains(100));//check whether given value present in ArrayList on not
		System.out.println(al.isEmpty());//it will check whether Al is empty
		
		//instert new value in Array List by right shift operator
		
		al.add(2, 300);
		System.out.println(al.get(2));
		System.out.println(al);
		
		al.remove(3);
		System.out.println(al);
		System.out.println("Printing data");
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//fetching data using list iterator
		System.out.println("Print data using list iterator");
		ListIterator litr = al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("print data using foreach loop");
		for(Object s1:al)
		{
			System.out.println(s1);
		}
		
		
		
		
		
		
	}

}
