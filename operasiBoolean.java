public class operasiBoolean {
    public static void main(String[] args) {
        
        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusabsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusNilai && lulusabsen;
        System.out.println(lulus);
    }
    
}
