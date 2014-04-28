import static org.junit.Assert.*;

import org.junit.Test;


public class RecordCollectTest {


	@Test
	public void testSomeMethod_false() {
		String expected = "TrialClass";
		
		 String tempInt = RecordCollect.someMethod().toString();
		
		
		// int tempInt = Integer.parseInt(RecordAvg.someMethod().toString());
		
		assertEquals(expected,tempInt);	
	}
	
	@Test
	public void testSomeMethod_run(){
		assertNotNull(RecordCollect.someMethod());
	}

}
