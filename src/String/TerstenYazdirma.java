package String;
public class TerstenYazdirma {
    public static void main(String[] args) {
        String orijinal = "JAVA dili programlama";
        String ters = tersineCevir(orijinal);
        System.out.println("Orijinal string: " + orijinal);
        System.out.println("Tersine çevrilmiş string: " + ters);
    }

    public static String tersineCevir(String input) {
        char[] karakterler = input.toCharArray();
        int baslangic = 0;
        int bitis = karakterler.length - 1;

        while (baslangic < bitis) {
            char temp = karakterler[baslangic];
            karakterler[baslangic] = karakterler[bitis];
            karakterler[bitis] = temp;

            baslangic++;
            bitis--;
        }
        return new String(karakterler);
    }
}