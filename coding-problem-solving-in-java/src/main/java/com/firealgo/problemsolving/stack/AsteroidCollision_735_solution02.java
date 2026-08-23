package com.firealgo.problemsolving.stack;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision_735_solution02 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(asteroidCollision(new int[]{5, 10, -5})));
//        System.out.println(Arrays.toString(asteroidCollision(new int[]{5, -5})));
//        System.out.println(Arrays.toString(asteroidCollision(new int[]{-5, -5})));
//        System.out.println(Arrays.toString(asteroidCollision(new int[]{-2, -1, 1, 2})));
//        System.out.println(Arrays.toString(asteroidCollision(new int[]{-2, -2, 1, -2})));
        System.out.println(Arrays.toString(asteroidCollision(new int[]{10, 2, -5})));
    }

    private static int[] asteroidCollision(int[] asteroids) {
        var stack = new Stack<Integer>();
        for (int e : asteroids) {
            if (e > 0) stack.push(e);
            else {
                boolean flag = true;
                while (true) {
                    if(stack.isEmpty()) {
                        stack.push(e);
                        break;
                    };
                    int top = stack.peek();
                    if(top < 0) {
                        stack.push(e);
                        break;
                    }
                    if (top > -e) break;
                    else if (top == -e) {
                        stack.pop();
                        break;
                    } else {
                        stack.pop();
                    }
                }


            }
        }
        return stack.stream().mapToInt(e -> e).toArray();
    }


}
