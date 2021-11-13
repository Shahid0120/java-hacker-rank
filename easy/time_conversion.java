import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String time) {
    // Write your code here
        // first check for am or Pm
        // am => dont chnages array just input string
        // pm +12 hours then return 
        // boolean stringIsAm = false;
        // String[] arrayString = s.split("");
        // for(int i = 0; i < arrayString.length; i++) {
        //     if(arrayString[i] == "A") {
        //         stringIsAm = true;
        //     }
        // }
        // int newHour = 0;
        // List<int> newArray = new ArrayList<int>();
        // if(stringIsAm == false) {
        //     // pm 
        //     newHour = String.ToInt(arrayString[0]) + String.toInt(arrayString[1]) + 12;
        //     newArray.add(newHour.split(0));
        //     newArray.add(newHour.split(1));
        //     newArray.add(Array.copyOfRange(arrayString, 2, 8));
        // }
        // // return Arrays.toString(arrayString);
        // return Array.toString(newArray);
        int hour = Integer.parseInt(time.substring(0,2));
        int minute = Integer.parseInt(time.substring(3,5));
        int second = Integer.parseInt(time.substring(6,8));
        String meridiem = time.substring(8,10);
        hour += ((meridiem.equals("PM") && hour != 12)?12:0);//Performs conversion based on current meridiem
        hour -= ((meridiem.equals("AM") && hour == 12)?12:0);
        return String.format("%02d",hour) + ":" + String.format("%02d",minute) + ":" + String.format("%02d",second);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}