package date;

import java.text.SimpleDateFormat;
/*import java.time.*;*/
import java.util.Calendar;

public class GenerareDataOra {
//	private String dataOra;
//	private String data;

	/*
	 private GenerareDataOra() { // genereaza data si ora super(); this.dataOra =
	 new SimpleDateFormat("yyyy.MM.dd_HH:mm:ss").format(Calendar.getInstance().getTime()); 
	 this.data = new SimpleDateFormat("yyyy.MM.dd").format(Calendar.getInstance().getTime()); ; }

	 public static void main(String[] args) { // TODO Auto-generated method stub
	 GenerareDataOra dataOra = new GenerareDataOra(); 
	 // System.out.println(dataOra.data); 
	 // System.out.println(dataOra.dataOra); 
	 }
	 */
	
	public static String getDataOra() {
		return new SimpleDateFormat("yyyy.MM.dd_HH:mm:ss").format(Calendar.getInstance().getTime());
	}
	
	public static String getData() {
		return new SimpleDateFormat("yyyy.MM.dd").format(Calendar.getInstance().getTime());
	}

}
