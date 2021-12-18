package org.example.algo.sorting.bruteforce;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {8, 5, 9, 6};

        for (int outerLoopCounter = 0; outerLoopCounter < numbers.length; outerLoopCounter++) {
            for (int innerLoopCounter = outerLoopCounter; innerLoopCounter < numbers.length-1; innerLoopCounter++) {
                if(numbers[innerLoopCounter] > numbers[innerLoopCounter+1]) {
                    int tmp = numbers[innerLoopCounter];

                    numbers[innerLoopCounter] = numbers[innerLoopCounter+1];
                    numbers[innerLoopCounter+1] = tmp;
                }
            }
        }

        for (int number : numbers) {
            System.out.print(number + ", ");
        }
    }
}
