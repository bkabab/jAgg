import static org.junit.Assert.*;
import org.junit.*;


public class RecordCountTest {


	@Test
	public void testSomeMethod_true() {
		int expected = 3;
		// String tempInt = Record2.someMethod().toString();
		
		 int tempInt = Integer.parseInt(RecordCount.someMethod().toString());
		
		assertEquals(expected,tempInt);	
		
	}
	
	@Test
	public void testSomeMethod_false(){
		int expected_false = 4;
		int tempInt = Integer.parseInt(RecordCount.someMethod().toString());
		assertEquals(expected_false,tempInt);
	}
	
	@Test
	public void testSomeMethod_run(){
		assertNotNull(RecordCount.someMethod());
	}
	
}
