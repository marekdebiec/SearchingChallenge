/*SearchingChallenge(str) take the str parameter being passed and return the first word with the greatest number of repeated letters. For example: "Today, is the greatest day ever!" should return greatest because it has 2 e's (and 2 t's) and it comes before ever which also has 2 e's. If there are no words with repeating letters return -1. Words will be separated by spaces.
        Once your function is working, take the final output string and concatenate it with your ChallengeToken, and then replace every fourth character with an underscore.

        Your ChallengeToken: fqpxz8d91
        Examples
        Input: "Hello apple pie"
        Output: Hello
        Final Output: Hel_ofq_xz8_91
        Input: "No words"
        Output: -1
        Final Output: -1f_pxz_d91*/
import java.util.*;
import java.io.*;

public class Main {

    public static String StringChallenge( String str) {

        String YourChallengeToken = "fqpxz8d91";
        String[] arr = str.split(" ");
        int count = 0; String res = "-1";

        for (int i = 0; i < arr.length; i++ ) {
            for (int j = 0; j < arr[i].length() ; j++) {
                int counter = 0;
                for (int k = j + 1; k < arr[i].length() ; k++) {
                    if(arr[i].charAt(j) == arr[i].charAt(k) )
                        counter ++;
                }
                if (counter > count) {
                    count = counter;   res = arr[i];
                }
            }
        }
        str = res + YourChallengeToken;
        return str;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String zero = StringChallenge(s.nextLine());
        char[] myNameChars = zero.toCharArray();
        for (int i = 3; i < zero.length(); i=i+4) {
            myNameChars[i] = '_';
        }
        zero = String.valueOf(myNameChars);
        System.out.println("final output:" + zero);
        /*// Declaring ANSI_RESET so that we can reset the color
         final String ANSI_RESET = "\u001B[0m";

        // Declaring the color
        // Custom declaration
         final String ANSI_YELLOW = "\u001B[31m";
        System.out.println(ANSI_YELLOW +  zero.length() + ANSI_RESET);*/
    }
}