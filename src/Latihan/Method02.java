/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author Aby
 */
public class Method02 {
    public static int kecepatan(int j, int w)    
    {
        int k = j/w;
        return k;
    }
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int j;
        System.out.print("Jarak : ");
        j = input.nextInt();
        int w;
        System.out.print("Waktu tempuh : ");
        w = input.nextInt();
        double k;
        k = kecepatan(j,w);
        System.out.println("Kecepatan : " + k + " km/jam");
    }
}
