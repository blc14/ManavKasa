import java.util.Scanner ;
public class ManavKasa {
    public static void main(String[] args){
        double arm=2.14, elm=3.67 , domates=1.11 , muz=0.95 , pat=5.00 , toplam ;
        int kgarm , kgelm , kgdom , kgmuz , kgpat ;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kaç kilo armut? : ");
        kgarm= scan.nextInt();
        System.out.print("Kaç kilo elma? : ");
        kgelm= scan.nextInt();
        System.out.print("Kaç kilo domates? : ");
        kgdom= scan.nextInt();
        System.out.print("Kaç kilo muz? : ");
        kgmuz= scan.nextInt();
        System.out.print("Kaç kilo pat? :");
        kgpat= scan.nextInt();

        toplam = (arm*kgarm) + (elm*kgelm) + (domates*kgdom) + (muz*kgmuz) + (kgpat*pat) ;

        System.out.println("Toplam Borcunuz= "+toplam);


    }
}
