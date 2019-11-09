import java.util.Scanner;
public class Flames{
	public static void main(String[] args){
		OUTER: do{
			//This is input		
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter your name: ");
			String input = scan.nextLine().toLowerCase();
			System.out.print("Enter your crush's name: ");
			String input2 = scan.nextLine().toLowerCase();
			String combine = "";
			int count = 0;
			//This is to get the repeared letters
			for(int i = 0;i<input.length();i++){
				for(int i2 = 0; i2<input2.length();i2++){
					if(input.charAt(i) == input2.charAt(i2) && input.charAt(i) != ' '){
						combine = combine.concat(input.charAt(i)+"");
					}	
				}
			}
			//This is to count the repeated letters in both input
			char[] combineIn = input.concat(input2).toCharArray();// combining the two inputs
			for(int i = 0;i<combineIn.length;i++){
				for(int i2 = 0;i2<combine.length();i2++){
					if(combineIn[i] == combine.charAt(i2)){//Compare each of the letter of the combined inputs with each of the letter of the repeated letters 
						count++;
						combineIn[i] = ' '; //Change the 
					}
				}
			}
			//Print out
			System.out.println("\nThe total number of character repeated is: " + count);
			if(count>0){
				switch(count%6){
					case 1:	System.out.println("You are Friends");
							break;
					case 2: System.out.println("You are Lovers");
							break;
					case 3:	System.out.println("You are Affectionate");
							break;
					case 4: System.out.println("You are Marriage");
							break;
					case 5:	System.out.println("You are Enemies");
							break;
					case 0: System.out.println("You are Sexy Lovers!!");		
				}
			}else{
				System.out.println("You're not meant for each other.");
			}
			INNER: while(true){
				System.out.print("\nDo you want to try again?(Y/N): ");
				input = scan.nextLine();
				if(input.toLowerCase().charAt(0)=='n')
					break OUTER;
				else if(input.toLowerCase().charAt(0)=='y')
					break;
				else{
					System.out.println("Invalid input.");					
				}
			}
			System.out.println();
		}while(true);
	}
}