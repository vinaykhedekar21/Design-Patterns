package design.patterns.templateMethodPattern;

/** Subclasses decide how to implement the steps in an algorithm
 * This is an Example of implementation of abstract classes and methods*/

public class TestTemplateMethodPattern {

	public static void main(String[] args) {
		
		RecordProcessor rp = new ExcelData();
		rp.ReadProcessSaveData();
		
		RecordProcessor rp1 = new TextData();
		rp1.ReadProcessSaveData();
	}
}
