package kendaraan.pribadi;

import kendaraan.Kendaraan;

public class Motor extends Kendaraan {

    //penambahan method Start
    @Override
    public void Start() {
        // penambahan getter getModel, getTahun
        //Penambahan string kosong " " untuk memberikan spasi pada method
        System.out.println("Motor " + this.getName() + " " + this.getModel() + " " + this.getTahun() + " dinyalakan");
    }


    @Override
    public void Stop() {
        // penambahan getter getModel, getTahun
        //penambahan string kosong " "  yang berfungsi untuk spasi
        System.out.println("Motor " + this.getName() + " " + this.getModel() + " " + this.getTahun() + " dimatikan");
    }

    @Override
    public void Brake() {
        System.out.println("Motor berhenti");
    }
}
