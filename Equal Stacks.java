import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the equalStacks function below.
     */
    static int equalStacks(int[] ha1, int[] ha2, int[] ha3) {
    
    // initialising stack of cylinders
         Stack<Integer> sta1 = new Stack<Integer>(); 
        Stack<Integer> sta2 = new Stack<Integer>(); 
        Stack<Integer> sta3 = new Stack<Integer>(); 
 
        int h1 = 0;   //Height of the first stack
        int h2 = 0;     //Height of the second stack
        int h3 =0; // height of the third stack
 
        int minStack;       //The stack with the minimal weight
 
        //Initialize the stacks and their heights
        for(int i = ha1.length-1; i >= 0 ; i--){
            sta1.push(ha1[i]);
            h1 += ha1[i];
        }
 
        for(int i = ha2.length-1; i >= 0 ; i--){
            sta2.push(ha2[i]);
            h2 += ha2[i];
        }
 
        for(int i = ha3.length-1; i >= 0 ; i--){
            sta3.push(ha3[i]);
            h3 += ha3[i];
        }
 
        minStack = Math.min(h1,Math.min(h2,h3)); //Initialize minStack with the minimum height
 
        //Heights are not all equal enter the while loop
        while(h1 != h2 || h1 != h3) {
            //Remove cylinders from stack 1 until your height is <= the smallest
            while(h1 > minStack){
                h1 -= sta1.pop();
            }
            minStack = Math.min(h1,Math.min(h2,h3)); //Recalculate min
 
            //Remove cylinders from stack 2 until your height is <= the smallest
            while(h2 > minStack){
                h2 -= sta2.pop();
            }
            minStack = Math.min(h1,Math.min(h2,h3)); //Calculate min
 
            //Remove cylinders from stack 3 until your height is <= the smallest
            while(h3 > minStack){
                h3 -= sta3.pop();
            }
            minStack = Math.min(h1,Math.min(h2,h3));     //calculate min
 
        }
 
        return minStack;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
        }

        int[] h2 = new int[n2];

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
        }

        int[] h3 = new int[n3];

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
        }

        int result = equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
