import java.util.Scanner;
public class ifpredikat {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    
    System.out.println("masukkan nama :");
        String nama = input.nextLine();

        System.out.println("masukkan nilai :");
        double nilai = input.nextDouble();

        if ( nilai >= 96 && nilai <= 100) {
            System.out.println("nilai anda A, kriteria sangat baik");
        }
    
        else if( nilai >= 91 && nilai >=95){
        System.out.println("Nilai Anda A-, kriteria sangat baik");}

        else if( nilai >= 86 && nilai >=90){
        System.out.println("Nilai Anda B+, kriteria baik");}

        else if( nilai >=81 && nilai <=85){
        System.out.println("Nilai Anda B, kriteria baik");}

        else if( nilai >=75 && nilai <=80){
        System.out.println("Nilai Anda B-, kriteria baik");}

        else if( nilai >=70 && nilai <=74){
        System.out.println("Nilai Anda C+, kriteria cukup");}

        else if( nilai >=65 && nilai <=69){
        System.out.println("Nilai Anda C, kriteria baik");}

             else if( nilai >=60 && nilai <=64){
        System.out.println("Nilai Anda C-, kriteria baik");}   

        else if( nilai >=55 && nilai <=59){
        System.out.println("Nilai Anda D+, kriteria kurang");}

        else
        System.out.println("Nilai Anda D, kriteria kurang");
}
}
