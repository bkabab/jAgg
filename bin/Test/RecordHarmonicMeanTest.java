import static org.junit.Assert.*;

import org.junit.Test;


public class RecordHarmonicMeanTest {
	@Test
	public void testSomeMethod_true() {
		double expected = 1.6363636363636365;
		
		 String tempInt = RecordHarmonicMean.someMethod().toString();
		 double tempOp = Double.parseDouble(tempInt);
		
		// int tempInt = Integer.parseInt(RecordAvg.someMethod().toString());
		
		assertEquals(expected,tempOp,1e-8);	
	}
	
	@Test
	public void testSomeMethod_false() {
		double expected = 2.2322;
		
		 String tempInt = RecordHarmonicMean.someMethod().toString();
		 double tempOp = Double.parseDouble(tempInt);
		
		// int tempInt = Integer.parseInt(RecordAvg.someMethod().toString());
		
		assertEquals(expected,tempOp,1e-8);	
	}
	
	@Test
	public void testSomeMethod_run(){
		assertNotNull(RecordHarmonicMean.someMethod());
	}
}