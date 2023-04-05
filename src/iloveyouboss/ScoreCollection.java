package iloveyouboss;

import java.util.ArrayList;
import java.util.List;

public class ScoreCollection {
	private List<Scorable> scorables = new ArrayList<>();
	
	public void add(Scorable scorable) {
		scorables.add(scorable);
	}
	
	public int arithmeticMedian() {
		int total = scorables.stream().mapToInt(Scorable::getScore).sum();
		return total / scorables.size();
	}
}
