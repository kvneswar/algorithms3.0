package org.example.algo.sorting.bruteforce;

public class SelectionSort {
    public static void main(String[] args) {
        //approach 1
        int[] numbers = {8, 5, 9, 6};

        for (int outerLoopCounter = 0; outerLoopCounter < numbers.length; outerLoopCounter++) {
            for (int innerLoopCounter = outerLoopCounter+1; innerLoopCounter < numbers.length; innerLoopCounter++) {
                if(numbers[outerLoopCounter] > numbers[innerLoopCounter]){
                    int tmp = numbers[outerLoopCounter];

                    numbers[outerLoopCounter] = numbers[innerLoopCounter];
                    numbers[innerLoopCounter] = tmp;
                }
            }
        }

        for (int number : numbers) {
            System.out.print(number + ", ");
        }

        System.out.println();

        //approach 2
        numbers = new int[]{8, 5, 9, 6};

        for (int outerLoopCounter = 0; outerLoopCounter < numbers.length; outerLoopCounter++) {
            int position = outerLoopCounter;

            for (int innerLoopCounter = outerLoopCounter+1; innerLoopCounter < numbers.length; innerLoopCounter++) {
                if(numbers[position] > numbers[innerLoopCounter]){
                    position = innerLoopCounter;
                }
            }

            if(position != outerLoopCounter){
                int tmp = numbers[position];

                numbers[position] = numbers[outerLoopCounter];
                numbers[outerLoopCounter] = tmp;
            }
        }

        for (int number : numbers) {
            System.out.print(number + ", ");
        }
    }
}
