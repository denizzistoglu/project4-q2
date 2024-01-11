/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4.pkg2;

import java.util.Scanner;

/**
 *
 * @author deniz
 */
public class Hw42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first int");
        int first = input.nextInt();
        System.out.println("Enter the second int");
        int second = input.nextInt();
        for(int i=first+1; i<second; i++){
            if(i%2=1){    
               System.out.println(i);
            }
        }
    }
    
}
