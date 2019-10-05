package writer;

public class CSVWriterTest {

	public static void main(String[] args) {
	     CSVWriter csvWriter = new CSVWriter();
	     String[] lines = {"lini,a,1", "li,ni,a2"};
	     csvWriter.writeLinesToFile(lines);
	}

}
