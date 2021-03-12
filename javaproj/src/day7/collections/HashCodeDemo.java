package day7.collections;

class Employee1 {
	int id;
	String name;
	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}

public class HashCodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e = new Employee1(1,"Sachin");
		Employee1 c = new Employee1(1,"Sachin");
		System.out.println(e.hashCode());
		System.out.println(c.hashCode());
		
	}

}
