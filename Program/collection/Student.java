package collection;

import com.te.learn.abstraction.interfaces.comparator;

public class Student implements Comparable {
	private int sId;
	private String sName;
	private int sAge;
	
	public Student() {
		super();
	}
	public Student(int sId, String sName, int sAge) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + "]";
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + sAge;
//		result = prime * result + sId;
//		result = prime * result + ((sName == null) ? 0 : sName.hashCode());
//		return result;
//	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (sAge != other.sAge)
			return false;
		if (sId != other.sId)
			return false;
		if (sName == null) {
			if (other.sName != null)
				return false;
		} else if (!sName.equals(other.sName))
			return false;
		return true;
	}
	@Override
	public int compareTo(Object o) {
		Student s=(Student) o;
		if(this.getsAge()>s.getsAge())
			return 1;
		else if(this.getsAge()<s.getsAge())
			return -1;
		return 0;
	}

}
