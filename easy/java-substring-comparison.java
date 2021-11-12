import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        int lenghtOfStringSearch = s.length() - 2;
        String[] threeCharacterArray = new String[lenghtOfStringSearch];
        int counter = 0;
        while(counter < lenghtOfStringSearch) {
            threeCharacterArray[counter] = s.substring(counter, counter+3);
            
            counter = counter + 1;
        }
        // this many index's = lenghtOfStringSearch - 1
        // System.out.println(threeCharacterArray[lenghtOfStringSearch - 1]);
        boolean FoundSmallestCombination = false;
        boolean FoundLargestCombination = false;
        boolean NotSmallest = false; 
        boolean notLargest = false; 
        String currentArrayIndex = "";
        counter = 0;
        while (FoundSmallestCombination = false && counter <= lenghtOfStringSearch - 1) {
            currentArrayIndex = threeCharacterArray[counter];
            for(int i = 0; i <= lenghtOfStringSearch - 1; i++) {
                if(currentArrayIndex.charAt(0) > threeCharacterArray[i].charAt(0) ){
                    NotSmallest = true;
                }
            }
            if(NotSmallest = false) {
                FoundSmallestCombination = true;
                smallest = currentArrayIndex;
            }
            counter = counter + 1;
        }
        // System.out.println(smallest);
        counter = 0;
        while(FoundLargestCombination = false && counter <= lenghtOfStringSearch - 1) {
            currentArrayIndex = threeCharacterArray[counter];
            for(int i = 0; i <= lenghtOfStringSearch - 1; i++) {
                if(currentArrayIndex.charAt(0) < threeCharacterArray[i].charAt(0) ){
                    notLargest = true;
                }
            }
            if(notLargest = false) {
                FoundLargestCombination = true;
                largest = currentArrayIndex;
            }
        }
        return smallest + "\n" + largest;
        // psudocode
        // first find lenght of string (lenght of string) - 2 (include the last 3 strings)
        // place into array based on all combination fiting in the lenght - 2
        // now order each 
            // binary search?
                // take firsy combination is it greate than all? 
                    // no go onto next one
                    // yeat then store in HighestCombination 
                // loop again to find lowest one. is there any higher then this?
                    // no for all? => sotre
                    // else contineu
                    
        
    }

}