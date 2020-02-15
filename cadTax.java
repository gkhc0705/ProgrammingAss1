import java.util.Scanner;

public class cadTax
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter amount in CAD: ");
		double cad = kb.nextDouble();
		double tax = cad * 0.15;
		double cTax = cad + tax;
		System.out.printf("\nThe amount of tax is: %.2f\n", tax);
		System.out.printf("The total amount to pay is: %.2f\n", cTax);
	}
}