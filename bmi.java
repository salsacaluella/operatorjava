public class bmi {
    public static void main(String[] args) {
        
        double tinggi = 1.58;
        double berat = 38.5;

        double bmi = berat/tinggi;

        System.out.println("bmindex :"+bmi);

        if ( bmi <=18.4 ){
 System.out.println("under weight");
        }
       

        if ( bmi <=24.9 );{
            System.out.println("Normal");
        }
        

         if ( bmi <=39.9 );{
            System.out.println("Overweight");
         }
        
    }
    
}
