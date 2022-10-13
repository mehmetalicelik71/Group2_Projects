package day06;

public class VariableDeclaration3 {
    public static void main(String[] args) {
        /*-----Veri Tipleri-----
            1.ilkel Tipler - Primitive Types
            2.Referans Tipler - Refarance Types
         */

        //Tamsayı veri tipleri
        //int sayiMax=2_147_483_643;
        //int sayiMin=-2_147_483_648;

        //Wrapper class içerisinde bütün değişkenlerin max min değeri var...

        int sayiMaxI=Integer.MAX_VALUE;
        int sayiMinI=Integer.MIN_VALUE;
        System.out.println("İnteger Maksimum Değeri = " + sayiMaxI);
        System.out.println("İnteger Minimum Değeri = " + sayiMinI);

        byte sayiMaxB=Byte.MAX_VALUE;
        byte sayiMinB=Byte.MAX_VALUE;
        System.out.println("Byte Minimum Değeri = " +sayiMaxB);
        System.out.println("Byte Minimum Değeri = " +sayiMinB);

        short sayiMaxS=Short.MAX_VALUE;
        short sayiMinS=Short.MIN_VALUE;
        System.out.println("Short Minimum Değeri = " +sayiMaxS);
        System.out.println("Short Minimum Değeri = " +sayiMinS);

        long sayiMaxL=Long.MAX_VALUE;
        long sayiMinL=Long.MIN_VALUE;
        System.out.println("Long Minimum Değeri = " +sayiMaxL);
        System.out.println("Long Minimum Değeri = " +sayiMinL);







    }
}
