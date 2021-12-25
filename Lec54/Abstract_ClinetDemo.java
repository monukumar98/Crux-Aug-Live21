package Lec54;

public class Abstract_ClinetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_Demo ad = new Abstract_Demo() {

			@Override
			public void SayHey() {
				// TODO Auto-generated method stub
				System.out.println("Hello Ramu");

			}
		};
		ad.SayHey();

	}

}
