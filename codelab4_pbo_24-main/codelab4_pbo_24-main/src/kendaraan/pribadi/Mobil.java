package kendaraan.pribadi;

import kendaraan.Kendaraan;

public class Mobil extends Kendaraan {

    @Override
    public void Start() {
        //penambahan getter getModel, getWarna.
        //penambahan string kosong " "yang berfungsi utuk spasi.
        System.out.println("Mobil " + this.getName() + " " + this.getModel() + " " + "warna " + this.getWarna() + " dinyalakan");
    }

    @Override
    public void Stop() {
        //penambahan getter getModel, getWarna.
        //penambahan string kosong " "yang berfungsi utuk spasi.
        System.out.println("Mobil " + this.getName() + " " + this.getModel() + " " + "warna " + this.getWarna() + " dimatikan");
    }

    @Override
    public void Brake() {
        System.out.println("Mobil berhenti");
    }
}