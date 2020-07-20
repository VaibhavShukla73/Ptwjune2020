package SundayBatch;

public class MainMethodOverload {

	public static void main(String[] args) {
		
		System.out.println("This is my main method");
		main(10);
		main(20,30);

	}
	

	public static void main(int a) {
		 
     System.out.println("this method have one int para");
	}

	public static void main(int i, int j) {

		System.out.println(i + j);

	}

}