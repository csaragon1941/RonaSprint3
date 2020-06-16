
import java.util.Random;
import java.util.Scanner;

public class MadQuiz1 {
	public void lib1() {
		
			Scanner keyboardInput1 = new Scanner(System.in);
// Mad Lib Prompt Idea (pghpaper.com)		
			System.out.print("Enter the name of a person: ");
			String person = keyboardInput1.nextLine();
		
			System.out.print("Enter an action (present tense): ");
			String action = keyboardInput1.nextLine();
		
			System.out.print("Enter something that Prof. Vanselow would do (-ing): ");
			String wwpvd = keyboardInput1.nextLine();
			// wwpvd = What would Prof Vanselow do
			
			// For the equation in the system
			int a = 2;
			int b = 1;
			int c = 4;
			//NUMBER OF PLANTS
			int dice1 = 0;
			Random r1 = new Random();
			dice1 = r1.nextInt(10)+1;
			int numPlants= dice1 + (a + c - b) * b % a; 

			// TYPE OF PLANTS 
			double dice2 = 0;
			Random r2 = new Random();
			dice2 = r2.nextInt(10)+1;
			double numType= dice2 + (a + c - b) * b / a;
		
			System.out.println("The coronavirus has taken a toll on everyone, especially " + person + "\n"
						+ "\n"
						+ "President Martin has asked students to " + action + "\n"
						+ "\n"
						+ "That didn't stop Professor Vanselow from " + wwpvd + "\n"
						+ "\n"
						+ "Professor Vanselow seems like a neat guy, he has " + Math.abs(numPlants) + " in his garden "
						+ "\n"
						+ "and definetly has " + Math.abs(numType) + " different plants");
	
			String compare = numType>numPlants ? "He has more variety of plant" : "He has ALOT of the same Plant"; 
			System.out.println();
			System.out.println(compare);
				
			boolean diverse = numType > 6;
			
			while (diverse == true) {
				System.out.print("What a diverse plant guy \n");	
				break; // The break is to stop the loop from becoming an infinite loop and doesnt have a reason to go to the rest of the code
			}
			
			switch(numPlants) {
			case 1:
				System.out.println("Step up your plant game sir ");
			case 2:
				System.out.println("TWO JUST TWO ");
			case 3:
				System.out.println("Eh treat yourself with another plant " );
			case 4:
				System.out.println("Yee Yee Good Plants " );
			default:
				System.out.println("WE GOT OURSELF A PLANT OWENER " );
			
			}

		}
	}
