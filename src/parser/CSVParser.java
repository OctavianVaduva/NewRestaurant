package parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class CSVParser {
    File file;
    public CSVParser(File file) {
        super();
        this.file = file;
    }
protected abstract void getTokensFromLine(String[] tokens);
    
public void parse() {
       BufferedReader br = null;
       String line = "";
       try {
           br = new BufferedReader(new FileReader(file));
           while ((line = br.readLine()) != null) {
               // use comma as separator
               String[] tokens = line.split("&&");
//               System.out.println(tokens[0] + " " + tokens[1] + " " + tokens[2] + " " + tokens[3] + " " + tokens[4] + " " + tokens[5] + " " + tokens[6] + " " + tokens[7]);
               getTokensFromLine(tokens);
           }
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       } finally {
           if (br != null) {
               try {
                   br.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }
    }
}
