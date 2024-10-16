import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SwapTest{

	@Test
	public void testSwapper(){
		int [] array = {1,2,3,4,5,6};
		Swap swapped = new Swap();
		int [] answer = swapped.swapper(array);
		int [] expected = {2,1,4,3,5,6};
		assertArrayEquals(expected,answer);

	}





}