package lines;

import java.util.Arrays;

public class Main {
	public static void main (String[] args){
		String S = "abcdefghijklmnopqrstuvwxyz";
		
		int[] width = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		
		System.out.println("S: " + S + " width: " + Arrays.toString(width));
		
		System.out.println("Solution: " +  Arrays.toString(numberOfLines(width, S)));
	}
	
    public static int[] numberOfLines(int[] widths, String S) {
        int res = 1;
        
        int current = 0;
        
        for (char c : S.toCharArray()){
            int width = widths[c - 'a'];
            
            res = current + width > 100 ? res + 1 : res;
            
            current = current + width > 100 ? width : current + width;
        }
        
        return new int [] {res, current};
    }
}
