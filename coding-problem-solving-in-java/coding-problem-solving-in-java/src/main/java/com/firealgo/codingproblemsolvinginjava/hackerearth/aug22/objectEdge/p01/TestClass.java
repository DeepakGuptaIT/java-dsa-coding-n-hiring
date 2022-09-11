package com.firealgo.codingproblemsolvinginjava.hackerearth.aug22.objectEdge.p01;
import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String A = br.readLine();
            String B = br.readLine();
            String C = br.readLine();

            String out_ = solve(N, A, B, C);
            System.out.println(out_);
            
         }

         wr.close();
         br.close();
    }
    static String solve(int N, String A, String B, String C){
       /*
       N: Length of the strings A, B, and C
       A: String A
       B: String B
       C: String
       C
       */
    	System.out.println(A);
    	System.out.println(B);
    	System.out.println(C);
       
        String result = "solved";

        return result;
    
    }
}