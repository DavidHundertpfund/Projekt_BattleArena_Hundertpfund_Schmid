package arena;

import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends Charakter{
	
	public int randompoints() {
	ThreadLocalRandom.current().nextInt(20, 25+1);
		
	}
	
}
