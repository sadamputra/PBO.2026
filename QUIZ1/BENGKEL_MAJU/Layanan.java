package QUIZ1.BENGKEL_MAJU;

public class Layanan {
    private String serviceName;
    private double servicePrice;
    private Kendaraan kendaraan; // Kendaraan yang diservis
    private Karyawan mekanik;    // Siapa yang nyervis

    public Layanan(String serviceName, double servicePrice, Kendaraan kendaraan, Karyawan mekanik) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
        this.kendaraan = kendaraan;
        this.mekanik = mekanik;
    }

    public String getServiceName() { return serviceName; }
    public void setServiceName(String serviceName) { this.serviceName = serviceName; }

    public double getServicePrice() { return servicePrice; }
    public void setServicePrice(double servicePrice) { this.servicePrice = servicePrice; }

    public Kendaraan getKendaraan() { return kendaraan; }
    public void setKendaraan(Kendaraan kendaraan) { this.kendaraan = kendaraan; }

    public Karyawan getMekanik() { return mekanik; }
    public void setMekanik(Karyawan mekanik) { this.mekanik = mekanik; }
    
 // Method untuk menghitung total biaya sesuai aturan soal
    public double hitungTotalBiaya() {
        double biayaDasar = this.servicePrice;
        String tipe = this.kendaraan.getTipeKendaraan();
        
        // Mengecek tipe kendaraan
        // Pakai equalsIgnoreCase agar tidak sensitif huruf besar/kecil
        if (tipe.equalsIgnoreCase("Mobil")) {
            return biayaDasar + 50000;
        } else if (tipe.equalsIgnoreCase("Sepeda Motor")) {
            return biayaDasar + 20000;
        } else {
            return biayaDasar; // Jika tipenya tidak dikenali
        }
    }
}