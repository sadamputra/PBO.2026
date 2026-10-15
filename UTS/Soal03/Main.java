package UTS.Soal03;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.log_in("customer", "123");
        customer.apply_verification("dokumen.pdf");
        customer.log_out();

        Admin admin = new Admin();
        admin.log_in("admin", "123");
        admin.add_vehicle("Mobil");
        admin.verify_user();
        admin.log_out();
    }
}