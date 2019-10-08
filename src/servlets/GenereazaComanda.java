package servlets;

import configurare.ConfigurareTableta;
import configurare.GenerareDataOra;

public class GenereazaComanda {
/*are rolul de a completa o inregistrare specifica deschiderii unei comenzi
 * si urmarire a inchiderii acesteia*/
	private Integer idComanda;
	private Integer idMasa;
	/* private LocalDateTime dataComanda; */
	private String dataComanda;
	private Double valoareComanda;
	private Double incasat;
	/* private LocalDateTime dataIncasare; */
	private String dataIncasare;

	public GenereazaComanda(Integer idComanda, Integer idMasa) {
		super();
		this.idComanda = idComanda; // de vazut cum ilfacem incremental
		this.idMasa = ConfigurareTableta.getIdMasa();
		this.dataComanda = GenerareDataOra.getDataOra();
		this.valoareComanda = null;
		this.incasat = null;
		this.dataIncasare = null;
	}
	
	public Integer getIdComanda() {
		return idComanda;
	}


	public void setIdComanda(Integer idComanda) {
		this.idComanda = idComanda;
	}

	public Integer getIdMasa() {
		return idMasa;
	}

	public void setIdMasa(Integer idMasa) {
		this.idMasa = idMasa;
	}

	public String getDataComanda() {
		return dataComanda;
	}

	public void setDataComanda(String dataComanda) {
		this.dataComanda = dataComanda;
	}

	public Double getValoareComanda() {
		return valoareComanda;
	}

	public void setValoareComanda(Double valoareComanda) {
		this.valoareComanda = valoareComanda;
	}

	public Double getIncasat() {
		return incasat;
	}

	public void setIncasat(Double incasat) {
		this.incasat = incasat;
	}

	public String getDataIncasare() {
		return dataIncasare;
	}

	public void setDataIncasare(String dataIncasare) {
		this.dataIncasare = dataIncasare;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
