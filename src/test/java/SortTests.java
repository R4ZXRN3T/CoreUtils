import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.R4ZXRN3T.ArrayUtils;
import org.junit.jupiter.api.Test;

public class SortTests {
	@Test
	void testSort() {
		int[] input = {5, 2, 9, 1, 5, 6};
		int[] expected = {1, 2, 5, 5, 6, 9};
		int[] result = ArrayUtils.sort(input);
		assertArrayEquals(expected, result);
	}
}