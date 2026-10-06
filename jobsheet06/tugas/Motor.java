package jobsheet06.tugas;

public class Motor extends Kendaraan {
    public String jenisStang;

    // Constructor tanpa parameter
    public Motor() {
        super();
    }

    // Constructor berparameter dengan super()
    public Motor(String merk, String warna, int tahunKeluaran, String jenisStang) {
        super(merk, warna, tahunKeluaran);
        this.jenisStang = jenisStang;
    }

    public String getInfoMotor() {
        String info = super.getInfo();
        info += "Jenis Stang   : " + jenisStang + "\n";
        return info;
    }
}