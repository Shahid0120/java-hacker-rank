import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    int highNumber = 1;
    int numberInput;
    int sum;
    String output = ""; 
    
    public String multiples(int number) {
        this.numberInput = number;
        String oneLine = "";
        while(highNumber < 11) {
            if (this.highNumber == 10) {
                oneLine = individualLine();
            } else {
               oneLine = individualLine() + "\n"; 
            }
            this.output += oneLine;
            this.highNumber = this.highNumber + 1;
            this.sum = 0;
            oneLine = "";
        }
        return this.output;
    }
    
    public String individualLine() {
        this.sum = this.numberInput * this.highNumber;
        return this.numberInput + " x " + this.highNumber + " = " + this.sum;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        Solution newSolution = new Solution();
        newSolution.multiples(N);
        System.out.println(newSolution.multiples(N));
    }
    
}