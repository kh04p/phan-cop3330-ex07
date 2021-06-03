package org.cop3330;

public class area {
    public static double calculate(double len, double width) {
        return len * width;
    }

    public static double convertToMeters(double area, double factor) {
        return area * factor;
    }

    public static double convertToFeet(double area, double factor) {
        return area / factor;
    }
}
