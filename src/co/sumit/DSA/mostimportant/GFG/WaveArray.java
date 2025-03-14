package co.sumit.DSA.mostimportant.GFG;

//https://www.geeksforgeeks.org/most-asked-dsa-interview-problems-for-beginners/
public class WaveArray {

	
	//https://www.geeksforgeeks.org/problems/wave-array-1587115621/1
	public static void convertToWave(int[] arr) {
        int len=0;
		if(arr.length%2==0) {
        	len = arr.length/2;
        }else {
        	len = arr.length/2;
        }
		for(int i=0,j=0;i<len;i++,j=j+2) {
			if(j<arr.length) {
				swap(arr,j,j+1);
			}
			
		}
		
    }
	
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4,5,6};
		convertToWave(arr);
		
		for(int e:arr) {
			System.out.print(e+" ");
		}
	}

}
