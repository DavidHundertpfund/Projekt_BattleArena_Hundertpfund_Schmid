package arena;

import java.util.concurrent.ThreadLocalRandom;

public class Dragon extends Charakter{
	
	public int randompoints() {
		int i;
		i = ThreadLocalRandom.current().nextInt(20, 25+1);
		System.out.println(i);
		return i;
	}
	
}
