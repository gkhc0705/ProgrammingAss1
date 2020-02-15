import java.util.Scanner;

public class Roadtrip
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the distance in kilometers: ");
		double distance = kb.nextDouble();
		System.out.print("Enter average distance with 1L of gas: ");
		double average = kb.nextDouble();
		double estimatedP = ((distance * average)/2) * 1.16;
		System.out.printf("The estimated price of this roadtrip is: %.2f ", estimatedP);
	}
}