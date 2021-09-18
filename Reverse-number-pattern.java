//
//  Reverse Number Pattern
//
//
//  Print the following pattern for the given N number of rows.
//        Pattern for N = 4
//        1
//        21
//        321
//        4321

import java.util.*;
public class Solution {


    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int currRow = 1;

        while(currRow <= n) {
            int currCol = currRow;

            while(currCol >= 1){
                System.out.print(currCol);
                currCol -= 1;
            }
            System.out.println();
            currRow += 1;
        }

    }

}
