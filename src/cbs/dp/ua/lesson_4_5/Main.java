package cbs.dp.ua.lesson_4_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        ConverterTemperature convFahrenheit = new ConverterTemperatureFahrenheit();
        ConverterTemperature convKelvin = new ConverterTemperatureKelvin();
        System.out.println("Enter the temperature in Celsius");
        double temp = scn.nextDouble();

        System.out.println(" The temperature Celsius to Fahrenheit: " + convFahrenheit.convert(temp));
        System.out.println(" The temperature Celsius to Kelvin: " + convKelvin.convert(temp));
    }
}
