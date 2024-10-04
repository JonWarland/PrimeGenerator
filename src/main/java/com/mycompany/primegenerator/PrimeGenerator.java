/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primegenerator;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jon
 */
public class PrimeGenerator {

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        int max;
        System.out.print("Define a maximum value to find primes up to >> ");
        max = userIn.nextInt();
        PrimeTest test1 = new PrimeTest();
        test1.upTo(max);
    }
}
