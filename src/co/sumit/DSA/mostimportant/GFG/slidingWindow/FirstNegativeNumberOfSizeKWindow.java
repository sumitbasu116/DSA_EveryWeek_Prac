package co.sumit.DSA.mostimportant.GFG.slidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://drive.google.com/file/d/1GVvlPaepTwJsG2CUG4f7Xk93Tj1qmSDg/view?usp=drive_link
public class FirstNegativeNumberOfSizeKWindow {

	public static void main(String[] args) {
		int[] arr = {-1,-2,8,14,3,9,-1,-9};
		int k=3;
		List<Integer> resList = new ArrayList<>();
		solve(arr,k,resList);
		resList.stream().forEach(e->System.out.print(e+" "));
	}

	private static void solve(int[] arr, int k, List<Integer> resList) {
		Queue<Integer> Q = new LinkedList<>();
		int i=0,j=0;
		while(j<arr.length) {
			if(arr[j]<0) {
				Q.add(arr[j]);
			}
			if(j-i+1<k) {
				j++;
			}else if(j-i+1==k) {
				if(Q.isEmpty()) {
					resList.add(0);
				}else {
					resList.add(Q.peek());
				}
				if(!Q.isEmpty()&&Q.peek()==arr[i]) {
					Q.poll();
				}
				i++;j++;
			}
			
		}
	}
	
	

}
