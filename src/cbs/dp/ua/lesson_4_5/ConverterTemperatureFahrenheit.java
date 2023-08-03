package cbs.dp.ua.lesson_4_5;

public class ConverterTemperatureFahrenheit extends ConverterTemperature{

    @Override
    public double convert (double cels) {
        return (cels*9/5 + 32);
    }


}
