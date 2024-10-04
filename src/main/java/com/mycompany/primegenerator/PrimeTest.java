/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primegenerator;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jon
 */
public class PrimeTest {
        private ArrayList<Integer> primeList = new ArrayList<>();
        private boolean notPrime;        
        
        public void upTo(int max)
        {
        this.primeList.add(2);                                                  //manually adding 2 as it is the only even prime.
        for(int i=3;i<max;i=i+2)                                                //looping for every odd number between 3 and the defined maximum.
        {
            this.notPrime = false;
            for(int j = 0;j<this.primeList.size();j++)                          //looping through the list of primes we have already found
            {
                //System.out.println("Testing i="+i+", j= "+j+", against: "+this.primeList.get(j)+", list size: "+this.primeList.size());
                //System.out.println("The remainder is: "+i%primeList.get(j));
                if(i%primeList.get(j) == 0)
                {
                    this.notPrime = true;
                }
            }
            if (this.notPrime == false)                                         //if we reach
                {
                    this.primeList.add(i);
                }
        }
        //System.out.println(primeList);
        gridOut(primeList,20);
        }
        public void gridOut(ArrayList<Integer> listIn,int rowSize)
        {
            for(int i=0;i<listIn.size();i++)
            {
                System.out.print(listIn.get(i)+", ");
                if((i+1)%rowSize==0)
                {
                    System.out.println("");
                }
            }
        }
}
