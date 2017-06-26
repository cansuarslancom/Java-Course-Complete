import java.util.*;

public class question3 {

		private static Scanner keyboard;
		private static String input;
		private static String[] inputToArray;
		private static int option;
		
		
	public static void main(String[] args) {
		
		System.out.println("Enter 1 to encrypt! OR Enter 2 for decryption! >");
		 keyboard = new Scanner(System.in);
		 option =keyboard.nextInt();
		
			if(option ==1) 
			{
				System.out.println("Welcome to encrypt!>\n");
			    keyboard = new Scanner(System.in);
				input =keyboard.nextLine();
				inputToArray = input.split("\\W+");
		        char[] sezar= input.toCharArray();
		        System.out.println("Enter the amount of the shift.");
		        int index = keyboard.nextInt();
		        encryption(sezar,index);
				
			}
			else if(option ==2)
			{
	            System.out.println("Welcome to decryption...Please, Enter the encrypted text...>\n");
	            keyboard = new Scanner(System.in);
				input =keyboard.nextLine();
				System.out.println("Enter the amount of the shift.");     
		        int index = keyboard.nextInt();
		        char[] sezar= input.toCharArray();
		        decryption(sezar,index);
			}
			else
				System.out.println("Please enter the correct options!");
			
	  }

	public static void encryption(char[] sezar, int index)
	{
		String encryptedText =" ";
		for (int i = 0; i < sezar.length; i++) 
		{    
	    	int ascii=(int) sezar[i]; 
	        ascii+=index;   
	        String aChar = new Character((char) ascii).toString();
	        encryptedText += aChar;    
		}
	    System.out.println(encryptedText);
	}


	public static void decryption(char[] sezar, int index)
	{
		String decryptedText =" ";
	    for (int i = 0; i < sezar.length; i++) 
	       {    
	    	int ascii=(int) sezar[i];
	        ascii-=index;   
	        String aChar = new Character((char) ascii).toString();
	        decryptedText += aChar;    
		    }
	    System.out.println(decryptedText);
	  }
	}
