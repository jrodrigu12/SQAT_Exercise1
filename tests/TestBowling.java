import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
		Frame frameOne = new Frame(5, 2);
		int score= frameOne.score();
//		assertEquals("", 7, score);
		Frame frameTwo = new Frame(5, 2);
		
		BowlingGame gameOne = new BowlingGame();
		gameOne.addFrame(frameOne);
		gameOne.addFrame(frameTwo);
		
		
		int scoreGame = gameOne.score();
		assertEquals("", 14, scoreGame);
		
		 
	}

}
