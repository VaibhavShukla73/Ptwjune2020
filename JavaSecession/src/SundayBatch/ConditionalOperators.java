package SundayBatch;

public class ConditionalOperators {

	public static void main(String[] args) {

		// > < >= <= == !
		// conditional operator used when make a decession statment

		int a = 1000;
		int b = 200;

		if (a > b) {
			System.out.println("a is greather than b");
			System.out.println("hi  ");
		} else {
			System.out.println("b is greater than a");

		}
		System.out.println("===============================");

		int num = 0;
		if (num > 0) {
			System.out.println("number is pos.");
		} else if (num == 0) {
			System.out.println("number is zeor");
		}

		else

		{
			System.out.println("number is nega");
		}

		System.out.println("===============================");

		String browser = "firefox";

		if (browser.equals("ie")) {
			System.out.println("launch ie");
		} else if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		} else if (browser.equals("fireforx")) {
			System.out.println("launch fire fox");
		} else if (browser.equals("safari")) {
			System.out.println("launch safri");
		} else {
			System.out.println("Give proper browser");
		}

//	if(browser.equals("ie")){  
//		System.out.println("launch ie");
//	}if(browser.equals("chrome")) {
//		System.out.println("launch chrome");
//	}
//	if(browser.equals("firefox")) {
//		System.out.println("launch fire fox");
//	}if(browser.equals("safari")) {
//		System.out.println("launch safri");
//	}
////	else
////	{
////		System.out.println("Give proper browser");
////	}
		System.out.println("===============================");

		int age = 50;

		if (age == 65) {// 50==65
			System.out.println("you are 65  eligiable");
		} else if (age == 50) // 50==50 55==50
		{
			System.out.println("you are 50 also eligiable");

		} else {
			System.out.println("you are not 50 or 65");
		}
		System.out.println("===============================");

		int k = 15;
		if (k == 10) { // 10==10 15==10
			if (k < 10) { // 10<10
				System.out.println("k is less than 10");
			}
			if (k < 5) { // 10<5
				System.out.println("k is less than 5");
			}

			else {
				System.out.println("k is less than 5");
			}

		} else {
			System.out.println("Hiiii");
		}
		System.out.println("===============================");

		// if(k<50)
		if (true) {
			System.out.println("Hello");
		} else {
			System.out.println("hello java");
		}
		System.out.println("===============================");

//write a program which is number greater out of three nos

		int x = 1000;
		int y = 1000;
		int z = 500;
		if (x > y && x > z) { // 1000>2000 && 2000>3000 //&& || short circuit operator
			System.out.println("x is greater");
		} else if (y > z) { // 2000>3000
			System.out.println("y is greater");
		} else {
			System.out.println("z is greater");
		}
		// x>y && x>zHi
		// y>x && y>z
		// z>x && z>y

	}
	
	
	

}
