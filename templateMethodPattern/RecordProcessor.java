package design.patterns.templateMethodPattern;

public abstract class RecordProcessor {
	
	//This an algorithm or algorithm steps
	public void ReadProcessSaveData() {
		readData();
		processData();
		saveData();
	}
	
	public abstract void readData();
	
	public abstract void processData();
	
	public void saveData() {
		System.out.println("Save data to DB");
	}
}
