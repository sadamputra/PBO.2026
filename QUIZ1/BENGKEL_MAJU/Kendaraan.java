package QUIZ1.BENGKEL_MAJU;

public class Kendaraan {
    private String platNomor;
    private String merek;
    private String model;
    private String tipeKendaraan; // Isinya nanti "Mobil" atau "Sepeda Motor"
    private Pelanggan pemilik; // Relasi balik ke class Pelanggan

    public Kendaraan(String platNomor, String merek, String model, String tipeKendaraan, Pelanggan pemilik) {
        this.platNomor = platNomor;
        this.merek = merek;
        this.model = model;
        this.tipeKendaraan = tipeKendaraan;
        this.pemilik = pemilik;
    }

    public String getPlatNomor() { return platNomor; }
    public void setPlatNomor(String platNomor) { this.platNomor = platNomor; }

    public String getMerek() { return merek; }
    public void setMerek(String merek) { this.merek = merek; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getTipeKendaraan() { return tipeKendaraan; }
    public void setTipeKendaraan(String tipeKendaraan) { this.tipeKendaraan = tipeKendaraan; }

    public Pelanggan getPemilik() { return pemilik; }
    public void setPemilik(Pelanggan pemilik) { this.pemilik = pemilik; }
}