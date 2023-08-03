package cbs.dp.ua.lesson_4_5;

public class ConverterTemperatureKelvin extends ConverterTemperature{

    @Override
    public double convert (double cels) {
        return (cels +273.15);
    }
}
