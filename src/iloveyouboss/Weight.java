package iloveyouboss;

public enum Weight {
	//@formatter:off
	MustMatch(Integer.MAX_VALUE),
	VeryImportant(5000),
	Important(1000),
	WouldPrefer(100),
	DontCare(0);
	// @formatter:on
	private int value;

	Weight(int value) {
		this.value = value;
	}

	int getValue() {
		return value;
	}
}
