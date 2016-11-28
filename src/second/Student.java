package second;

public class Student {
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student s = (Student)obj;
		if(this.name.equals(s.name)&&this.age==s.age){
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode();
		return this.name.hashCode()+age;
	}
}
