import java.util.Scanner;
public class programKamar {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    
        String nama, kamar;
        int harga, malam;

        System.out.println("===selamat datang===");
        
        System.out.print("Masukkan nama : ");
        nama = input.nextLine();

        System.out.print("Selamat datang " + nama + " silahkan pilih kamar :");
        kamar = input.nextLine();

        System.out.print("Masukkan jumlah malam : ");
        malam = input.nextInt();

        switch(kamar) {
            case "Levana" :
            harga = 450000 * malam;
            System.out.println("total yang harus dibayar :" +"Rp" + harga);
            break;

            case "Merapi" :
            harga = 750000 * malam;
            System.out.println("total yang harus dibayar :" +"Rp" + harga);
            break;

            case "Sativa" :
            harga = 900000 * malam;
            System.out.println("total yang harus dibayar :" +"Rp" + harga);
            break;

            default :
            System.out.println("salah input kamar, pilihan hanya Levana, Merapi, Sativa");
            break;

}
System.out.println("===terimakasih sudah berkunjung===");
} }