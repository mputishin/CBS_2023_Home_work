package cbs.dp.ua.lesson_4_5;

public class ConverterTemperature {

    public double convertFahrenheit (double cels) {
        return (cels*9/5 + 32);
    }

    public double convertKelvin (double cels) {
        return (cels +273.15);
    }
}
