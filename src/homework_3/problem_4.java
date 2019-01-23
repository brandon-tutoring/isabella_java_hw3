package isabella_java_hw3.isabella_java_hw3.src.homework_3;
import java.util.Scanner;
public class problem_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Loan Amount:");
		String amount = scanner.nextLine();
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Number Of Years:");
		String years = scanner1.nextLine();
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Annual Interest Rate:");
		String interest = scanner2.nextLine();
		
		int amount_2 = Integer.parseInt(amount);	
		int years_2 = Integer.parseInt(years);	
		int interest_2 = Integer.parseInt(interest);	
		
		int months = (years_2 * 12);
		int monthly_amount = amount_2 * (interest_2 * (1 + interest_2)^ months/(1 + interest_2)^ months - 1);
		System.out.println("Monthly Amount:" + monthly_amount);
		System.out.println("Total Amount:" + amount);

		int p = 0; 
		while (p > months);
			p += 1;
			
		int interest_rate = interest_2 * amount_2;
		int principal = monthly_amount - interest_rate;
		int amount_3 = amount_2 - principal;
		
		

	}

}
