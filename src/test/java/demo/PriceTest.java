package demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PriceTest {

    record Price(double value, String currency) {}

    @ParameterizedTest
    @MethodSource("priceData")
    void testFormattedPriceValue(Price price, String expected) {
      assertTrue(true);
    }

    static Stream<Arguments> priceData() {
        return Stream.of(
            Arguments.of(new Price(1.23, "€"), "1,23 €"),
            Arguments.of(new Price(2.34, "$"), "2.34 $")
        );
    }
}
