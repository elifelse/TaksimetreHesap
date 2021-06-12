import java.util.Scanner;

public class TaksimetreHesap {
    public static void main(String[] args) {

        double mesafe, tutar, taksimetre;
        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen mesafe : ");
        mesafe = input.nextDouble();

        taksimetre = (mesafe * 2.20) + 10;
        tutar = taksimetre > 20 ? taksimetre : 20;

        System.out.print(tutar);
    }
}
