import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class Desafio20 {

    public static void main(String[] args) throws InterruptedException, IOException {

        List<Callable<String>> threads = new ArrayList<>();
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<String>> futures = null;
        Callable<String> consulta1 = () -> "Consulta sistema 1";
        Callable<String> consulta2 = () -> "Consulta sistema 2";
        Callable<String> consulta3 = () -> "Consulta sistema 3";
        Callable<String> consulta4 = () -> "Consulta sistema 4";

        threads.add(consulta1);
        threads.add(consulta2);
        threads.add(consulta3);
        threads.add(consulta4);

        futures = executorService.invokeAll(threads);

        executorService.shutdown();

        Files.write(Path.of("consulta.txt"),
                futures.stream().map(f -> {
                    try {
                        return f.get();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }).collect(Collectors.toList()));

    }

}
