package treesetuserdefined;

public class Student {
	private int marks;
	private String name;
	
	public int getMarks() {
		return marks;
	}
   public void setMarks(int marks) {
	   this.marks=marks;
   }
   public String getName() {
	   return name;
	  
   }
   public void setName(String name) {
	   this.name=name;
   }
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Student[marks=" +  marks +" , name=" + name + "]";
}
//parameterized constructor
public Student(int marks,String name) {
	super();
	this.marks=marks;
	this.name=name;
}
}
