import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayMaxTest99 {
	@Test
	public void testCase99() {
		int a[]= {1,2,3,4,5};
		Assertions.assertEquals(5,ArrayMaxElement.arrayMaxElement(a));
	}
	@Test
	public void testCase98() {
		int a[]= {-7,-9,-6,-2,-1};
		Assertions.assertEquals(-1, ArrayMaxElement.arrayMaxElement(a));
	}
}
