package com.te.learn.abstraction.interfaces;

import java.util.Comparator;

public class CompareEmp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Emp e=(Emp) o1;
		Emp e1=(Emp) o2;
		if(e.geteAge()>e1.geteAge())
			return 1;
		else if (e.geteAge()< e1.geteAge())
			return -1;
		return 0;
	}
	

}
