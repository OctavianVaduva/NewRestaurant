package date;

public class ProdusCSV {
	
	public String idCategorie;
	public String idProdus;
    public String numeProdus;
    public String descriereProdus;
    public String pretUnitar;
    public String poza;
    public String nrPortii;
    public String stoc;
    
	public ProdusCSV(String idCategorie, String idProdus, String numeProdus, String descriereProdus, String pretUnitar,
			String poza, String nrPortii, String stoc) {
		super();
		this.idCategorie = idCategorie;
		this.idProdus = idProdus;
		this.numeProdus = numeProdus;
		this.descriereProdus = descriereProdus;
		this.pretUnitar = pretUnitar;
		this.poza = poza;
		this.nrPortii = nrPortii;
		this.stoc = stoc;
	}

	public String getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(String idCategorie) {
		this.idCategorie = idCategorie;
	}
	public String getIdProdus() {
		return idProdus;
	}
	public void setIdProdus(String idProdus) {
		this.idProdus = idProdus;
	}

	public String getNumeProdus() {
		return numeProdus;
	}
	public void setNumeProdus(String numeProdus) {
		this.numeProdus = numeProdus;
	}

	public String getDescriereProdus() {
		return descriereProdus;
	}
	public void setDescriereProdus(String descriereProdus) {
		this.descriereProdus = descriereProdus;
	}

	public String getPretUnitar() {
		return pretUnitar;
	}
	public void setPretUnitar(String pretUnitar) {
		this.pretUnitar = pretUnitar;
	}

	public String getPoza() {
		return poza;
	}
	public void setPoza(String poza) {
		this.poza = poza;
	}

	public String getNrPortii() {
		return nrPortii;
	}
	public void setNrPortii(String nrPortii) {
		this.nrPortii = nrPortii;
	}
	
	public String getStoc() {
		return stoc;
	}
	public void setStoc(String stoc) {
		this.stoc = stoc;
	}

}