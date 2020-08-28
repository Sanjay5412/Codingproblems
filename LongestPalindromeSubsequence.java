
public class LongestPalindromeSubsequence {
	public static int LPS(String s) {
		
		int A[][]=new int[s.length()][s.length()];
		for(int i=0;i<s.length();i++) {
			A[i][i]=1;
		}
		for(int k=2;k<=s.length();k++) {
			for(int i=0;i<s.length()-k+1;i++) {
				int j=i+k-1;
				if(s.charAt(i)==s.charAt(j)&&k==2) {
				A[i][j]=2;
				}
				else if(s.charAt(i)==s.charAt(j)) {
					A[i][j]=2+A[i+1][j-1];
				}
				else {
					if(A[i+1][j]>A[i][j-1]) {
						A[i][j]=A[i+1][j];
					}else A[i][j]=A[i][j-1];
				}
			}
		}
		
		
		
		
		
		return A[0][s.length()-1];
	}
	public static void main(String[] args) {
		String s="agbdba";
		System.out.println(LPS(s));
	}

}
