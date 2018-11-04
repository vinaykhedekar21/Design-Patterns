package design.patterns.templateMethodPattern;

public class TextData extends RecordProcessor {

	@Override
	public void readData() {
		System.out.println("Read Text data!");
		
	}

	@Override
	public void processData() {
		System.out.println("Process Text Data!");
		
	}

}
