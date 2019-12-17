import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ArraySortTest {

	@Test
	public void sort_test(int[] x) {
		int [] expect = {2,5,7};
        Assert.assertArrayEquals(expect,x);
        System.out.println("Test Passed");
	}

}
