package SundayBatch;

public class Car {
	
	String name;
	String brand;
    long price;
	static final int wheal=4;
	String color;
		

	public static void main(String[] args) {
		
		
		//StaticConcepts ss1=new StaticConcepts();
		//ss1.getName();
		
		StaticConcepts.display();
		
		
		
	
		
	
		
		
		
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		
		//wheal=5;
		c1.name="Honada";
		c1.brand="Acord";
		c1.price=25000;
		//c1.wheal=4;
		c1.color="Silver";
		
		c2.name="Toyota";
		c2.brand="Camary";
		c2.price=27000;
		//c2.wheal=4;
		c2.color="Black";
		
		c3.name="Accura";
		c3.brand="TL";
		c3.price=35000;
		c3.color="Red";
		
		
    System.out.println(c1.name+"  "+c1.brand+"   "+"  "+"  "+c1.price+"     "+c1.wheal+"    "+c1.color);		
    System.out.println(c2.name+"  "+c2.brand+"   "+"  "+"  "+c2.price+"     "+c2.wheal+"   "+c2.color);
    System.out.println(c3.name+"  "+c3.brand+"   "+"  "+"  "+c3.price+"     "+c3.wheal+"     "+c3.color);
	
		
		
		
		

	}

}
