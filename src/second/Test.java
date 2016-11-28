package second;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("wang",20);
		Student s2 = new Student("wang",20);
		
		Set set = new HashSet();
		set.add(s1);
		System.out.println(set.add(s2));
		System.out.println(set);
	}

}
