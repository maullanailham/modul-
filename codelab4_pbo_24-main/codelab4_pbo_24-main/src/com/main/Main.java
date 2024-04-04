package com.main;

import kendaraan.Kendaraan;
import kendaraan.khusus.Pesawat;
import kendaraan.khusus.Tank;
import kendaraan.pribadi.Mobil;
import kendaraan.pribadi.Motor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Kendaraan kendaraan[] = new Kendaraan[4];
        kendaraan[0] = new Motor();
        kendaraan[1] = new Mobil();
        kendaraan[2] = new Tank();
        kendaraan[3] = new Pesawat();


        for (int i = 0; i < kendaraan.length; i++) {
            System.out.printf("Masukkan nama kendaraan ke-%d ", (i + 1));
            kendaraan[i].setName(input.next());
            System.out.printf("Masukkan model kendaraan ke-%d ", (i + 1));
            kendaraan[i].setModel(input.next());
            System.out.printf("Masukkan warna kendaraan ke-%d ", (i + 1));
            kendaraan[i].setWarna(input.next());
            System.out.printf("Masukkan tahun kendaraan ke-%d ", (i + 1));
            kendaraan[i].setTahun(input.nextInt());
            System.out.println();
        }


        for (Kendaraan objectKendaraan : kendaraan) {
            if (objectKendaraan instanceof Tank){
                Tank tank = (Tank)objectKendaraan;
                tank.Start();
                tank.Brake();
                tank.Stop();
                tank.Shoot("Truk");

            } else if(objectKendaraan instanceof Pesawat){
                Pesawat pesawat = (Pesawat)objectKendaraan;
                pesawat.Start();
                pesawat.fly();
                pesawat.Brake();
                pesawat.Stop();

            } else {
                objectKendaraan.Start();
                objectKendaraan.Brake();
                objectKendaraan.Stop();
            }

            objectKendaraan.getInfo();
            System.out.println();
        }
    }
}
