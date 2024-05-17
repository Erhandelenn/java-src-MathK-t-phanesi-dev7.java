package String;
import java.util.HashMap;
import java.util.Map;

public class EnCokGecenHarf {
    public static void main(String[] args) {
        String cumle = "JAVA dilinde en çok geçen harfi bulma kodu";
        char enCokGecenHarf = enCokGecenHarfiBul(cumle);
        System.out.println("Cümle içinde en çok geçen harf: " + enCokGecenHarf);
    }
    public static char enCokGecenHarfiBul(String cumle) {
        Map<Character, Integer> harfSayilari = new HashMap<>();

        for (char harf : cumle.toCharArray()) {
            if (Character.isLetter(harf)) {
                harf = Character.toLowerCase(harf);
                harfSayilari.put(harf, harfSayilari.getOrDefault(harf, 0) + 1);
            }
        }
        char enCokGecenHarf = '\0';
        int enCokGecenHarfSayisi = 0;
        for (Map.Entry<Character, Integer> entry : harfSayilari.entrySet()) {
            if (entry.getValue() > enCokGecenHarfSayisi) {
                enCokGecenHarf = entry.getKey();
                enCokGecenHarfSayisi = entry.getValue();
            }
        }
        return enCokGecenHarf;
    }
}