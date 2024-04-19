package task1;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ArcSinTest {
    private static final double EPS = 1e-3;
    private final Random random = new Random();

    @RepeatedTest(100)
    void randomValuesTest() {
        double x = random.nextDouble(-1, 1);
        assertEquals(Math.asin(x), ArcSin.compute(x), EPS);
    }

    @RepeatedTest(3)
    void invalidValueTest() {
        double x = random.nextDouble(1, 100);
        assertEquals(Double.NaN, ArcSin.compute(x));
    }
}
