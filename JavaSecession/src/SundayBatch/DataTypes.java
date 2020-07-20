package SundayBatch;

public class DataTypes {
	
	byte b=60;

	public static void main(String[] args) {

		//Data Types: Primitive Data Types and Non Primitive Data Types
		//Primitive Data Types 
		    //a Boolean True ,False
			//b Numeric :
			//1. character :char
			//2. integral : byte,short,int,long
			//2.1 floating point  float,double
		
		
		//1 . byte
		//1 size 1 byte=8 bits
		//range -128 to 127
		
		
		byte b=(byte) 250;
		//byte b=60;
		
		System.out.println(b);
		
		//2.short
		//size 2 bytes=16 bits
		//range -32768 to 32767
		
		short s=(short) 50000;
		System.out.println(s);
		
		//int
		//size 4 bytes = 32 bits
		//-2^31 to 2^31
		
		int i=100;
		System.out.println(i);
		
		int p='a';
		int j='b';
		
		
		System.out.println(p+j);
		
		//long 
		//size 8 bytes=64 bits
		//range -2^63 to 2^63
		
		
		long l=100000000000l;
		System.out.println(l);
		
		long l1='a';
		System.out.println(l1);
		
		
		//5.float
		//size 4 bytes=32 bits
		//after dot 5 digits;
		float f1=(float) 100.123454;
		float f2=400.45f;
		float f3=100;
		float f4='a';
		System.out.println(f4);
		System.out.println(f3);
		System.out.println(f2);
		System.out.println(f1);
		
		//6 double
		//size 8 bytes=64 bits
		//after dot 15 digits
		
		double d1=100.1111111155;
		System.out.println(d1);
		
		
		//7.char
		//size 2 bytes = 16 bits
		//range single char
		
		char gender='m';
		
		System.out.println(gender);
		
		// 8 boolean
		//true false 
		// default value false
		
		boolean flag = false;
		System.out.println(flag);
		
		
		
		
		
		
	}

}
