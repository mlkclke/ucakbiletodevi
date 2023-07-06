import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mesafe,yas,yolculukTipi;
        double total;

        System.out.print("Mesafeyi (Km) türünden giriniz: ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi = input.nextInt();

        if ((mesafe > 0) && (yas > 0) && (yolculukTipi == 1 || yolculukTipi == 2)){

            total=mesafe * 0.10;

            if(yas < 12){
                total-=total*0.5;
            }if (yas >= 12 && yas <= 24) {
                total-=total*0.1;
            }if (yas >= 65){
                total-=total*0.3;
            }

            if(yolculukTipi == 2){
                total -= total*0.2;
                total *=2;
            }
            System.out.println("Toplam Tutar = "+total+" TL");
        }else{
            System.out.println("Hatali veri tipi girdiniz!");
        }

    }
}