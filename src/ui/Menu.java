package ui;
import java.io.*;

public class Menu {
	 
	private static BufferedReader reader;
	private static int max;
	private static int num;
	
	public static void main(String[] args) throws Exception {
	reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("WELCOME! THIS IS A PROSTHETIC DATABASE");
	System.out.println("Who are you?");
	System.out.println("1.Patient");
	System.out.println("2.Doctor");
	System.out.println("3.Biomedical Engineer");
	System.out.println("4.Hospital");
	
	do {
		System.out.println("Introduce the number: ");
		max =4;
		num = Integer.parseInt(reader.readLine());
		
	}while(InputErrors.CheckOption(num, max));
	
	switch(num) {
	case 1: //code
		break;
	case 2: //code
		break;
	case 3: //code
		break;
	case 4: //code
		break;
	default:
	}
	
	}

}
