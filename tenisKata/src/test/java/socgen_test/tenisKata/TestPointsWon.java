package socgen_test.tenisKata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


import org.junit.Before;
import org.junit.Test;

public class TestPointsWon {
	
	Points point ;
	
	@Before
	public void setUp() {
		point = new Points();
	}

	  @Test  
	    public void testPointsNoDuece(){  
	        assertEquals("0",point.pointsNoDuece(0));  
	        assertEquals("15",point.pointsNoDuece(1)); 
	        assertEquals("30",point.pointsNoDuece(2)); 
	        assertEquals("40",point.pointsNoDuece(3));
	        assertEquals(Constants.WIN,point.pointsNoDuece(4));	        
	        assertNotEquals(40,point.pointsNoDuece(3));
	    } 

}
