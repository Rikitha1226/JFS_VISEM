package com.su2;

import java.util.Scanner;
import java.util.Arrays;

public class App 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting number:");
        int s = sc.nextInt();

        System.out.println("Enter the ending number:");
        int e = sc.nextInt();

        System.out.println("Prime numbers in the range " + s + " to " + e + " are:");
        SE_Prime(s, e);

        sc.close();
    }

    public static void SE_Prime(int s, int e)
    {
        boolean arr[] = new boolean[e + 1];
        Arrays.fill(arr, true);

        arr[0] = false;
        arr[1] = false;

        for (int i = 2; i <= Math.sqrt(e); i++)
        {
            if (arr[i])
            {
                for (int j = i * i; j <= e; j += i)
                {
                    arr[j] = false;
                }
            }
        }

        for (int i = s; i <= e; i++)
        {
            if (arr[i])
            {
                System.out.print(i + " ");
            }
        }
    }
}
