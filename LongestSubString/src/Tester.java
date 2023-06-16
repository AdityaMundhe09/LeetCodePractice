
public class Tester {

	private static int uniqueLength(String s) {
		// TODO Auto-generated method stub
		int length=1;
		
		for(int i=0;i<s.length()-1;i++) {
			length=1;
			for(int j=1;j>i;j--) {
				if(s.charAt(i)!=s.charAt(j)) {
					length++;
				}
				break;
			}
		}
		
		return length;
	}
	
	
	public static void main(String[] args) {
		String s ="abcbbabcdddc";
		System.out.println("ans is: "+uniqueLength(s));
	}

	
}
