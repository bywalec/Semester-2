/*
Wykorzystując pętle for napisz program sumujący liczy od 0 do 10.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        int sum = 0;

        for(int i = 1 ; i <= 10 ; i++)
        {
            sum += i;
        }
        System.out.println("suma liczb od 1 do 10 to: " + sum);

    }
}
