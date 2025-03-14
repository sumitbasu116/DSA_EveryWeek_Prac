package co.sumit.DSA.mostimportant.GFG;

//https://www.geeksforgeeks.org/most-asked-dsa-interview-problems-for-beginners/
public class MinAndMaxInArray {
//https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1

	private static class Pair<K, V> {
		private final K key;
		private final V value;
		
		public Pair(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public K getKey() {
			return key;
		}

		public V getValue() {
			return value;
		}
	}

	public static Pair<Integer, Integer> getMinMax(int[] arr) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		Pair<Integer, Integer> res = null;
				
		if(arr.length==0) {
			res = new Pair<Integer, Integer>(-1, -1);
		}else if(arr.length==1) {
			res = new Pair<Integer, Integer>(arr[0], arr[0]);
		}
		for(int e:arr) {
			if(e>max) {
				max=e;
				res = new Pair<Integer, Integer>(min, max);
			}
			if(e<min) {
				min=e;
				res = new Pair<Integer, Integer>(min, max);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = {3 ,2 ,1 ,56 ,1000, 167};
		try {
			Pair<Integer, Integer> res=getMinMax(arr);
			System.out.println(res.getKey()+" "+res.getValue());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
