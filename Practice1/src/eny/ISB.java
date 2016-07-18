package eny;

import java.util.ArrayList;
import java.util.List;

public class ISB extends SuperIsb {
	ISB() {
		System.out.println("In Isb constructor");
	}

	{
		System.out.println("In initialization block");
	}

	static void iterate(List<ISB> arr) {
		for (SuperIsb x : arr) {
			x = new SuperIsb();
		}
	}

	public static void main(String[] args) {
		ISB is1 = new ISB();
		ISB is2 = new ISB();
		List<ISB> list = new ArrayList<ISB>();
		list.add(is1);
		list.add(is2);
		iterate(list);
	}

}
