package com.java.practiceTest;

import java.util.*;
class ArrayListOps {
	public ArrayList<Integer> makeArrayListInt(int n){
		List <Integer> list = new ArrayList<>();
		for(int i=0 ; i<n ; i++){
			list.add(0);
		}
		return (ArrayList<Integer>)list;
	}

	public ArrayList<Integer> reverseList(ArrayList<Integer> list){
		
		Collections.reverse(list);
		return (ArrayList<Integer>) list;
	}
	public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n){
	for(int i=0 ; i<list.size(); i++){
		if(list.get(i)==m)
	{ 
			list.remove(i);
			list.add(i,n);
	}}
	return list;
}
   
}
public class Q1{
	public static void main(String[] args) {

		
	}
}