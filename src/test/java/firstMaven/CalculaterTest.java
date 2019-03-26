package firstMaven;

import static org.junit.Assert.*;

import org.junit.Test;

import firstMaven2.Package2;

public class CalculaterTest {
	
	@Test
	public void testSum() {
		//fail("Not yet implemented");
		Calculater testObject = new Calculater();
		Package2 testObject2 = new Package2();
		int exRe = 11;
		int re = testObject.sum(5,6);
		assertEquals(exRe,re);
		assertEquals(15,testObject.sum(5,10));
		assertEquals(50,testObject2.cheng(5,10));
	}
	@Test
	public void testDiv() {
		//fail("Not yet implemented");
		Calculater testObject = new Calculater();
		assertEquals(5, testObject.div(10, 2));
	}
	
	@Test
	public void testMulti() {
		//fail("Not yet implemented");
		Calculater testObject = new Calculater();
		//int re = testObject.multi(5,6);
		//assertEquals(30,testObject.multi(5,6));
		assertEquals(50,testObject.multi(5,10));
	}
	
	

}
