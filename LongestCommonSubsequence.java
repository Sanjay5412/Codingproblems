public class LongestCommonSubsequence {
	public  int LCS(String s1,String s2) {
		//int max=0;
		int a[][] = new int[s1.length()+1][s2.length()+1];
		for(int i=0;i<=s1.length();i++) {
			for(int j=0;j<=s2.length();j++) {
				if(i==0||j==0) {
					a[i][j]=0;
				}
				else if(s1.charAt(i-1)==s2.charAt(j-1)) {
					a[i][j]=1+a[i-1][j-1];
				}else {
					if(a[i-1][j]>a[i][j-1]) {
						a[i][j]=a[i-1][j];
					}else a[i][j]=a[i][j-1];
				}
			}
		}

		return a[s1.length()][s2.length()];
	}
	public static void main(String[] args) {
		LongestCommonSubsequence l=new LongestCommonSubsequence();
		String s1="";
		String s2="";
		System.out.println(l.LCS(s1,s2));
	}

} 
//Will executes successfully in ecllipse
