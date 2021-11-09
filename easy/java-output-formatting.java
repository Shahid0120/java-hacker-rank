import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
            String whiteSpace = ""; 
            int fittenDigitSpace = 0;
            Scanner sc=new Scanner(System.in);
            
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                // check if the number is 3 digits long
                
                // check lenght of s1 
                // subtract lenght of s1 from 15 
                fittenDigitSpace = 15 - s1.length(); 
                while (fittenDigitSpace > 0) {
                    whiteSpace = whiteSpace + " ";
                    fittenDigitSpace =fittenDigitSpace - 1;
                }
                // add new subtracted lenght whitespace 
                // then 
                    // check if number is 3 digits 
                    // add if not 
                    
                if(x > 99) {
                    System.out.println(s1 + whiteSpace + x);
                } else if(x > 9) {
                    System.out.println(s1 + whiteSpace + "0" + x);
                } else {
                    System.out.println(s1 + whiteSpace + "00" + x);
                }
                whiteSpace = "";
                fittenDigitSpace = 0;
            }
            System.out.println("================================");

    }
}
