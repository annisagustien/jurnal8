package jurnalno2;

public class JURNALNO2 {

    public static void main(String[] args) {
        
        System.out.println("Masukkan angka : ");
        System.out.println(" ");
        int a = 1;
        int jumlah = 10;
        int b = 12 / 2;
        for (int i = 1; i <= b; i++) {
            for (int x = b; x > i; x--) {
                System.out.print(" ");
            }
            for (int y = 1; y <= a; y++) {
                System.out.print("*");
            }
            a += 2;
            System.out.println(" ");
        }
        a -= 4;
        for (int i = (b-1); i >= 1; i--) {
            for (int x = i; x <= (b-1); x++) {
                System.out.print(" ");
            }
            for (int y = a; y >= 1; y--) {
                System.out.print("*");
            }
            a -= 2;
            System.out.println(" ");
        }

    }
}
