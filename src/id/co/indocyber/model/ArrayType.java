/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.model;

/**
 *
 * @author user
 */
public class ArrayType {

    public static void main(String[] args) {

        KelasA[] aa = {new KelasA(), new KelasB(), new KelasC()};

        for (KelasA o : aa) {
            o.printA();
            if (o instanceof KelasC) {//Parsing Untuk Mengambil Method Ynag ada di kelas C
                KelasC c = (KelasC) o;
                c.printC();
            }

        }
    }
}
