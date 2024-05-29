package org.company.lab2.writer;

import org.company.lab2.math.MathFunction;

import java.io.IOException;

public interface IWriter {

    void write(
            MathFunction function,
            double from,
            double to,
            double step
    ) throws IOException;
}
