package jobsheet03;

public class UserDemo {
    public static void main(String[] args) {

        User user1 = new User(
            "sadam23",
            "Sadam",
            "sadam@gmail.com"
        );

        System.out.println("Username: " + user1.username);
        System.out.println("Nama: " + user1.nama);
        System.out.println("Email: " + user1.email);

        User user2 = new User();
        
        System.out.println("Username user2: " + user2.username);
        System.out.println("Nama user2: " + user2.nama);
        System.out.println("Email user2: " + user2.email);
    }
}