// 

// Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
// Fibonacci Series is defined by the recurrence
//     F(n) = F(n-1) + F(n-2)
// where F(0) = 0 and F(1) = 1

// Sample Input 1 :
// 5
// Sample Output 1 :
// true

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(Solution.checkMember(n));
	}

}



public class Solution {
	
	public static boolean checkMember(int n){

 int a = 0;
            int b = 1;
            if (n==a || n==b) return true;
            int c = a+b;
            while(c<=n)
            {
                if(c == n) return true;
                a = b;
                b = c;
                c = a + b;
            }
            return false;
	}
	

}






