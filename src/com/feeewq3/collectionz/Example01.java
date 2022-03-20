package com.feeewq3.collectionz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example01 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(8);
		numbers.add(11);
		numbers.add(34);
		numbers.add(5);
		numbers.add(7);
		
		for (int i = 0; i < numbers.size(); i++) {
			int value = numbers.get(i);
			System.out.println("Item "+ i + ": "+ value);
		}
		
		Iterator<Integer> numbersIterator = numbers.iterator();
		while (numbersIterator.hasNext()) {
			int value = (int) numbersIterator.next();
			System.out.println("Item  " + ": "+ value);
		} 

	}

}
