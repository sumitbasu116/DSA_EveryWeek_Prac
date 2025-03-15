package co.sumit.DSA.mostimportant.GFG;
//https://www.geeksforgeeks.org/most-asked-dsa-interview-problems-for-beginners/
public class TransposeOfMatrix {
//https://www.geeksforgeeks.org/problems/transpose-of-matrix-1587115621/1
	public static void main(String[] args) {
		int n=4;
		
		int[][] arr = {{1, 1, 1, 1},
				{2, 2, 2, 2},
				{3, 3, 3, 3},
				{4, 4, 4, 4}
				};
		transpose(n,arr);
		printMatrix(arr);
	}
	public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
	
	public static void transpose(int n, int arr[][]) {
		for(int i=0;i<n;i++) {
			//https://youtu.be/cr_rF1ovONg?list=PLQzZEqawBqdIOS2ZlCX1ZYj38GtDNVgMQ ==> T:03:27
			for(int j=i+1;j<n;j++) { //// Swap only upper triangle
				int temp = arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
	}
}
