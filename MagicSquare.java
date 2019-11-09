public class MagicSquare {
    public static void main(String[] args) { 
		int size = 5,i = 0,i2 = size/2,n=1,nI,nI2;
		int[][] square = new int[size][size];	
		while(n<=size*size){
			square[i][i2] = n;
			n++;
			nI = (i-1+size)%size;
			nI2 = (i2+1)%size;
			/*nI = (i+1)%size;
			nI2 = (i2+1)%size;*/
			if(square[nI][nI2]>0)
				i=(i+1+size)%size;
				//i = (i-1+size)%size;
			else{
				i = nI;
				i2 = nI2;
			}
		}
		for(i = 0;i<size;i++){
			for(i2 = 0;i2<size;i2++){				
				System.out.print("\t"+square[i][i2]);
				sum += square[i][i2];
			}
		}
    }
}

/*
[ 8 1 6 
  4 9 2 
  3 5 7 ]
*/