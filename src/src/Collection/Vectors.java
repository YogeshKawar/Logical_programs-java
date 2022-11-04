package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add("Asha");
		v.add('A');
		v.add(200);
		v.add(null);
		v.add(null);
		v.add("Asha");
		v.add(100);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.isEmpty());
		System.out.println(v.contains(200));
		System.out.println(v.get(0));
		System.out.println(v.remove(5));
		v.add(0,"Samantha");
		System.out.println(v);
		v.set(3, 'B');
		System.out.println(v);
		System.out.println("Printing data");
		Enumeration ele=v.elements();
		while(ele.hasMoreElements())
		{
			System.out.println(ele.nextElement());
		}
		System.out.println("Printing data using foreach");
		for(Object s1:v)
		{
			System.out.println(s1);
		}
	}

}
