import java.util.* ;
import java.io.*; 
public class LongestNonRepeatLength 
{
	public static int uniqueSubstrings(String input) 
    {
		//write your code here
		char [] ch = input.toCharArray();
		int [] position = new int [26];
		Arrays.fill(position, -1);
		int l = 0, r = 0, maxLen = 0, n = ch.length;
		while(l < n && r < n){
			if(position[ch[r]-'a'] != -1) l = Math.max(position[ch[r]-'a'] + 1, l);
			position[ch[r]-'a'] = r;
			maxLen = Math.max(r-l+1, maxLen);
			r++;
		}
		return maxLen;

	}
}
