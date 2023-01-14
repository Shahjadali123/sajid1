package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

//Collection->List(ArrayList,LinkedList,Vector->Stack)              Queue   Set

//            QUeue->(PriorityQueue,Deque,ArrayDeque)

//            Set(Hashset,LinkedHashSet,SortedSet,TreeSet)


public class CollectionDemo {

	public static void main(String[] args) {
		/*ArrayList<String> list=new ArrayList<String>();
		list.add("Sajid");
		list.add("Sajid1");
		list.add("Sajid2");
		Iterator itr=list.iterator();
		//System.out.println(list);
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("Sajid");
		list1.add("Sajid1");
		list1.add("Sajid2");
		Iterator<String> itr=list1.iterator();
		//System.out.println(list);
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// TODO Auto-generated method stub,

	}

}
