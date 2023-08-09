public class operatorMatematika {
    public static void main(String[] args) {
        
        int a = 100;
        int b = 10;

        int hasilPertambahan = a+b;

        System.out.println("hasil Pertambahan:"+hasilPertambahan);


        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a* b);
        System.out.println(a / b);
        System.out.println(a % b);

        //augmented assignment
        int c = 100;

        c+= 10;
        System.out.println(c);

        c-= 10;
        System.out.println(c);

        c*= 10;
        System.out.println(c);

        c/= 10;
        System.out.println(c);

        c%= 10;
        System.out.println(c);

        //unary operator
        int d = 120;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);

        //rata rata
        double nilaiMtk = 80.9;
        double nilaiProduktif = 89.9;
        double nilaiInformatika = 90.8;

        double nilairata = (nilaiInformatika+nilaiMtk+nilaiProduktif)/3;

        System.out.println("nilai rata rata:"+nilairata);
    }
    
}
