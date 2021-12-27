package Lec55;

public class Student implements Comparable<Student>{

	String name;
	int marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int marks) {
		this.marks = marks;
		this.name = name;

	}

	@Override
	public String toString() {
		return this.name + " " + this.marks;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.marks==o.marks) {
			return this.name.compareTo(o.name);
		}
		return this.marks-o.marks;
	}

}
