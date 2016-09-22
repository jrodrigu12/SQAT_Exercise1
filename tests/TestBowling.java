import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
		Frame frameOne = new Frame(5, 2);
		int score= frameOne.score();
		assertEquals("", 7, score);
		
		
		 
	}

}
