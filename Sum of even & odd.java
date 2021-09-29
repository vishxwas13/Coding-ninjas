// Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.

// Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.


// Sample Input:
// 1234
// Sample Output :
// 6 4




import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int even = 0 , odd = 0;
        while(n>0){
            int digit = n % 10;
             n = n / 10;
            if(digit%2==0){
                even = even+digit;
            }
            else {
                odd= odd+digit;
            }

        }
        System.out.println(even +" "+ odd);
    }
}
