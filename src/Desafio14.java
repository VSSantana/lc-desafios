import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Desafio14 {

    public static void main(String[] args) {

        long numberOfRedLilys = 100;
        long numberOfYellowLilys = 50;
        long numberOfBlueLilys = 25;
        AtomicInteger i = new AtomicInteger(0);
        Stream<Integer> redLily = Stream.generate(() -> 1).limit(numberOfRedLilys);
        Stream<Integer> yellowLily = Stream.generate(() -> 2).limit(numberOfYellowLilys);
        Stream<Integer> blueLily = Stream.generate(() -> 3).limit(numberOfBlueLilys);
        Stream<Integer> kinderGarten = Stream.of(redLily, yellowLily, blueLily).flatMap(lily -> lily);

        System.out.println("\n ################### Lily's Garden After Harvest ################### \n");

        kinderGarten = kinderGarten.sorted((a, b) -> (int) Math.signum(Math.random() - 0.5)).filter(e -> e != 3)
                .limit(113);

        kinderGarten.forEach(e -> System.out.print(e + " (" + i.incrementAndGet() + ") "));

    }

}
