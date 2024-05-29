package org.company.lab2.unit;

import org.company.lab2.math.function.trigonometric.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.company.lab2.ReflectionUtil;
import org.company.lab2.math.MathFunction;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathFunctionTest {

    List<Class<? extends MathFunction>> functions;

    @BeforeAll
    void init() {
        functions = Arrays.asList(
                Sin.class,
                Cos.class,
                Tan.class,
                Cot.class,
                Sec.class,
                Csc.class
        );
    }

    @ParameterizedTest
    @ValueSource(doubles = {1.1, -1.1, 1.0, 0.0, Double.NaN})
    void testInvalidPrecision(double precision) {
        functions.forEach(functionClass -> assertThrows(
                IllegalArgumentException.class,
                () -> ReflectionUtil.createInstance(
                        functionClass,
                        new Class[]{double.class, int.class},
                        precision, 1
                ))
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, Integer.MIN_VALUE})
    void testInvalidMaxIterations(int maxIterations) {
        functions.forEach(functionClass -> assertThrows(
                IllegalArgumentException.class,
                () -> ReflectionUtil.createInstance(
                        functionClass,
                        new Class[]{double.class, int.class},
                        0.1, maxIterations
                ))
        );
    }
}
