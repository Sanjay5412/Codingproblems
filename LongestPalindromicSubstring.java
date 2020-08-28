
public class LongestPalindromicSubstring {
	
	public static int LPS(String s1) {
		int max=0;
		int start=0,end=0;
		int A[][] = new int[s1.length()][s1.length()];
		for(int i=0;i<s1.length()-1;i++) {
			A[i][i]=1;
			if(s1.charAt(i)==s1.charAt(i+1)) {
				A[i][i+1]=1;
			}
			else {
				A[i][i+1]=0;
			}
		}
		for(int k=3;k<=s1.length();k++){
			for(int i=0;i<s1.length()-k+1;i++) {
				int j=i+k-1;
				if(s1.charAt(i)==s1.charAt(j)&&A[i+1][j-1]==1) {
					A[i][j]=1;
					if((j-i)>max) {
						max=j-i+1;
						start=i;
						end=j+1;
					}
					
				}
			}
		}
		System.out.println(s1.substring(start, end));
		
	return max;	
	}
	
	public static void main(String[] args) {
		String s="adctomatootamotsmkjdhfaaagbbaabbgbhhh";
		System.out.println(LPS(s));
	}

}
