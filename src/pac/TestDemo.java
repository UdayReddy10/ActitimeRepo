package pac;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestDemo {
public static void main(String[] args) {
	Set s=new HashSet();
	s.add(10);
	s.add("abc");
	s.add("xyz");
	s.add(null);
	s.add(10);
	s.add(10.5f);
	s.add(10.5);
	System.out.println(s);
	Iterator itr=s.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	Set s1=new LinkedHashSet();
	s1.add(10);
	s1.add(15.5);
	s1.add(10);
	s1.add("abc");
	s1.add("xyz");
	System.out.println(s1);
	Set<String> ts=new TreeSet<String>();
	ts.add("Arjun");
	ts.add("Anu");
	ts.add("Abi");
	ts.add("Aman");
	ts.add("Anand");
	
	System.out.println(ts);
}
}
