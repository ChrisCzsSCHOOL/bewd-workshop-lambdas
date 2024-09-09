package nl.han.bewd.lambdas.junitOpdr;

import java.util.stream.IntStream;

public class FizzBuzzRunner {
    public static void main(String[] args) {
        FizzBuzzExecutor ex = new FizzBuzzExecutor();

        IntStream.rangeClosed(1, 100).forEach(i -> {
            System.out.println(ex.execute(i));
        });
    }
}
