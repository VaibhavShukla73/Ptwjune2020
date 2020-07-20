package SundayBatch;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		
		MethodOverLoading m1=new MethodOverLoading();
		
		m1.login();
		m1.login(20);
		m1.login("Tom");
		m1.login("Smith", 200);
		
		
		
		
	//tom,new york,queens,jamica     search method 	
		

	}
//method overloading //method overriding
	// within the same class when we have diffrenet method with the same name
	// but diffrenet parameters diff type and sequence of the parameters is also
	// diff.

	public void login() { // 1
        System.out.println("Method have no para");
	}

	public void login(int i) { // 2
		System.out.println("Method have 1 para int "+i);
	}

	public void login(String s) { // 3
		System.out.println("Method have 1 para string "+s);
	}

	public void login(String s, int i) { // 4
		System.out.println("Method have 2 para string and int");
	}

	public void login(int i, String s) { // 5
		System.out.println("Method have 2 para int and string");
	}

}
