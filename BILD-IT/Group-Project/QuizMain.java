import java.util.Scanner;

public class QuizMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numberOne = input.nextInt();
		int numberTwo = input.nextInt();
		double answer = input.nextDouble();
		int choice;
		boolean isTrue = true;
		
		
		do{
			
			System.out.printf(" Unesite broj operacije koju zelite da kviz radi!");
			System.out.printf(" Broj 1 za sabiranje \n Broj 2 za oduzimanje \n ");
			System.out.printf(" Broj 3 za mnozenje \n Broj 4 za djeljenje \n ");
			System.out.printf(" Broj 5 za kvadratiranje \n Broj 6 za korjenovanje \n ");
			
			choice = input.nextInt();
			
			switch(choice){
			
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				System.out.printf(" Pograsan unos,pokusajte ponovo!\n ");
				break;
			}
		}while(isTrue);
		
		Quiz quiz = new Quiz(numberOne, numberTwo, answer);

	}

}
