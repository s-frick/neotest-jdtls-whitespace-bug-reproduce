package demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class GenericsTest {

    record ValueObject<T>(T value) {}
    record Bar<T>(T bar) {}

    @ParameterizedTest
    @MethodSource("values")
    void testFormattedPriceValue(ValueObject<Bar<String>> value, String expected) {
      assertTrue(true);
    }

    static Stream<Arguments> values() {
        return Stream.of(
            Arguments.of(new ValueObject<>(new Bar<>("foo")), "foo")
        );
    }
}
