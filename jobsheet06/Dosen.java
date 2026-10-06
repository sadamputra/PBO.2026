package jobsheet06;
 
public class Dosen extends Pegawai {
    public String nidn;
    
    public Dosen() {
        System.out.println("Objek dari class Dosen dibuat");
    }
    public String getAllInfo() {
       String info = super.getInfo();
        info += "NIDN : " + nidn + "\n";
        return info;
    }
}