package com.te.learn.abstraction.interfaces;

import java.util.Arrays;
import java.util.Comparator;

public class Aplication {

	public static void main(String[] args) {
		
		Emp[] emp= {new Emp(1,"Name1",22,10000),new Emp(2,"Name2",42,9000), new Emp(3,"Name3",32,20000)};
		
		Comparator compareEmp=(o1,o2)->{
			Emp e=(Emp) o1;
			Emp e1=(Emp) o2;
			if(e.geteAge()>e1.geteAge())
				return 1;
			else if (e.geteAge()< e1.geteAge())
				return -1;
			return 0;
		};
		Comparator compareEmpSalary=(o1,o2)->{
			Emp e2=(Emp) o1;
			Emp e3=(Emp) o2;
			if(e2.geteSalary()>e3.geteSalary())
				return 1;
			else if (e2.geteSalary()< e3.geteSalary())
				return -1;
			return 0;
		};
		
		Arrays.sort(emp,compareEmpSalary);
		//Arrays.sort(emp,new CompareEmp());
		for (Emp emp2 : emp) {
			System.out.println(emp2);
		}
	}

}
