public class latianOperator {
    public static void main(String[] args) {
          //inisialisasi sebagai stok
          int laptop = 7,  hardisk= 11, mouse=21; 
          double harga_laptop, harga_hardisk, harga_mouse;
          harga_laptop = 10000000;
          harga_hardisk = 1500000;
          harga_mouse = 150000;
          double total, bayar;
  
        
          //operator aritmatika total barang tersedia//
          total= laptop+hardisk+mouse;
  
          System.out.println("jumlah barang yang tersedia =" +laptop+ "+" +hardisk+ "+" +mouse+"=" +total);
  
          bayar = (total*harga_laptop)+(total*harga_hardisk)+(total*harga_mouse);
  
          //total aset yang dimiliki
          System.out.println("total aset yang dimiliki = Rp" +bayar);
    }
    
}
