package co.sumit.DSA.mostimportant.GFG;

//https://www.geeksforgeeks.org/most-asked-dsa-interview-problems-for-beginners/
public class RotateByNinetydegree {
//https://www.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1
	public static void main(String[] args) {
		int n = 3;

		int[][] arr = {
				{ 1,2,3 }, 
				{ 4,5,6 }, 
				{ 7,8,9 }
				};
		rotateby90(n, arr);
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

	static void rotateby90(int n , int arr[][]) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int temp = arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
		for(int i=0;i<n/2;i++) {
			for(int j=0;j<n;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[n-i-1][j];
				arr[n-i-1][j]=temp;
			}
		}
	}
}
