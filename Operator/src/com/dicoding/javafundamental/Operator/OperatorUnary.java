/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.Operator;

/**
 *
 * @author Sindy
 */
public class OperatorUnary {
    public static void main(String[] args) {
        System.out.println("operator unary plus");
        int nilaiAwal1 = 5;
        int hasil = +nilaiAwal1;
        System.out.println("hasil +5 = " + hasil);
        System.out.println();

        System.out.println("operator unary minus");
        int nilaiAwal2 = 5;
        nilaiAwal2 = -nilaiAwal2;
        System.out.println("hasil -5 = " + nilaiAwal2);
        System.out.println();

        System.out.println("operator peningkatan nilai sebesar 1 point");
        int nilaiAwal3 = 5;
        nilaiAwal3++;
        System.out.println("hasil 5++ = " + nilaiAwal3);
        System.out.println();

        System.out.println("operator pengurangan nilai sebesar 1 point");
        int nilaiAwal4 = 5;
        nilaiAwal4--;
        System.out.println("hasil 5-- = " + nilaiAwal4);
        System.out.println();

        System.out.println("operator komplemen logika");
        boolean sukses = false; //nilai sukses adalah false
        System.out.println("hasil !false = " + !sukses);
        System.out.println();

    }
    
}
