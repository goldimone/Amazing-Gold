import java.io.*;
public class Airplane{	
	public static void main(String[] args)throws IOException{
		//Declaration of local variables
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] seats = {{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},
		{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},
		{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6}};
		String[] ticket = {"First Class","Business Class","Economy"};
		String choice ;
		int row;
		int column;		
		
		//LOOP
		OUTER: while(true){
			choice = "";
			row = 0;
			column = 0;
			//try-catch
			try{
				//User Input
				System.out.printf("Please choose the ticket type below\n"
				+ "[1]%s\n[2]%s\n[3]%s\n",ticket[0],ticket[1],ticket[2]);
				System.out.print("> ");
				choice = br.readLine();
				//Check if the choice is the same as the expected input
				if(choice.toLowerCase().equals("1")||choice.toLowerCase().equals(ticket[0].toLowerCase())){
					System.out.println("\nEnter Row[1-3]");	
					System.out.print("> ");
					row = Integer.parseInt(br.readLine());	
					//checks if the row inputted is within the given range
					if(row>3||row<1){ 
						System.out.println("Please choose the number in the given range\n");
						continue;
					}
				}else if(choice.toLowerCase().equals("2")||choice.toLowerCase().equals(ticket[1])){
					System.out.println("\nEnter Row[4-8]");
					System.out.print("> ");
					row = Integer.parseInt(br.readLine());	
					//checks if the row inputted is within the given range
					if(row>8||row<4){ 
						System.out.println("Please choose the number in the given range\n");
						continue;
					}
				}else if(choice.toLowerCase().equals("3")||choice.toLowerCase().equals(ticket[2])){
					System.out.println("\nEnter Row[9-13]");
					System.out.print("> ");
					row = Integer.parseInt(br.readLine());
					//checks if the row inputted is within the given range
					if(row>13||row<9){ 
						System.out.println("Please choose the number in the given range\n");
						continue OUTER;
					}	
				}else{ 
					System.out.println("Please enter the number of your choice.\n");
					continue;
				}

				System.out.println("Enter column[1-6]");
				System.out.print("> ");
				column = Integer.parseInt(br.readLine());
				//checks if the column inputted is within the given range
				if(column>6||column<1){
					System.out.println("Please enter the number in the given range\n");
					continue;
				}
				//prompts the user if the seat is already taken
				if(seats[row-1][column-1]==-1){
					System.out.println("The seat is already taken, please change seats.\n");
					continue;
				}
				//changes the value to something that would mean 'occupied'
				seats[row-1][column-1] = -1;
				//calls the method
				showSeats(seats);
				while(true){
					System.out.println("Would you like to try again?\n[1]Yes\n[2]No");
					System.out.print("> ");
					choice = br.readLine();
					if(choice.equals("1")||choice.toLowerCase().equals("yes")){
						break;
					}else if(choice.equals("2")||choice.toLowerCase().equals("no")){
						break OUTER;
					}else{
						System.out.println("Please choose only the given.");
					}
				}
			}catch(Exception e){
				System.out.println("Error");
			}
		}			 
	}
	public static void showSeats(int[][] seats){
		for(int i = 0;i<seats.length;i++){
			for(int i2 = 0;i2<seats[i].length;i2++){
				switch(seats[i][i2]){
					case -1: 	System.out.print("\tX");
								break;
					default:	System.out.print("\t*");
				}
			}
			System.out.println();
		}
	}
}