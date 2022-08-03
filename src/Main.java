import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);

        int mat,fiz,kim,tur,tar,muz;

        System.out.println("Lutfen Matematik notunuzu giriniz: ");
        mat=scn.nextInt();

        System.out.println("Lutfen Fizik notunuzu giriniz: ");
        fiz=scn.nextInt();

        System.out.println("Lutfen Kimya notunuzu giriniz: ");
        kim=scn.nextInt();

        System.out.println("Lutfen Turkce notunuzu giriniz: ");
        tur=scn.nextInt();

        System.out.println("Lutfen Tarih notunuzu giriniz: ");
        tar=scn.nextInt();

        System.out.println("Lutfen Muzik notunuzu giriniz: ");
        muz=scn.nextInt();

        double ort;
        ort=(mat+fiz+kim+tur+tar+muz)/6.0;
        String sonuc;
        sonuc=(ort>=60)?"gecti":"kaldi";
        System.out.println(ort+" "+sonuc);

    }
}
