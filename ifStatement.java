public class ifStatement {
    public static void main(String[] args) {
        
        var absen = 70;
        var nilai = 80;

        if ( absen >= 75 && nilai >= 75) {
            System.out.println("Selamat Anda LUlus");
        } else {System.out.println("silahkan coba lagi tahun depan");}
    
        if( nilai >= 80 && absen >=80){
        System.out.println("Nilai Anda A");}

        else if( nilai >= 70 && absen >=70){
        System.out.println("Nilai Anda B");}

        else if( nilai >= 60 && absen >=60){
        System.out.println("Nilai Anda C");}

        else if( nilai >= 60 && absen >=60){
        System.out.println("Nilai Anda D");}

        else
        System.out.println("Nilai Anda E");
    
    
    }
    
}
