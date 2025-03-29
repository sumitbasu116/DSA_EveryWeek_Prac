package co.sumit.DSA.mostimportant.GFG.slidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LastNegativeNumberOfSizeKWindow {

	public static void main(String[] args) {
		int[] arr = { -1,2,1,-4,-3,2,-5,1,2,-7 };
		int k = 3;

		List<Integer> resList = new ArrayList<>();
		solve(arr,k,resList);
		resList.stream().forEach(e->System.out.print(e+" "));

	}

	private static void solve(int[] arr, int k, List<Integer> resList) {
		Stack<Integer> S = new Stack<>();
		int i=0,j=0;
		
		while(j<arr.length) {
			if(arr[j]<0) {
				S.push(arr[j]);
			}
			if(j-i+1<k) {
				j++;
			}
			else if(j-i+1==k) {
				if(S.isEmpty()) {
					resList.add(0);
				}else {
					resList.add(S.peek());
				}
				if(arr[i]==S.peek()) {
					S.pop();
				}
				i++;j++;
			}
		}
		
	}

}
