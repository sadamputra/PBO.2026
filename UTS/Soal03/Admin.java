package UTS.Soal03;

public class Admin extends User {
    public void update_vehicle_details(int vehicle_id) {
        System.out.println("Data kendaraan diperbarui");
    }

    public void add_vehicle(String vehicle) {
        System.out.println("Kendaraan berhasil ditambahkan");
    }

    public void retrieve_complaint() {
        System.out.println("Mengambil data keluhan");
    }

    public void verify_user() {
        System.out.println("Memverifikasi pengguna");
    }
}