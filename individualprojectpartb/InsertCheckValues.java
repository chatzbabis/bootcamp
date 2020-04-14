/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.Scanner;

/**
 *
 * @author chatz
 */
public class InsertCheckValues {
    public static int rightChoice() {
        Scanner sc = new Scanner(System.in);
        int x;
        boolean flag = true;
        do {
            PrintMenus.menu();
            x = correctInt();
            if (x == 1 || x == 2 || x == 3 || x == 4 || x == 5 || x == 6) {
                flag = true;
            } else {
                flag = false;
                System.out.println("you entered wrong");
            }
        } while (flag == false);
        return x;
    }

    public static int rightChoiceForInserts() {
        Scanner sc = new Scanner(System.in);
        int x;
        boolean flag = true;
        do {
            PrintMenus.menuForInsterts();
            x = correctInt();
            if (x == 1 || x == 2 || x == 3 || x == 4) {
                flag = true;
            } else {
                flag = false;
                System.out.println("you entered wrong");
            }
        } while (flag == false);
        return x;
    }

    public static int rightChoiceForPrintings() {
        Scanner sc = new Scanner(System.in);
        int x;
        boolean flag = true;
        do {
            PrintMenus.menuForPrintings();
            x = correctInt();
            if (x == 1 || x == 2 || x == 3 || x == 4 || x == 5 || x == 6 || x == 7 || x == 8 || x == 9 || x == 10 || x==11) {
                flag = true;
            } else {
                flag = false;
                System.out.println("you entered wrong");
            }
        } while (flag == false);
        return x;
    }

    public static String typeDataOrNot() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String valuesOrNo;
        do {
            System.out.print("Please type y/n: ");
            while (!sc.hasNext()) {

                sc.next();
            }
            valuesOrNo = sc.next();

            if (valuesOrNo.equals("y") || valuesOrNo.equals("n")) {
                flag = false;
            } else {
                System.out.println("you entered wrong");
                flag = true;
            }
        } while (flag == true);
        return valuesOrNo;
    }

    public static int correctInt() {
        Scanner sc = new Scanner(System.in);
        int x;
        do {

            while (!sc.hasNextInt()) {
                System.out.println("wrong enterd please enter only Integer");
                sc.next();
            }
            x = sc.nextInt();
            if (x < 0) {
                System.out.println("Please enter an integer>=0");
            }

        } while (x < 0);
        return x;
    }

    public static double correctDouble() {
        Scanner sc = new Scanner(System.in);
        double x;
        do {

            while (!sc.hasNextInt()) {
                System.out.println("wrong enterd please enter only Double: ");;
                sc.next();
            }
            x = sc.nextDouble();
            if (x < 0 || x > 100) {
                System.out.println("Please enter an between [0,100]: ");
            }

        } while (x < 0 || x > 100);
        return x;
    }
    
}
