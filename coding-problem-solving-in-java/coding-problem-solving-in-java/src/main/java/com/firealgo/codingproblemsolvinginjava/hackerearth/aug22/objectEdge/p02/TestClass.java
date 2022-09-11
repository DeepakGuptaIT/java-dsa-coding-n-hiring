package com.firealgo.codingproblemsolvinginjava.hackerearth.aug22.objectEdge.p02;
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

            int out_ = solve(N);
            System.out.println(out_);
            
         }

         wr.close();
         br.close();
    }
    static int solve(int N){
       // Write your code here
        int result = 0;

        return result;
    
    }
}