package homework_3;
import java.util.Scanner;
public class problem_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number_type = new Scanner(System.in);
		System.out.println(“would you like to convert a binary or hexdecimal number?)
		String number_type = input.nextLine();
		if(number_type == “binary”);
			Scanner s=new Scanner(System.in);  
        			System.out.println("Enter a binary number:");
        			String n=s.nextLine();
      			System.out.println(Integer.parseInt(n,2));
		else if(number_type == “hexadecimal”);
			String digits = "0123456789ABCDEF";
         			s = s.toUpperCase();
        			 int val = 0;
        			 for (int i = 0; i < s.length(); i++)
        		 	{
             			char c = s.charAt(i);
            				 int d = digits.indexOf(c);
            			 	val = 16*val + d;
        			 }
         			return val;
			
			public static void main(String args[])
				{
    				String hexdec_num;
    				int dec_num;
    				Scanner scan = new Scanner(System.in);
	
        			System.out.print("Input a hexadecimal number: ");
    				hexdec_num = scan.nextLine();
	
    				dec_num = hex_to_decimal(hexdec_num);
		
    				System.out.print("Equivalent decimal number is: " + dec_num+"\n");
				}



	}

}
