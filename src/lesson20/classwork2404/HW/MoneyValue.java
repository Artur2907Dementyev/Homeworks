package lesson20.classwork2404.HW;

public enum MoneyValue {
    EURO(1),
    USD(1.06),
    TL(34.42);

    private final double conversionFactor;

    MoneyValue(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }
}
