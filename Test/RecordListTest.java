import static org.junit.Assert.*;

import org.junit.Test;


public class RecordListTest {
	@Test
	public void testSomeMethod_false() {
		
		int[] expectedArray = new int[]{1,2,3};
		assertEquals(expectedArray,RecordList.someMethod().toString());
	}
	
	@Test
	public void testSomeMethod_run(){
		assertNotNull(RecordList.someMethod());
	}
}
