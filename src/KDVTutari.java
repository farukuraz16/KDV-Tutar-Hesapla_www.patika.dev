import java.util.Scanner;

public class KDVTutari {
    public static void main(String[] args) {
        /*
        KDV Tutarı Hesaplayan Program
        Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        (Not : KDV tutarını 18% olarak alın)
       KDV'siz Fiyat = 10;
        KDV'li Fiyat = 11.8;
        KDV tutarı = 1.8;
        Ödev
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
        */

        Scanner dat = new Scanner(System.in);
        System.out.println("Tutar giriniz= ");
        int para= dat.nextInt();
        double KDV;
        double tutarKDVli;
        if (para<1000){
            KDV=para*0.18;
        }else KDV=para*0.8;

        tutarKDVli=KDV+para;
        System.out.println("KDV'siz Fiyat= "+para);
        System.out.println("KDV tutarı= "+KDV);
        System.out.println("KDV'li Fiyat= "+tutarKDVli);

    }
}
