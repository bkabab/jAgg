import static org.junit.Assert.*;

import org.junit.Test;


public class RecordSumTest {
	@Test
	public void testSomeMethod_true() {
		double expected = 6.0;
		
		 String tempInt = RecordSum.someMethod().toString();
		 double tempOp = Double.parseDouble(tempInt);
		
		// int tempInt = Integer.parseInt(RecordAvg.someMethod().toString());
		
		assertEquals(expected,tempOp,1e-8);	
	}
	
	@Test
	public void testSomeMethod_false() {
		double expected = 9.0;
		
		 String tempInt = RecordSum.someMethod().toString();
		 double tempOp = Double.parseDouble(tempInt);
		
		// int tempInt = Integer.parseInt(RecordAvg.someMethod().toString());
		
		assertEquals(expected,tempOp,1e-8);	
	}
	
	@Test
	public void testSomeMethod_run(){
		assertNotNull(RecordSum.someMethod());
	}
}