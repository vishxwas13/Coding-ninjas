// You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2).
//   Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these,
// there is a single integer value that is present twice.
//     You need to find and return that duplicate number present in the array.


// Sample Input 1:
// 1
// 9
// 0 7 2 5 4 7 1 3 6
// Sample Output 1:
// 7

/*******     Main code   ********/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
        String[] strNums; 
        strNums = br.readLine().split("\\s");
        

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input = takeInput();
            System.out.println(Solution.duplicateNumber(input));
        
            t -= 1;
        }
    }
}
/*******     Main code   ********/

public class Solution{  
    
      public static ArrayList < Integer > findDuplicates(int[] arr, int n) {
        ArrayList < Integer > ans = new ArrayList < > ();
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                ans.add(arr[i]);
                while (i < n - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
            }
        }

        return ans;
    }
}
