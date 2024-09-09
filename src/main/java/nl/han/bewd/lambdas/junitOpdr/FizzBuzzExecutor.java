package nl.han.bewd.lambdas.junitOpdr;

public class FizzBuzzExecutor {
    public String execute(int number){

            String answer = "";
            if(number % 3 == 0) {
                answer += "Fizz";
            }
            if(number % 5 == 0) {
                answer += "Buzz";
            }
            if (answer.equals("")) {
                answer = String.valueOf(number);
            }
            return answer;
    }
}
