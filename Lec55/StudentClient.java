package Lec55;

import java.util.Arrays;
import java.util.Comparator;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] s = new Student[5];
		s[0] = new Student("Ram", 90);
		s[1] = new Student("Rohan", 89);
		s[2] = new Student("Pooja", 85);
		s[3] = new Student("Kamal", 90);
		s[4] = new Student("Amisha", 95);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			
		}
		System.out.println("********");
//		Arrays.sort(s);
		
		Arrays.sort(s, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				if(o1.marks==o2.marks) {
					return o1.name.compareTo(o2.name);
				}
				return o1.marks-o2.marks;
			}
		});
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		

	}

}
