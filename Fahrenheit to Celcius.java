//
// Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W),
//you need to convert all Fahrenheit values from Start to End at the gap of W,
//into their corresponding Celsius values and print the table.
// 
// Sample Input 1:
// 0 
// 100 
// 20
// Sample Output 1:
// 0   -17
// 20  -6
// 40  4
// 60  15
// 80  26
// 100 37

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();
		Solution.printFahrenheitTable(start, end, step);
	}
}
public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) {
        int currentValue = start;
        while(currentValue <= end){
            int fahrenheitValue = (int)((5.0/9) * (currentValue - 32));
            System.out.println(currentValue + "\t" + fahrenheitValue);
            currentValue += step;
        }
		
	}
}
