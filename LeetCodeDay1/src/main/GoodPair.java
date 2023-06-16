package main;

public class GoodPair {

	public static int noOfGoodPairs(int[] a) {
		// TODO Auto-generated method stub
		
		int count=0;
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		int[] a = {1,1,1,1};
		
		System.out.println("No. of good pairs :"+noOfGoodPairs(a));
	}

	
}
