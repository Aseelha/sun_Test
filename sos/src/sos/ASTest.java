package sos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;








//import org.junit.BeforeClass;

//import static org.junit.Assert.*;
//import org.junit.BeforeClass;
//import org.junit.Test;
public class ASTest {
static product obj=new  product(null, 0, 0);


	@Test
 public void test1() {
	//Aseert.assertTrue(obj.getcount()==0);
		boolean x=(obj.getcount()==0);
	assertTrue(x);	
	}
	@Test
	public void test2() {
		int productj =1;
		int pricej=127;
		s obj =new s();
		product pr =new product("java",1,127);
		obj.add(pr);
		assertEquals(productj,s.getcount());
		assertEquals(pricej,s.getprice());
		
	}
@Test
	public void test3() {
		int productw =2;
		int pricew=481;
		s obj =new s();
		product pr =new product ("web",2,227);
		obj.add(pr);
		assertEquals(productw,s.getcount());
	assertEquals(pricew,s.getprice());
		
	}

}
