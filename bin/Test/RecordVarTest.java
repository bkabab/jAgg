import static org.junit.Assert.*;

import org.junit.Test;


public class RecordVarTest {
	@Test
	public void testSomeMethod_true() {
		double expected = 1.0;
		
		 String tempInt = RecordVar.someMethod().toString();
		 double tempOp = Double.parseDouble(tempInt);
		
		// int tempInt = Integer.parseInt(RecordAvg.someMethod().toString());
		
		assertEquals(expected,tempOp,1e-8);	
	}
	
	@Test
	public void testSomeMethod_false() {
		double expected = 2.0;
		
		 String tempInt = RecordVar.someMethod().toString();
		 double tempOp = Double.parseDouble(tempInt);
		
		// int tempInt = Integer.parseInt(RecordAvg.someMethod().toString());
		
		assertEquals(expected,tempOp,1e-8);	
	}
	
	@Test
	public void testSomeMethod_run(){
		assertNotNull(RecordVar.someMethod());
	}
}