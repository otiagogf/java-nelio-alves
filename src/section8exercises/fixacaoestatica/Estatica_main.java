package section8exercises.fixacaoestatica;

import java.util.Scanner;

public class Estatica_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double priceDollar;
        double boughtDollars;
        double dollarConversion;
        CurrencyCOnverter cConverter = new CurrencyCOnverter();

        System.out.printf("What is the dollar price? ");
        priceDollar = sc.nextDouble();

        System.out.printf("How many dollars will be bought? ");
        boughtDollars = sc.nextDouble();

        dollarConversion = cConverter.conversionInReal(priceDollar, boughtDollars);

        System.out.println("R$ " + dollarConversion);
    }
}
