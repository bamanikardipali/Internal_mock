package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.LinkedTransferQueue;

public class ArrayList1
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("Dipali");
		al.add("Bamanikar");
		al.add(null);
		al.add(null);
		al.add("Dipali");
		al.add("101");
		al.add('A');
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains("Dipali"));
		al.remove(3);
		System.out.println(al);
		System.out.println("---------print all data using iterator----------");
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---------print all data using Listiterator----------");
		  ListIterator litr = al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("---------print all data using forloop----------");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("---------print all data using for each loop----------");
		for(Object s1:al)
		{
			System.out.println(s1);
		}
	
	}
}	

