import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    String returnValue;
    
    public String evenOrOdd(int n) {
        if(n % 2 == 0) {
            if (n <= 5 && n>= 3) {
                this.returnValue = "Not Weird";
            } else if (n >= 6 && n <= 20) {
                this.returnValue = "Weird";
            } else {
                this.returnValue = "Not Weird";
            }
        } else {
            // odd
            this.returnValue = "Weird";
        }
        return this.returnValue;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        Solution newSolution = new Solution();
        System.out.println(newSolution.evenOrOdd(N));
    }
    
}
