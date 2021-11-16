package Lec38;

public class Student {

	String name = "xyz";
	int age = 100;

//	public Student() {
//		
//	}

	public Student() {
		this.age = 89;
		this.name = "Rahul";

	}

	public Student(String name, int age) {

		this.name = name;
		this.age = age;

	}

	public Student(String name, int age, int roll) {

		this.name = name;
		this.age = age;

	}

	public Student(String name) {

		this.name = name;

	}

	public void Intro_yourSelf() {

		System.out.println("My Name is " + this.name + " and age is " + this.age);

	}

	public void Say(String name) {
		int roll = 20;
		System.out.println(this.name + " say hey " + name + " " + roll);

	}

}
