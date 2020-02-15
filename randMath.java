import java.util.Random;

public class randMath
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int randNum = rand.nextInt(100);
		System.out.println("Random number between 1 to 100 is: " + randNum);
		int a1 = 2;
		int a2 = 3;
		double p1 = Math.pow(randNum, a1);
		System.out.printf("Result power of 2: %.0f\n", p1);
		double p2 = Math.pow(randNum, a2);
		System.out.printf("Result power of 3: %.0f\n", p2);
		double p3 = Math.sqrt(randNum);
		System.out.printf("Square root of result: %.2f\n", p3);
		double p4 = Math.log(randNum);
		System.out.printf("Logarithm of result: %.2f\n", p4);
		double p5 = Math.log(randNum) / Math.log(10);
		System.out.printf("Logarithm base 10 of result: %.2f\n", p5);
	}
}