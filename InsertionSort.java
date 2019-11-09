public class InsertionSort{
	public static void main(String[] args){
		int arr[] = {12,11,13,5,6},length = arr.length,temp = 0;
		for(int i = 1;i<length;i++){
			for(int i2 = i-1;i2>=0&&arr[i2]>arr[i2+1];i2--){
				if(arr[i2]>arr[i2+1]){
					temp = arr[i2];
					arr[i2] = arr[i2+1];
					arr[i2+1] = temp;
				}
			}
		}
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}