package com.dz;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        input(n, a);
        System.out.println(sumwithfor(n, a));
        System.out.println(sumwithwhile(n, a));
        System.out.println(sumwithdowhile(n, a));

    }
    public static int sumwithfor(int n, int [] a) {
        int S = 0;
        for (int i = 0; i < n; i++)
            S = S + a[i];
        return S;
    }

    public static int sumwithwhile(int n, int [] a) {
        int S = 0, i = 0;
        while (i < n) {
            S = S + a[i];
            i++;
        }
        return S;
    }

    public static int sumwithdowhile(int n, int [] a) {
        int S = 0, i = 0;
        do { 
            S = S + a[i];
            i++;
        }
        while(i < n);
        return S;
    }
    public static void input(int n, int [] a) { // ввод значений элементов массива
        System.out.print("Input element of the array: ");
        for (int i = 0; i < n; i++) {
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();
        }
        System.out.println();
    }
}
