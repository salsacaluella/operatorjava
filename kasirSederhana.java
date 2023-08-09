import java.util.Scanner;

public class kasirSederhana {
    public static void main(String[] args) {
        
        System.out.println("===menu makanan===");
        System.out.println("1. Soto Ayam (15000)");
        System.out.println("2. rawon daging (17000)");
        System.out.println("3. Mie goreng (5000)");
        System.out.println("4. Tahu Telor (8000)");
        System.out.println("5. sate kambing (20000)");

        int soto, rawon, mie, tahu, sate;
        soto = 15000;
        rawon = 17000;
        mie = 5000;
        tahu = 8000;
        sate = 20000;

        int jumlahBeli, totals, totalr, totalm,totalt,totalsate, bayar, kembali;

        Scanner input = new Scanner (System.in);
        System.out.println("Jumlah beli soto :");
        int jSoto = input.nextInt();
        totals = jSoto*soto;

        System.out.println("Jumlah beli rawon :");
        int jRawon = input.nextInt();
        totalr = jRawon*rawon;

        System.out.println("Jumlah beli mie :");
        int jmie = input.nextInt();
        totalm = jmie*mie;

        System.out.println("Jumlah beli tahu :");
        int jTahu = input.nextInt();
        totalt = jTahu*tahu;

        System.out.println("Jumlah beli sate :");
        int jSate = input.nextInt();
        totalsate = jSate*sate;

        System.out.println("total pembelian: "+(totals+totalm+totalr+totalsate+totalt));
        System.out.println("masukkan pembayaran:");
        bayar = input.nextInt();
        kembali = bayar-(totals+totalm+totalr+totalsate+totalt);
        System.out.println("jumlah kembalian: "+kembali);


    }

    
}
