package jobsheet06.tugas;

public class Truk extends Kendaraan {
    public int kapasitasMuatan; // dalam ton atau kg

    // Constructor tanpa parameter
    public Truk() {
        super();
    }

    // Constructor berparameter dengan super()
    public Truk(String merk, String warna, int tahunKeluaran, int kapasitasMuatan) {
        super(merk, warna, tahunKeluaran);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public String getInfoTruk() {
        String info = super.getInfo();
        info += "Kapasitas Muatan: " + kapasitasMuatan + " ton\n";
        return info;
    }
}