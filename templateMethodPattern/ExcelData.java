package design.patterns.templateMethodPattern;

public class ExcelData extends RecordProcessor{

	@Override
	public void readData() {
		System.out.println("Read Excel data!");
		
	}

	@Override
	public void processData() {
		System.out.println("Process Excel Data!");
		
	}

}
