import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class longest_nonrepaetingsubstrng {
	
	public static void LNS(String s) {
		int l=0;
		String z="";
		char arr[]=s.toCharArray();
		Map<Character, Integer> map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<arr.length;i++) {
			char ch=arr[i];
			if(!map.containsKey(ch)) {
				map.put(ch,i);
				
			}else {
				i=map.get(ch);
				map.clear();
				
			}
			if(map.size()>l) {
				l=map.size();
				Set<Character> c=map.keySet();
				z=c.toString();

			}
		}
		System.out.println(l);
		System.out.println(z);
		
	}
	public static void main(String[] args) {
		LNS("abcabcd");
	}

}
