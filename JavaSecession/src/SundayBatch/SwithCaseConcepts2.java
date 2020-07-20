package SundayBatch;

public class SwithCaseConcepts2 {

	public static void main(String[] args) {

	
		String signal="gREEn";
		signal=signal.toLowerCase(); //GREEN  

		switch (signal) { //==
		case "red":
			System.out.println("Please Stop");
				
			break;
		case "green":

			System.out.println("Please Go");
			break;
		case "yellow":

			System.out.println("Please Slowdown");
			break;
	
		default:
			System.out.println(" Check Your Visionnumber is wrong");
			
			break;
		}

	}

}
