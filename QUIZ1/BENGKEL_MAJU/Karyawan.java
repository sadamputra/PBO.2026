package QUIZ1.BENGKEL_MAJU;

public class Karyawan {
    private String idKaryawan;
    private String namaKaryawan;

    public Karyawan(String idKaryawan, String namaKaryawan) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
    }

    public String getIdKaryawan() { return idKaryawan; }
    public void setIdKaryawan(String idKaryawan) { this.idKaryawan = idKaryawan; }

    public String getNamaKaryawan() { return namaKaryawan; }
    public void setNamaKaryawan(String namaKaryawan) { this.namaKaryawan = namaKaryawan; }
}