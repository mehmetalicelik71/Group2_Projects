package day07;

public class Tesks {
    public static void main(String[] args) {
        //Benim adım Mehmet Ali ve 28 yaşındayım.
        //Önce bu şekliyle ekrana yazdırılacak. Daha sonra isim ve yaş değiştirilip tekrar yazılacak

        String ad = "Mehmet Ali";
        int yas = 28;
        System.out.println("Benim adım " + ad + " ve " + yas + " yaşındayım");
        ad = "Osman";
        yas = 50;
        System.out.println("Benim adım " + ad + " ve " + yas + " yaşındayım");

        double agirlik = 3.5;
        float agirlik2 = 1.7f;

        boolean buyukMu = 5 > 2;
        System.out.println(buyukMu);
        buyukMu = 1 > 4;
        System.out.println(buyukMu);

        String mesaj="Bu bir " + "deneme mesajıdır.";
        System.out.println(mesaj);

       int x=3,y=4,z=5;
       int carpim=x*y*z;
        System.out.println(carpim);

    }
}
