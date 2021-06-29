package matriz;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final int qtFiles = 250;

    public static void main(String[] args) throws InterruptedException {
        
        Instant start = Instant.now();

        int vezes = 0;
        String palavra = "original";
        int numThreads = 1;

        List<Contador> threads = new ArrayList<>();

        for (int i = 0; i < numThreads; i++) {
            int inicio = new Float((qtFiles / numThreads) * i).intValue();
            int fim = new Float(((qtFiles / numThreads) * (i + 1)) - 1).intValue();
            Contador thread = new Contador(inicio, fim, palavra);
            thread.start();
            threads.add(thread);
        }

        for (Contador t : threads) {
            t.join();
            vezes += t.getVezes();
        }

        System.out.println("Foram encontradas " + vezes + ", da palavra - " + palavra);
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end));
    }
}
