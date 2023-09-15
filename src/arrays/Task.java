package arrays;

import java.util.Arrays;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        int[][] nums = new int[][]{
                {22, 45, 48, 1, 5},
                {8, 10, 85, 6},
                {66, 11, 3, 7},
                {1, 15, 42, 31}
        };

        int winNumber = 11;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int enterNum = sc.nextInt();

        int idx = -1;

        for (int[] num1 : nums) {
            for (int num2 : num1) {
                if (enterNum == winNumber & enterNum == num2) {
                    idx = 1;
                    break;
                }
            }
        }
        if (idx == 1) System.out.println("You are winner!!!");
        else System.out.println("You lose");
        sc.close();
    }
}
