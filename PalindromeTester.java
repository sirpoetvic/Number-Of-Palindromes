import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class PalindromeTester {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("This program depicts the number of 3+ digit palindromes there are from 101 to a number.");
        System.out.print("Enter a number: ");
        int x = input.nextInt();
        System.out.println(Arrays.toString(numToArray(x)));
        System.out.println(numPalindrome(x) + " palindromes detected.");
        input.close();
    }

    public static boolean isPalindrome(int num) {
        char[] arr = numToArray(num);
        char left;
        char right;

        //if the number has an even amount of digits
        int i = 0;
        while(i <= arr.length - 1) {
            left = arr[i];
            right = arr[arr.length - 1 - i];
            if(left != right)
                return false;
            i++;
        }
        return true;
    }

    public static int numPalindrome(int num) {
        int counter = 0;
        for(int i = 101; i <= num; i++) {
            if(isPalindrome(i))
                counter++;
        }
        return counter;
    }

    public static char[] numToArray(int x) {
        String num = String.valueOf(x);
        char[] arr = num.toCharArray();

        return arr;
    }
}
