import java.util.Scanner;

 public class  ekokEbob {
    public static void main(String[] args) {



        int sayi1, sayi2, kucukSayi, buyukSayi;

        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz: ");
        sayi1 = inp.nextInt();
        System.out.print("Ikinci sayiyi giriniz:");
        sayi2 = inp.nextInt();

        if (sayi1 > sayi2) {
            kucukSayi = sayi2;
            buyukSayi = sayi1;
        } else {
            kucukSayi = sayi1;
            buyukSayi = sayi2;
        }

        for (int i=kucukSayi; i>= 1; i--) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                System.out.println("EBOB: " + i);
                break;
            }
        }

        for (int i=buyukSayi; i <= sayi1 * sayi2; i++) {
            if (i % sayi1 == 0 && i % sayi2 == 0) {
                System.out.println("EKOK: " + i);
                break;
            }
        }
    }
}