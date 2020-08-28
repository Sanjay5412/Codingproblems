
public class LongestCommonSubstring {
	public static int LCS(String s1,String s2) {
		int A[][] = new int[s1.length()+1][s2.length()+1];
		int max=0;
		//int s=0,e=0;
		for(int i=1;i<=s1.length();i++) {
			for(int j=1;j<=s2.length();j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					A[i][j]=A[i-1][j-1]+1;
					if(max<A[i][j]) {
						max=A[i][j];
						
					}
				}
			}
		}
		//System.out.println();
		return max;
		
	}
	public static void main(String[] args) {
		String s1="  ";
		String s2="  ";
		System.out.println(LCS(s1.replaceAll(" ",""),s2.replaceAll(" ","")));
	}

}
