package writer;

import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {
	String dest = "C:\\meniu\\test.csv";

	 public void writeLinesToFile(String[] lines) {
	        try {
	           FileWriter writer = new FileWriter(dest);
	           for (int i=0; i<lines.length;i++) {
	           writer.write(lines[i]);
	           writer.write("\r\n");   // write new line
	           //writer.write("Good Bye!");
	           }
	           //writer.write("\r\n");   // write new line
	           //writer.write("Good Bye!");
	           writer.close();
	       } catch (IOException e) {
	           e.printStackTrace();
	       }
	    }

}
