import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Desafio14 {

    public static void main(String[] args) {

        AtomicInteger i = new AtomicInteger(0);
        Stream<Integer> redLily = Stream.generate(() -> 1).limit(100);
        Stream<Integer> yellowLily = Stream.generate(() -> 2).limit(50);
        Stream<Integer> blueLily = Stream.generate(() -> 3).limit(25);
        Stream<Integer> kinderGarten = Stream.of(redLily, yellowLily, blueLily).flatMap(lily -> lily);
        Stream<Integer> harvest;

        System.out.println("");

        kinderGarten = kinderGarten.sorted((a, b) -> (int) Math.signum(Math.random() - 0.5)).filter(e -> e != 3)
                .limit(113);

        kinderGarten.forEach(e -> System.out.print(e + " (" + i.incrementAndGet() + ") "));

    }

}
