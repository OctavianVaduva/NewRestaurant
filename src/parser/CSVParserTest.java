package parser;

import java.io.File;

public class CSVParserTest extends CSVParser{
	
    public CSVParserTest(File src) {
        super(src);
        // TODO Auto-generated constructor stub
    }
    public static void main(String[] args) {
        File sursa = new File ("c:\\Meniu\\produse.csv");
        CSVParserTest test = new CSVParserTest(sursa);
        //test.src = sursa;
        test.parse();
    }
    @Override
    protected void getTokensFromLine(String[] argumente) {
        for (int i=0;i<argumente.length;i++) {
            System.out.print(argumente[i]);
        }
        System.out.println("");
    }
}
