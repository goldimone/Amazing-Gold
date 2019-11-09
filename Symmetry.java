import java.util.Scanner;
public class Symmetry{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int arr[][],i,i2,input;
		boolean check = true,check2 = true;
		System.out.print("Enter number: ");
		input = scan.nextInt();
		if(input>0&&input<=10){
			arr = new int[input][input];
			for(i = 0;i<input;i++){
				for(i2 = 0;i2<input;i2++){
					arr[i][i2] = scan.nextInt();
				}
			}
			//Method 1
			/*for(i = 0;i<input;i++){
				for(i2 = 0+i;i2<input;i2++){
					if(arr[i][i2]==arr[i2][i]){
						check = true;
					}else{
						i = input;
						check = false;
						break;
					}
				}
			}*/
			//Method 2
			/*for(i = 0;i<input/2;i++){
				for(i2 = i;i2<input-1-i;i2++){
					if(arr[i][i2]==arr[i2][i]&&arr[i][i2]==arr[input-1-i2][input-1-i]
					&&arr[i2][i]==arr[input-1-i][input-1-i2]
					&&arr[input-1-i][input-1-i2]==arr[input-1-i2][input-1-i]){
						check = true;
					}else{
						i = input;
						check = false;
						break;
					}
				}
			}*/
			//Method 3
			for(i = 0;i<input;i++){
				for(i2 = 0+i;i2<input;i2++){
					if(arr[i][i2]==arr[i2][i]){
						check = true;
					}else{
						i = input;
						check = false;
						break;
					}
				}
			}
			for(i = 0;i<input;i++){
				for(i2 = i;i2<input;i2++){
					if(arr[i][input-i2-1]==arr[i2][input-i-1]){
						check2 = true;
					}else{
						i = input;
						check2 = false;
						break;
					}
				}
			}
			if(check&&check2)
				System.out.println("Yes");
			else
				System.out.println("No");
		}else
			System.out.println("Error");
	}
}