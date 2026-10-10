package jobsheet07.tugas1;

public class Segitiga {
    private int sudut;

    // Overloading method totalSudut dengan 1 parameter (sudutA)
    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    // Overloading method totalSudut dengan 2 parameter (sudutA dan sudutB)
    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    // Overloading method keliling dengan 3 parameter (sisiA, sisiB, sisiC) - mengembalikan int
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Overloading method keliling dengan 2 parameter (sisiA dan sisiB) - menghitung sisi miring (Pythagoras), mengembalikan double
    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }

    public static void main(String[] args) {
        Segitiga s = new Segitiga();

        // Testing totalSudut
        System.out.println("Total Sudut (1 parameter, sudutA = 60): " + s.totalSudut(60));
        System.out.println("Total Sudut (2 parameter, sudutA = 60, sudutB = 70): " + s.totalSudut(60, 70));

        // Testing keliling
        System.out.println("Keliling Segitiga (3 sisi: 3, 4, 5): " + s.keliling(3, 4, 5));
        System.out.println("Sisi Miring / Keliling Pythagoras (2 sisi: 3, 4): " + s.keliling(3, 4));
    }
}