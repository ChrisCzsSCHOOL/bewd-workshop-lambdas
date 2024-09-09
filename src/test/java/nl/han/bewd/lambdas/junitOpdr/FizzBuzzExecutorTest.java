package nl.han.bewd.lambdas.junitOpdr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzExecutorTest {

    private FizzBuzzExecutor sut;

    @BeforeEach
    public void setup(){
        sut = new FizzBuzzExecutor();
    }

    @Test
    void executeWithValidIntTest(){
        // Arrange
        // var sut = new FizzBuzzExecutor();

        // Act
        var testValue = sut.execute(37);

        // Assert
        Assertions.assertEquals("37", testValue);
    }

    @Test
    void executeIsNumberDivisibleBy3(){
        // Arrange
        // var sut = new FizzBuzzExecutor();

        // Act
        var testValue = sut.execute(3);

        // Assert
        Assertions.assertEquals("Fizz", testValue);
    }

    @Test
    void executeIsNumberDivisibleBy5(){
        // Arrange
        // var sut = new FizzBuzzExecutor();

        // Act
        var testValue = sut.execute(5);

        // Assert
        Assertions.assertEquals("Buzz", testValue);
    }

    @Test
    void executeIsNumberDivisibleBy15(){
        // Arrange
        // var sut = new FizzBuzzExecutor();

        // Act
        var testValue = sut.execute(15);

        // Assert
        Assertions.assertEquals("FizzBuzz", testValue);
    }
}