/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxminsum;

import java.util.Scanner;

/**
 *
 * @author chatz
 */
public class MaxMinSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String question = "give me four number ";
        System.out.println(question);
        int a, b, c, d;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        double sum = a + b + c + d;
        if (sum % 2 == 0) {
            question = "the sum is " + sum + " and it's even";
            System.out.println();
        } else {
            question = "the sum is " + sum + " and it's odd";
        }
        System.out.println(question);
        int max1 = Math.max(a, b);
        int max2 = Math.max(c, d);
        int max = Math.max(max1, max2);

        int min1 = Math.min(a, b);
        int min2 = Math.min(c, d);
        int min = Math.min(min1, min2);
        double average = sum / 4;

        System.out.println(" the max: " + max + " the min: " + min + " the average is: " + average);
    }

}
