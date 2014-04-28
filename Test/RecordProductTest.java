import static org.junit.Assert.*;

import org.junit.Test;


public class RecordProductTest {
	@Test
	public void testSomeMethod_true() {
		double expected = 6.0;
		
		 String tempInt = RecordProduct.someMethod().toString();
		 double tempOp = Double.parseDouble(tempInt);
		
		// int tempInt = Integer.parseInt(RecordAvg.someMethod().toString());
		
		assertEquals(expected,tempOp,1e-8);	
	}
	
	@Test
	public void testSomeMethod_false() {
		double expected = 5.0;
		
		 String tempInt = RecordProduct.someMethod().toString();
		 double tempOp = Double.parseDouble(tempInt);
		
		// int tempInt = Integer.parseInt(RecordAvg.someMethod().toString());
		
		assertEquals(expected,tempOp,1e-8);	
	}
	
	@Test
	public void testSomeMethod_run(){
		assertNotNull(RecordProduct.someMethod());
	}
}