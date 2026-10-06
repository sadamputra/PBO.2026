package jobsheet06.tugas;

public class Kendaraan {
    public String merk;
    public String warna;
    public int tahunKeluaran;

    // Constructor tanpa parameter (Overloading)
    public Kendaraan() {
        System.out.println("Objek Kendaraan dibuat");
    }

    // Constructor berparameter (Overloading)
    public Kendaraan(String merk, String warna, int tahunKeluaran) {
        this.merk = merk;
        this.warna = warna;
        this.tahunKeluaran = tahunKeluaran;
    }

    public String getInfo() {
        String info = "";
        info += "Merk          : " + merk + "\n";
        info += "Warna         : " + warna + "\n";
        info += "Tahun Keluaran: " + tahunKeluaran + "\n";
        return info;
    }
}