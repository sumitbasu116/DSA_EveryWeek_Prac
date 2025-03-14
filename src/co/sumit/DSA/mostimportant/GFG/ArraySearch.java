package co.sumit.DSA.mostimportant.GFG;

//https://www.geeksforgeeks.org/most-asked-dsa-interview-problems-for-beginners/
public class ArraySearch {
//https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
	public static void main(String[] args) {

	}

	static int search(int arr[], int x) {

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        
        return -1;
    }

}
