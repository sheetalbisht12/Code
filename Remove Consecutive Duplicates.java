public class Solution {
	public static String removeConsecutiveDuplicates(String s) {

		// Write your code here
		int n=s.length();

        // base case
		if(n<2){
			return s;
		}

		// main work
		// we'll start checking from end
		
		if(s.charAt(n-1)==s.charAt(n-2)){
			// if last two char are same then we'll call the function for substring minus last char
			s=s.substring(0, n-1);
			return removeConsecutiveDuplicates(s);
		}
		else{
			// if the last two char are not same then 
			// the last char is stored in el
			char el = s.charAt(n-1);
			s=s.substring(0, n-1);
			// here we'll check for s from i=0 to i=n-2 and the last char will be appended
			return removeConsecutiveDuplicates(s) + el;
		}
	}

}
