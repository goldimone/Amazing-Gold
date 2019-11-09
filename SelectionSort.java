public class SelectionSort{
	public static void main(String[] args){
		int array[] = {5,21,56,23,-3},index;
		for(int i = 0;i<array.length;i++){
			index = i;
			for(int i2 = i+1;i2<array.length;i2++){
				if(array[i]>array[i2])
					index = i2;
			}
			if(index != i){
				array[i] = array[index] + array[i];
				array[index] = array[i] - array[index];
				array[i] = array[i] - array[index];
			}
		}
		for(int i3 = 0;i3<array.length;i3++){
			System.out.print(array[i3] + " ");
		}
	}
}