package co.sumit.DSA.mostimportant.GFG;

//https://www.geeksforgeeks.org/most-asked-dsa-interview-problems-for-beginners/
public class WaveArray {
	//https://www.geeksforgeeks.org/problems/wave-array-1587115621/1
	public static void convertToWave(int[] arr) {
        
		for(int i=0;i<arr.length-1;i=i+2) {
			int temp = arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4,5,6};
		convertToWave(arr);
		
		for(int e:arr) {
			System.out.print(e+" ");
		}
	}

}
