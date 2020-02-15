import java.util.Scanner;

public class sumofDigits
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
        System.out.print("Enter a 3 digits number: ");
        String num = kb.nextLine();
        char firstDig = num.charAt(0);
        System.out.println("First digit: " + firstDig);
        char secondDig = num.charAt(1);
        System.out.println("Second digit: " + secondDig);
        char thirdDig = num.charAt(2);
        System.out.println("Thid digit: " + thirdDig);
        int num1 = firstDig;
        int num2 = secondDig;
        int num3 = thirdDig;
        int sum = (num1 + num2 + num3) - 144;
        System.out.println("The sum of 3 digits is: " + sum);
	}
}