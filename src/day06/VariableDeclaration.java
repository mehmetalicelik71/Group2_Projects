package day06;

public class VariableDeclaration {
    double PI_SAYISI=3.14;
    public static void main(String[] args) {
        //Dikdörtgenin alanını ve çevresini hesaplayan bir Java programı geliştiriniz.
        // Değişken tanımlamalarında türkçe karakterleri kullanmayınız: ı,İ,ğ,ü,ş,Ş,ö,Ö,ç,Ç
        /*Notasyonalar:
        1.Camel Notasyonu: kisaKenar
        2.Pascal Notasyonu: VariableDeclaration
        3.Snake Notasyonu: PI_SAYISI                    */
        String arabaninKapisininRengi="Kırmızı";
        int kisaKenar=7;
        int uzunKenar=11;
        //Çevre hesabı: 2x (Kısa Kenar + Uzun Kenar)
        //Alan Hesabı: Kısa Kenar x Uzun Kenar

        int dikdortgeninCevresi=2 * (kisaKenar+uzunKenar);//statement
        int dikdortgeninAlani=kisaKenar*uzunKenar;//statement

        //Concatenation
        System.out.println("Kısa Kenar : "+kisaKenar);
        System.out.println("Uzun Kenar : "+uzunKenar);
        System.out.println();
        System.out.println("Diktörtgenin Çevresi = "+dikdortgeninCevresi);
        System.out.println("Diktörtgenin Alanı = "+dikdortgeninAlani);



    }
}
