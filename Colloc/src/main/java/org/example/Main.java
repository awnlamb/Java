package org.example;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Fibonacci f=new Fibonacci();
        int n=sc.nextInt();
        List<Integer> l=f.generateFibonacci(n);
        System.out.println(l);
    }
}