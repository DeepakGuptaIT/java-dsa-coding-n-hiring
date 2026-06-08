package com.firealgo.problemsolving.leetcode.randomQ.stack;

import java.util.ArrayDeque;
import java.util.Arrays;

public class AsteroidCollision735 {
    public static void main(String[] args) {
        int[] inputArray = {1,-2,-2,-2}; // [5,10]
//        int[] inputArray = {8, -8}; // []

        // Call the function and get the output array
        int[] outputArray = asteroidCollision(inputArray);

        // Print input and output arrays
        System.out.println("Input Array: " + Arrays.toString(inputArray));
        System.out.println("Output Array: " + Arrays.toString(outputArray));

    }

    public static int[] asteroidCollision(int[] asteroids) {
//        Stack<Integer> stack = new Stack<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int num : asteroids) {
            if (num >= 0) {
                stack.push(num);
            } else if (stack.isEmpty() || stack.peek() < 0) {
                stack.push(num);
            } else {
                boolean isAlive = true;
                while (!stack.isEmpty() && stack.peek() > 0) {
                    int abs = Math.abs(num);
                    if(stack.peek() > abs) {
                        isAlive = false;
                        break;
                    }
                    if(stack.peek() == abs) {
                        stack.pop();
                        isAlive = false;
                        break;
                    }
                    if(stack.peek() < abs) {
                        stack.pop();
                    }


                }
                if(isAlive) stack.push(num);
            }

        }
        return stack.stream().mapToInt(i -> i).toArray();

    }
}
