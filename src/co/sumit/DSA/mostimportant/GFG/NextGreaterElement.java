package co.sumit.DSA.mostimportant.GFG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
//https://www.geeksforgeeks.org/most-asked-dsa-interview-problems-for-beginners/
public class NextGreaterElement {
//https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1
	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 4};
		
		List<Integer> res = nextLargerElement(arr);
		
		res.stream().forEach(e->System.out.print(e+" "));
	}
	
	public static List<Integer> nextLargerElement(int[] arr) {
		List<Integer> res = new ArrayList<>();
		
		Stack<Integer> S = new Stack<>();
		
		for(int i=arr.length-1;i>=0;i--) {
			
			if(S.size()==0) {
				res.add(-1);
			}
			else if(S.size()>0&&S.peek()>arr[i]) {
				res.add(S.peek());
			}else if(S.size()>0&&S.peek()<=arr[i]) {
				while(S.size()>0&&S.peek()<=arr[i]) {
					S.pop();
				}
				if(S.size()==0) {
					res.add(-1);
				}
				else if(S.peek()>arr[i]) {
					res.add(S.peek());
				}
			}
			S.push(arr[i]);
		}
		Collections.reverse(res);
		return res;
    }
}
