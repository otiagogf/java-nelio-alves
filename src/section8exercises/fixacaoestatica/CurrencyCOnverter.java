package section8exercises.fixacaoestatica;

import java.util.Scanner;

public class CurrencyCOnverter {
    Scanner sc = new Scanner(System.in);
    double priceDollar;
    double boughtDollars;
    double iof = 6.0;
    double dollarConversion;

    public double conversionInReal(double priceDollar, double boughtDollars){
        dollarConversion =  (priceDollar * boughtDollars) * (1+(iof/100));
        return dollarConversion;
    }
}
