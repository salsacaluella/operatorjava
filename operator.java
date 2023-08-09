public class operator {
    public static void main(String[] args) {
        
        //inisialisasi sebagai stok
        int semangka = 7, mangga = 3; 
        double harga_semangka, harga_mangga;
        harga_mangga = 3000.2;
        harga_semangka = 5000.2;
        double total, bayar;

        //operator penugasan (pembelian yang mengurangi stok)//
        mangga-= 2;
        semangka-=3;
        //operator aritmatika total barang tersedia//
        total=semangka+mangga;

        System.out.println("jumlah barang yang tersedia =" +semangka+ "+" +mangga+ "=" +total);

        bayar = (total*harga_mangga)+(total*harga_semangka);

        //total aset yang dimiliki
        System.out.println("total aset yang dimiliki = Rp" +bayar);
    }
    
}
