package UTS.Soal03;

public class UserProfile {
    private int user_id;
    private String password;
    private String name;
    private int age;
    private String email_id;
    private String doc;

    public int get_user_id() {
        return user_id;
    }

    public String get_password() {
        return password;
    }

    public String get_name() {
        return name;
    }

    public int get_age() {
        return age;
    }

    public String get_email() {
        return email_id;
    }

    public void edit_profile() {
        System.out.println("Profil berhasil diedit");
    }

    public void show_documents() {
        System.out.println("Menampilkan dokumen");
    }
}