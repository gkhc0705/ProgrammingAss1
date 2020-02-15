import java.util.Scanner;

public class URL
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a URL: ");
		String address = kb.nextLine();
		int space = address.length();
		String str = "";
		String address2 = address.substring(0,8);

		if(address2.equals("https://"))
		{
			System.out.println("Verifying an URL with " + space + " characters...");
			System.out.println("Is this a valid and secure URL? true.");
		}
		else
		{
			System.out.println("Is this a valid and secure URL? false.");
		}


	}
}


