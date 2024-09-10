package nl.han.bewd.lambdas.junitKata;

import java.util.List;

public class StringCalculator {

    public int add(String numbers) {


        if (numbers.equals("")) {
            return 0;
        }
        else if (numbers.contains(","))
        {
            String[] split = numbers.split(",");
            List.of(split).stream().map(s -> Integer.parseInt(s.trim()));

            int sum = 0;
            for (int i = 0; i < split.length; i++) {
                    sum += Integer.parseInt(split[i]);
            }
            return sum;
        }
        else {
            return Integer.parseInt(numbers);
        }

    }

}
