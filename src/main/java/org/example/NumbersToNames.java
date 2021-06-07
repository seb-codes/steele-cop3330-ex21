/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sebastian Steele
 */
package org.example;

import java.util.Scanner;

public class NumbersToNames {
    public static void main(String[] args) {
        String month_str;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of the month: ");
        int month_no = scan.nextInt();

        switch (month_no) {
            case 1:  month_str = "January";
                break;
            case 2:  month_str = "February";
                break;
            case 3:  month_str = "March";
                break;
            case 4:  month_str = "April";
                break;
            case 5:  month_str = "May";
                break;
            case 6:  month_str = "June";
                break;
            case 7:  month_str = "July";
                break;
            case 8:  month_str = "August";
                break;
            case 9:  month_str = "September";
                break;
            case 10: month_str = "October";
                break;
            case 11: month_str = "November";
                break;
            case 12: month_str = "December";
                break;
            default: month_str = "DONT WORK TRY AGAIN PLS";
                break;
        }
        System.out.println("The name of the month is "+month_str+".");
    }
}
