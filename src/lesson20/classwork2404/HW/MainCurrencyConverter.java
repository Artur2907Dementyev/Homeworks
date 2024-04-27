package lesson20.classwork2404.HW;

public class MainCurrencyConverter {
    public static void main(String[] args) {

        MoneyValue euro = MoneyValue.EURO;
        MoneyValue usd = MoneyValue.USD;
        MoneyValue tl = MoneyValue.TL;

        // Example usage: Convert 100 EUR to USD
        double initialAmount = 100.0;
        double convertedToUSD = convertCurrency(euro, initialAmount, usd);
        System.out.printf("%.2f EUR is equivalent to %.2f USD%n", initialAmount, convertedToUSD);

        // Example usage: Convert 500 TL to EURO
        double anotherAmount = 500.0;
        double convertedToEuro = convertCurrency(tl, anotherAmount, euro);
        System.out.printf("%.2f TL is equivalent to %.2f EURO%n", anotherAmount, convertedToEuro);
    }

    static double convertCurrency(MoneyValue initialCurrency, double amount, MoneyValue targetCurrency) {
        double initialFactor = initialCurrency.getConversionFactor();
        double targetFactor = targetCurrency.getConversionFactor();

        return (amount / initialFactor) * targetFactor;
    }

}
