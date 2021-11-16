package Lec39;

public class Persion {

	private String name = "Chetna";
	private int age = 20;

	public Persion() {
		// TODO Auto-generated constructor stub

	}

	public int getAge() {

		return age;
	}

//	public void setAge(int age)  throws Exception {
//		if(age<0) {
//		throw new Exception("pgl hai be age kabse -ve age hone lga");
//		}
//		this.age=age;
//	}

	public void setAge(int age)  throws Exception {
		
		try {

			if (age < 0) {

				throw new Exception("pgl hai be age kabse -ve age hone lga");
			}
			System.out.println("I am in try block");
			this.age = age;
		} 
		
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("I am in Catch block");
			System.out.println(e);
			e.printStackTrace();

		}
		
		finally {
			System.out.println("I am finlay");
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
