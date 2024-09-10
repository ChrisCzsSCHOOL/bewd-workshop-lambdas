package nl.han.bewd.lambdas.junitKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    private StringCalculator sut;

    @BeforeEach
    void setUp() {
        sut = new StringCalculator();
    }

    @Test
    void addEmptyStringReturnsZero() {
        var actual = sut.add("");

        assertEquals(0, actual);
    }

    @Test
    void addOneNumberReturnsThatNumber() {
        var actual = sut.add("1");

        assertEquals(1, actual);
    }

    @Test
    void addTwoCommaSeperatedNumbersReturnsSum() {
        var actual = sut.add("1,2");

        assertEquals(3, actual);
    }

    @Test
    void addMultipleSeperatedNumbersReturnsSum() {
        var actual = sut.add("1,2,3");

        assertEquals(6, actual);
    }
}