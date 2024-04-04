package kendaraan.khusus;

import kendaraan.Kendaraan;
import kendaraan.util.ShootAble;

//ShootAb -> ShootAble
public class Tank extends Kendaraan implements ShootAble{
    @Override
    public void Start() {
        //penambahan string kosong " " untuk spasia
        System.out.println("Menyalakan tank " + this.getName() + " " + this.getModel());
    }

    @Override
    public void Stop() {
        //penambahan ; pada akhir baris dan menambahkan getter getModel.
        //penambahan string kosong " " yang berfungsi untuk memberikan spasi
        System.out.println("Mematikan tank " + this.getName() + " " + this.getModel());
    }

    @Override
    public void Brake() {
        //penambahan ; pada akhir baris
        System.out.println("Tank berhenti");
    }

    @Override
    public void Shoot(String vehicle) {
        //vehi -> vehicle dan penambahan ; pada akhir baris kode.
        System.out.println("Tank menembak " + vehicle);
    }
}
