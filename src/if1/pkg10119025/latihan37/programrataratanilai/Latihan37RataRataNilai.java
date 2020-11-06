/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Latihan37RataRataNilai {
    static Scanner scan = new Scanner(System.in);
    private static int nilaiMhs[];

    private static int masukkanJumlah(){
        System.out.print("Masukkan banyaknya Mahasiswa : ");
        return scan.nextInt();
    }

    private static void masukkanNilai(){
        int jumlah = masukkanJumlah();
        nilaiMhs = new int[jumlah];
        for(int i = 0; i < jumlah; i++){
            System.out.print("Nilai Mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = scan.nextInt();
        }
    }

    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        masukkanNilai();
        nilai.tampilRataRata(nilaiMhs);
        System.out.println("Developed by : Adhira Fahri Gathan");
    }
}

