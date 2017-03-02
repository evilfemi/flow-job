import java.io.Scanner;

public class InputFile{
	
	public static void main(String [ ] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the First Number");


		double Score1 = input.nextDouble();
		System.out.println("Enter the Second Number");

		double Score2 = input.nextDouble();

		double avg = (Score1 + Score2) / 2;

		System.out.println("Your average Score is "+ avg);

	}


}
