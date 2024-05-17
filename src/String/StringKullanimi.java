package String;
public class StringKullanimi {
    public static void main(String[] args) {
        String str1 = "JAVA öğreniyorum";
        String str2 = "Bu ders Stringlerin Kullanımları";

        // isEmpty: String'in boş olup olmadığını kontrol eder
        boolean bosMu = str1.isEmpty();
        System.out.println("str1 boş mu? " + bosMu);

        // equals: İki string'in eşit olup olmadığını kontrol eder
        boolean esittir = str1.equals(str2);
        System.out.println("str1 ve str2 eşit mi? " + esittir);

        // concat: İki string'i birleştirir
        String birlesik = str1.concat(" ").concat(str2);
        System.out.println("Birleşik string: " + birlesik);

        // substring: Belirtilen indeks aralığındaki string'i döndürür
        String altString = str1.substring(1, 13);
        System.out.println("Substring: " + altString);

        // length: String'in uzunluğunu döndürür
        int uzunluk = str1.length();
        System.out.println("String'in uzunluğu: " + uzunluk);

        // getBytes: String'i byte dizisine dönüştürür
        byte[] byteDizisi = str1.getBytes();
        System.out.print("Byte dizisi: ");
        for (byte b : byteDizisi) {
            System.out.print(b + " ");
        }
        System.out.println();

        // toLowerCase: String'i küçük harfe dönüştürür
        String kucukHarf = str1.toLowerCase();
        System.out.println("Küçük harfli string: " + kucukHarf);

        // toUpperCase: String'i büyük harfe dönüştürür
        String buyukHarf = str1.toUpperCase();
        System.out.println("Büyük harfli string: " + buyukHarf);

        // contains: String'in belirtilen alt string'i içerip içermediğini kontrol eder
        boolean iceriyorMu = str1.contains("öğreniyorum");
        System.out.println("str1 'öğreniyorum' kelimesini içeriyor mu? " + iceriyorMu);

        // replace: String'deki belirtilen karakter veya alt string'i değiştirir
        String degistirilmis = str1.replace("JAVA", "HTML");
        System.out.println("Değiştirilmiş string: " + degistirilmis);

        // split: String'i belirtilen ayırıcıya göre böler
        String[] bolunmus = str1.split(" ");
        System.out.println("Split sonucu: ");
        for (String s : bolunmus) {
            System.out.println(s);
        }

        // startsWith: String'in belirtilen prefix ile başlayıp başlamadığını kontrol eder
        boolean basliyorMu = str1.startsWith("JAVA");
        System.out.println("str1 'JAVA' ile başlıyor mu? " + basliyorMu);

        // endsWith: String'in belirtilen suffix ile bitip bitmediğini kontrol eder
        boolean bitiyorMu = str1.endsWith("öğreniyorum");
        System.out.println("str1 'öğreniyorum' ile bitiyor mu? " + bitiyorMu);

        // charAt: Belirtilen indeksdeki karakteri döndürür
        char karakter = str1.charAt(9);
        System.out.println("9. indeksteki karakter: " + karakter);

        // indexOf: Belirtilen karakterin veya alt string'in ilk bulunduğu indeks'i döndürür
        int indeks = str1.indexOf('a');
        System.out.println("'a' karakterinin indeksi: " + indeks);

        // trim: String'in başındaki ve sonundaki boşlukları temizler
        String bosluklu = "   JAVA öğreniyorum  ";
        String temizlenmis = bosluklu.trim();
        System.out.println("Temizlenmiş string: '" + temizlenmis + "'");
    }
}