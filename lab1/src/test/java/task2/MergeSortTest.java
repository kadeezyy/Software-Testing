package task2;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MergeSortTest {
    @ParameterizedTest
    @MethodSource("provider")
    void test(int[] testCase) {
        int[] expected = getExpectedResult(testCase);
        assertArrayEquals(expected, MergeSort.mergeSort(testCase, 0, testCase.length - 1));
    }

    private static Stream<int[]> provider() {
        return Stream.of(
                new int[] {},
                new int[]{1, 1, 1, 1, 1},
                new int[]{12, 11, 13, 5, 6, 7},
                new int[]{3, 7, 2, 8, 1, 9, 4},
                new int[]{12, 11, 13, 5, 6, 7},
                new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1},
                new int[]{12, 11, 13, 5, 6, 7}
        );
    }

    private int[] getExpectedResult(int[] arr) {
        int[] sortedArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }
}
