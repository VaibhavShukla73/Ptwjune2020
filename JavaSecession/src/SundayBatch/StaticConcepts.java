package SundayBatch;

public class StaticConcepts {
	
	  String name;
	  static int age;
	
	public void getName()
	 	{
		
		System.out.println("Get Name");
		getAddress();
		display();
	}
	
	public void getAddress() {
		System.out.println("Get Address");
	}
	
	
	
	public static void display() {
		System.out.println("display method");
	}

	public static void main(String[] args) {
		 //how to call static  var and methods: no nedd to craete object
		//a. direct without class name
		//b. call with class name
		StaticConcepts s1=new StaticConcepts();
		age=20;
		s1.getName();
		StaticConcepts.display();
		StaticConcepts.age=25;
		s1.name="Tom";
		//System.out.println(s1.name);
		s1.age=20;
		s1.getAddress();
	    
		
		
		
		
		
		age=25;
		// System.out.println(StaticConcepts.age);
		// StaticConcepts.display();

	}

}
