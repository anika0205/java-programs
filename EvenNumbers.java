/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

//to print even numbers from 1-50//
public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 50:");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}