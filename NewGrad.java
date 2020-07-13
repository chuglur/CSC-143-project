package CSC143ClassProject;

public class NewGrad {
	
	// These are not FINAL attributes -- they may change
	// as the team working on this class makes design decisions.
	private String name;
	private String gender;
	private int motivationLevel;
	private int moodNumber;
	
	// Need some constructors
	// Do we want a "no argument" default constructor?
	// Should there be some "neutral" values for motivation and mood to start?
	public NewGrad() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMotivationLevel() {
		return motivationLevel;
	}
	public void setMotivationLevel(int motivationLevel) {
		this.motivationLevel = motivationLevel;
	}
	public int getMoodNumber() {
		return moodNumber;
	}
	public void setMoodNumber(int moodNumber) {
		this.moodNumber = moodNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}


}
