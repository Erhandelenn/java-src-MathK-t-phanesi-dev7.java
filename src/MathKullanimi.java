public class MathKullanimi {
    public static void main(String[] args) {
        // max methodu: Verilen iki sayıdan büyük olanını gösterir
        int maxSayi = Math.max(15, 55);
        System.out.println("Max sayı değeri: " + maxSayi);

        // min methodu: Verilen iki sayıdan küçük olanını gösterir
        int minSayi = Math.min(1, 61);
        System.out.println("Min sayı değeri: " + minSayi);

        // ceil methodu: Bir ondalıklı sayıyı yukarıya yuvarlar
        double yuvarlananYukari = Math.ceil(8.7);
        System.out.println("Yukarıya yuvarlanan sayı değeri: " + yuvarlananYukari);

        // floor methodu: Bir ondalıklı sayıyı aşağıya yuvarlar
        double yuvarlananAsagi = Math.floor(6.1);
        System.out.println("Aşağıya yuvarlanan sayı değeri: " + yuvarlananAsagi);

        // abs methodu: Bir sayının mutlak değerini döndürür
        int mutlakDeger = Math.abs(-15);
        System.out.println("Mutlak değeri: " + mutlakDeger);

        // pow methodu: Bir sayının üssünü hesaplar
        double ussu = Math.pow(3, 6);
        System.out.println("Üstlü sayı değeri: " + ussu);

        // sqrt methodu: Bir sayının karekökünü hesaplar
        double karekok = Math.sqrt(61);
        System.out.println("Karekök değeri : " + karekok);
    }
}