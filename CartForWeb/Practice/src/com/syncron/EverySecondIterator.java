package com.syncron;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;


public class EverySecondIterator<T> implements Iterator<T> {
	
	private boolean skipped;
	private final Iterator<T> target;
	
    public EverySecondIterator(Iterator<T> target) {
    	this.target = Objects.requireNonNull(target);
    }

    
	@Override
	public boolean hasNext() {
		if (!skipped) {
			if (target.hasNext())
				target.next();
			skipped = true;
		}
		return target.hasNext();
	}

	
	@Override
	public T next() {
		if (hasNext()) {
			skipped = false;
			return target.next();
		}
		throw new NoSuchElementException();
	}
	

	@Override
	public void remove() {
		target.remove();
		throw new RuntimeException("Not implemented");
	}
    
    
    public static void main(String[] args) {
    	ArrayList<Integer> array = new ArrayList<Integer>();
    	array.add(1);
    	array.add(2);
    	array.add(3);
    	array.add(4);
    	array.add(5);
    	array.add(6);
    	Iterator<Integer> i1 = array.iterator();
      	EverySecondIterator<Integer> e = new EverySecondIterator<Integer>(i1);
    	System.out.println(e.hasNext());
    	System.out.println(e.hasNext());
    	System.out.println(e.hasNext());
    	System.out.println(e.next());
    	System.out.println(e.next());
    	System.out.println(e.hasNext());
    	System.out.println(e.next());
    	System.out.println(e.hasNext());
    	System.out.println(e.next());
    	System.out.println(e.hasNext());
    	System.out.println(e.next());
    	System.out.println(e.hasNext());

    }
}