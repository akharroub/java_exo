package riverI;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	 public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        long r1 = in.nextLong();
	        long r2 = in.nextLong();
	        
	        HashMap<Long,Boolean> river = new HashMap<Long,Boolean>();
	        
	        while (true) {
	            river.put(r1,true);
	            river.put(r2,true);
	            
	            r1 = reslt(r1);
	            r2 = reslt(r2);
	            
	            
	            if (river.containsKey(r1)) {
	                System.out.println(r1);
	                return;
	                }
	            if (river.containsKey(r2)) {
	                System.out.println(r2);
	                return;
	                }
	        }
	        // Write an action using System.out.println()
	        // To debug: System.err.println("Debug messages...");

	        //System.out.println("42");
	    }
	    
	    static long reslt(long num) {
	        long rsl = num;
	        while (num>0) {
	            rsl = rsl+num%10;
	            num = num/10;
	        }
	        return rsl;
	    }

}
