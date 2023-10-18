package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        if (N == 1) {
            // Є дві можливі послідовності: "0" та "1"
            System.out.println(2);
        } else if (N == 2) {
            // Є чотири можливі послідовності: "00", "01", "10", "11"
            System.out.println(4);
        } else {
            long[] dp = new long[N + 1];
            dp[0] = 1;
            dp[1] = 2;
            dp[2] = 4;

            for (int i = 3; i <= N; i++) {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }

            System.out.println(dp[N]);
        }
    }
}
