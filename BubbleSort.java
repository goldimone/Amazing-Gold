import java.util.*;
public class BubbleSort{
	public static void main(String[] args){
		int[] array = {5,1,4,2,8,21,43,51,6,7,-2,-5,-6};
		for(int i2 = 0;i2<array.length-1;i2++){
			for(int i = 0;i<array.length-i2-1;i++){
				if(array[i]>array[i+1]){
					array[i] = array[i] + array[i+1];
					array[i+1] = array[i] - array[i+1];
					array[i] = array[i] - array[i+1];
				}
			}
		}
		for(int counter = 0;counter<array.length;counter++){
			System.out.print(array[counter]+" ");
		}
	}
}