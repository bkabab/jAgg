import static org.junit.Assert.*;

import org.junit.Test;


public class RecordCovPopTest {
	@Test
	public void testSomeMethod_true() {
		double expected = 0.0;
		
		 String tempInt = RecordCovPop.someMethod().toString();
		 double tempOp = Double.parseDouble(tempInt);
		
		// int tempInt = Integer.parseInt(RecordAvg.someMethod().toString());
		
		assertEquals(expected,tempOp,1e-8);	
	}
	
	@Test
	public void testSomeMethod_false() {
		double expected = 1.0;
		
		 String tempInt = RecordCovPop.someMethod().toString();
		 double tempOp = Double.parseDouble(tempInt);
		
		// int tempInt = Integer.parseInt(RecordAvg.someMethod().toString());
		
		assertEquals(expected,tempOp,1e-8);	
	}
	
	@Test
	public void testSomeMethod_run(){
		assertNotNull(RecordCovPop.someMethod());
	}
}
