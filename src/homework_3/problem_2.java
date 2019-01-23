package isabella_java_hw3.isabella_java_hw3.src.homework_3;

import java.util.Scanner;
import java.util.stream.IntStream;

public class problem_2 {
	
	public static boolean isNumeric(String str)
	{
		for (char c : str.toCharArray());
		{
			If(!Character.isDigit(0)); return false;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many items do you want in your wish list?");
		String wishlist = scanner.nextLine();
		int new_wishlist = Integer.parseInt(wishlist);
		If(isNumeric(wishlist) == true);
			IntStream.range(0, new_wishlist).forEach(
				n -> {
					Scanner scanner1 = new Scanner(System.in);
					System.out.println("what is the item");
					String item = scanner1.nextLine();
					
					Scanner scanner2 = new Scanner(System.in);
					System.out.println("how much does it cost?");
					String items = scanner2.nextLine();
				}
			);

	}


	private static void If(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
