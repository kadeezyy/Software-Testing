package task1;

public class ArcSin {
    private static final double EPS = 1e-10;

    public static double compute(double x) {
        if (Math.abs(x) > 1) {
            return Double.NaN;
        }

        double res = x, term = x;
        int n = 1, maxIterations = 1000;
        while (Math.abs(x) > EPS && n < maxIterations) {
            term *= x * x * (2 * n - 1) * (2 * n - 1) / (2 * n) / (2 * n + 1);
            res += term;
            n++;
        }
        return res;
    }
}
