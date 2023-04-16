package treesetuserdefined;

import java.util.TreeSet;

public class Dema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Student> set = new TreeSet<Student>();
		
		set.add(new Student(459,"seema"));
		set.add(new Student(4,"see"));
		set.add(new Student(45,"ema"));
		set.add(new Student(59,"sema"));
		
		System.out.println("increasing order with the marks");
		
		for(Student ele:set) {
			System.out.println(ele.getName() +" " + ele.getMarks());
			System.out.println();
		}
	}

}
