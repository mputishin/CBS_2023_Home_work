package cbs.dp.ua.Lambdas_9_2;

import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) throws IllegalStateException {

        SquareNumber squareNumber = x -> x*x;

        Stream<Integer> intStream = Stream.of(23, 12, 45, 35, 26, 31, 18, 25, 9, 39)

                .map(squareNumber::calculate)
                .reduce(Integer::sum)
                .stream();
        intStream.forEach(System.out::println);
    }
}

