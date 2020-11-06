/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan37.programrataratanilai;

/**
 *
 * @author User
 */
public class Nilai {
    double rataRata = 0;

    private double hitungRataRata(int[] nilai){
        for(int x : nilai){
            rataRata += x;
        }
        return rataRata = rataRata / nilai.length;
    }

    public void tampilRataRata(int[] nilai){
        hitungRataRata(nilai);
        System.out.println("Rata-rata Nilainya adalah "+rataRata);
    }
}
