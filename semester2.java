import java.util.Scanner;
public class semester2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    
        System.out.println("masukkan kendaraan : ");
        String kendaraan = input.nextLine();

        System.out.println("masukkan berapa jam parkir : ");
        int jam = input.nextInt();

        switch (kendaraan) {
            case "motor" :
            if (jam<=1) {
                int harga = 5000;
            }
            else if (jam>1) {
                int n = jam-1;
                
                int harga =+ 2000*n+5000;
            
                System.out.println("total biaya parkir = "+"Rp"+harga);
                break;}
               
                

                 case "mobil" :
            if (jam<=1) {
                int biaya = 10000;
            }
            else if (jam>1) {
                int n = jam-1;
                
                int biaya =+ 2000*n+10000;
           
                System.out.println("total biaya parkir = "+"Rp"+biaya);
                break; }
               
                
        
            default:
            System.out.println("salah input kendaraan atau jam");
                break;
        }
    }
}
