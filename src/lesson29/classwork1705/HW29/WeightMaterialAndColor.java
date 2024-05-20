package lesson29.classwork1705.HW29;

public enum WeightMaterialAndColor {

    PLASTIC("Black"),
    BRONZE("Green"),
    IRON("Gray"),
    STEEL("Silver");

    private final String color;

    WeightMaterialAndColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
