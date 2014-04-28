import static org.junit.Assert.*;

import org.junit.Test;


public class RecordConcatTest {


	@Test
	public void testSomeMethod_false() {
		double expected = 1.2;
		
		 String tempInt = RecordConcat.someMethod().toString();
		 double tempOp = Double.parseDouble(tempInt);
		
		// int tempInt = Integer.parseInt(RecordAvg.someMethod().toString());
		
		assertEquals(expected,tempOp,1e-8);	
	}
	
	@Test
	public void testSomeMethod_run(){
		assertNotNull(RecordConcat.someMethod());
	}
	
}
