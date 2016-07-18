package com.syncron;

import java.util.ArrayList;

public class SenderReadService<T> implements ReadService<T> {
	ArrayList<T> list;
	
	public SenderReadService(ArrayList<T> array) {
		this.list = array;
	}

	@Override
	public T read(int id) {
		//just to test, it will return value on the basis of index.
		return list.get(id);
	}
}
