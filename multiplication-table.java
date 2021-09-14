/***********
 * Multiplication table
 * 
 * Write a program to print multiplication table of n
 * 
 * Input Format :
    A single integer, n
    Output Format :
    First 10 multiples of n each printed in new line
    Constraints :
    0 <= n <= 10,000
    Sample Input 1 :
    2
    Sample Output 1 :
    2
    4
    6
    8
    10
    12
    14
    16
    18
    20
 * 
 * **********/




import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        
       Scanner scan = new Scanner(System.in);
       int num = scan.nextInt();
    for (int i=1; i<=10;i++) {
        int product = num * i;
        System.out.println(product);
    }
	}
}

