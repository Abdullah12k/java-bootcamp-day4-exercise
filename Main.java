import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Q1
        int count = 100;
        for (int i = 1; i <= count; i++){
            if (i % 5 == 0 && i % 3 == 0){ // to check if the number is multiple of 3 and 5 or not
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else if(i % 3 == 0){
                System.out.println("FizzBuzz");
            }else {
                System.out.println(i);
            }
        }

        //Q2
        System.out.println("please enter a word: ");
        String name = input.nextLine();
        for (int i = name.length() - 1; i >= 0; i--) {
            char a = name.charAt(i);
            System.out.print(a + ",");
        }

        //Q3
        System.out.println(); // to create a new line after the previous question
        System.out.println("please enter a number: ");
        int factorialNumber = input.nextInt();
        int total = 0;
        for (int i = 1; i <= factorialNumber; i++){
            total +=i;
        }
        System.out.println("the factorial is: " + total);

        //Q4
        System.out.println("enter a number to power: ");
        long numToPower = input.nextLong();
        System.out.println("enter the power number: ");
        long powerNumber = input.nextLong();
        long numAfter = 1;
        for (int i = 1; i <= powerNumber ;i++){
            numAfter  *= numToPower;
        }
        System.out.println("the number after it powered = " + numAfter);

        //Q5
        int counter = 0,number, totalEven = 0, totalOdd =0;

        while (counter >= 0) {
            System.out.println("enter a Numbers: (write -1 to leave the program)");
            number = input.nextInt();
            if (number == -1) {
                System.out.println("good bye");
                break;
            } else if (number % 2 == 0) {
                totalEven += number;
            } else {
                totalOdd += number;
            }
            counter++;
        }
        System.out.println("total even number is: " + totalEven);
        System.out.println("total odd number is: " + totalOdd);

        //Q6
        System.out.println("please enter a positive number: ");
        int num2 = input.nextInt();
        boolean isPrime = true; // to avoid repeating print

        for (int i = 2; i <num2 ; i++) { // we started from 2 because every number is dividable on 1
            if (num2 % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime && num2 > 1){
            System.out.println("the " + num2 + " is a Prime number");
        } else {
            System.out.println("the " + num2 + " is not a Prime number");
        }

        //Q7
        for (int i = 1; i <= 4; i++){
            System.out.println("week " + i);
            for (int j=1; j <=7; j++){
                System.out.println("day " + j);
            }
        }

        //Q8

        input.nextLine(); // so the compiler doesnt skip the next input
        System.out.println("Enter a word to check if it palindrome or not: ");
        String word = input.nextLine();
        String reverse = "";
        for (int i =word.length() -1; i >= 0;i--){ // the loop is for reversing the word
            // I can use string builder but I prefer practicing on the loop
            reverse += word.charAt(i);
        }
        if (word.equalsIgnoreCase(reverse)){ // check if they equal each other after the reverse
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }


    }
}
