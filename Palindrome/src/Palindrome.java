import java.util.Scanner;

public class Palindrome {

    static void checkPalindrome(String input) {
        //Assuming result to be true
        boolean res = true;
        //the number of characters in the user entry
        int length = input.length();
        //starting from the first letter, divide the word into two halves
        for(int i=0; i<= length/2; i++) {
            //compare both halves, by comparing the letters at both ends of the halves, to see if they don't (!=) match
            if(input.charAt(i) != input.charAt(length-i-1)) {
                //if they don't, the result is false
                res = false;
                break;
            }
        }
        //print the user-input, together with the result of the check
        System.out.println(input + " is palindrome = "+res);
    }
    public static void main(String[] args) {
        //variable container for user input
        Scanner ui = new Scanner(System.in);
        //print "Enter your Statement: "
        System.out.print("Enter a word or number: ");
        //the actual user input
        String strNo = ui.nextLine();
        //calling the function
        checkPalindrome(strNo);
    }
}