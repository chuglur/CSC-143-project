package CSC143ClassProject;

// Activities could have Emotions associated with them
public class Emotion {
	private String name;
	private int value;
	
	public Emotion() {
		this.name = "neutral";
		this.value = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

}
