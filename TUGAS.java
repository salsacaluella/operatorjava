import java.util.Scanner;
public class TUGAS {
    public static void main(String[] args) {

        int totalHarga = 0;
        Scanner input = new Scanner(System.in);

        char yn;

        do {
            System.out.println("1. sabun cuci piring");
            System.out.println("2. minyak goreng");
            System.out.println("3. Telur");
            System.out.println("4. beras");
            System.out.println("5. gula");
            System.out.println("Nomor barang: ");
            
            int nilai = input.nextInt();

            int harga = 0; // Initialize harga here

            switch (nilai) {
                case 1:
                    harga = 15000;
                    break;
                case 2:
                    harga = 40000;
                    break;
                case 3:
                    harga = 25000;
                    break;
                case 4:
                    harga = 13500;
                    break;
                case 5:
                    harga = 12500;
                    break;
                default:
                    System.out.println("Nomor barang tidak valid!");
            }

            totalHarga += harga; // Add the harga to the total

            System.out.println("Mau lanjut? (Y/T): ");
            yn = input.next().charAt(0);

        } while (yn == 'Y' || yn == 'y'); // Keep looping as long as yn is 'Y' or 'y'

        System.out.println("Harga total = " + totalHarga);
    }

}
