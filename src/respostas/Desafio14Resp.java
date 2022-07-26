package respostas;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Desafio14Resp {
        public static void main(String[] args) {
                AtomicInteger contadorAmarelas = new AtomicInteger(0);
                AtomicInteger contadorVermelhas = new AtomicInteger(0);
                AtomicInteger contadorFinal = new AtomicInteger(0);
                Stream.concat(
                                Stream.concat(
                                                IntStream.range(0, 100)
                                                                .map((i) -> 1) // Amarelos
                                                                .boxed(),
                                                IntStream.range(0, 50)
                                                                .map((i) -> 2) // Vermelhos
                                                                .boxed()),
                                IntStream.range(0, 25)
                                                .map((i) -> 3) // Azuis
                                                .boxed())
                                .sorted((i1, i2) -> (int) (Math.random() * 50) - 25).filter((f) -> switch (f) {
                                        case 1 -> contadorAmarelas.incrementAndGet() < 100 * 0.75;
                                        case 2 -> contadorVermelhas.incrementAndGet() < 50 * 0.75;
                                        default -> false;
                                })
                                .peek((i) -> contadorFinal.incrementAndGet())
                                .forEach(System.out::print);
                System.out.println();
                System.out.println("Total: " + contadorFinal.get());
        }
}