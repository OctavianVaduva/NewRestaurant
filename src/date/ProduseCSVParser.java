package date;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import parser.CSVParser;

public class ProduseCSVParser extends CSVParser {
	
	List lista = new ArrayList<Produs>(); // cream o lista in care vom introduce produsele
	
	public List getLista() {
		return lista;
	}

	public ProduseCSVParser(File file) {
		super(file);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void getTokensFromLine(String[] tokens) {
		Produs produs = new Produs (tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5], tokens[6], tokens[7]);
		lista.add(produs);
	}

}
