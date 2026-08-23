package com.firealgo.problemsolving.stack;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision_735 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(asteroidCollision(new int[]{5, 10, -5})));
//        System.out.println(Arrays.toString(asteroidCollision(new int[]{5, -5})));
//        System.out.println(Arrays.toString(asteroidCollision(new int[]{-5, -5})));
//        System.out.println(Arrays.toString(asteroidCollision(new int[]{-2, -1, 1, 2})));
//        System.out.println(Arrays.toString(asteroidCollision(new int[]{-2, -2, 1, -2})));
        System.out.println(Arrays.toString(asteroidCollision(new int[]{10, 2, -5})));
    }
    private static int[] asteroidCollision(int[] asteroids) {
        // 5, 10, -5
        Stack<Integer> stack = new Stack<>();
        for (int e : asteroids) {
            boolean isAlive = true;
            while (!stack.isEmpty() &&  e < 0 && stack.peek() > 0) {
                if(stack.peek() > -e) {
                    isAlive = false;
                    break;
                } else if(stack.peek() == -e) {
                    stack.pop();
                    isAlive = false;
                    break;
                } else  {
                    //(stack.peek() < -e)
                    stack.pop();
                }

            }
            if(isAlive) {
                stack.push(e);
            }

        }
        return stack.stream().mapToInt(i -> i).toArray();
//        int[] out = new int[stack.size()];
//        for (int i = 0; i < stack.size(); i++) {
//            out[i] = stack.get(i);
//        }
//        return out;
    }

    private static int[] asteroidCollision1(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i : asteroids) {
            if (i > 0 || stack.isEmpty()) stack.push(i);
            else if (stack.peek() < 0) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && stack.peek() <= Math.abs(i)) {
                    int peek = stack.peek();
                    if (stack.peek() < 0) {
                        stack.push(i);
                        break;
                    }
                    if (peek == Math.abs(i)) {
                        stack.pop();
                        break;
                    } else if (peek > Math.abs(i)) {
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
        }
//        int[] out = new int[stack.size()];
//        for (int i = 0; i < stack.size(); i++) {
//            out[i] = stack.get(i);
//        }
        return stack.stream().mapToInt(i -> i).toArray();
    }


}
