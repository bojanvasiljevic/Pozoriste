package pozoriste;

import java.util.ArrayList;

public class Pozoriste {

	private static int ID = 1;

	private String ime;
	private int idPozorista;
	private ArrayList<String> listaZaposlenih;
	private ArrayList<String> spisakPredstava;

	public Pozoriste(String ime) {
		this.ime = ime;
		idPozorista = ID;
		listaZaposlenih = new ArrayList<String>();
		spisakPredstava = new ArrayList<String>();
		ID++;
	}

	public static int getID() {
		return ID;
	}

	public int getIdPozorista() {
		return idPozorista;
	}

	public String getIme() {
		return ime;
	}

	public ArrayList<String> getListaZaposlenih() {
		return listaZaposlenih;
	}

	public void ispisiListuZaposlenih() {
		System.out.println("Spisak zaposlenih u " + this.ime + " je: " + getListaZaposlenih());
	}

	public void addPredstava(String predstava) {
		spisakPredstava.add(predstava);
	}

	public ArrayList<String> getSpisakPredstava() {
		return spisakPredstava;
	}

	public void ispisiSpisakPredstava() {
		System.out.println("Spisak predtsva u " + this.ime + " je: " + getSpisakPredstava());
	}

	public void addZaposleni(String zaposleni) {
		listaZaposlenih.add(zaposleni);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.ime).append("[id:").append(idPozorista).append("]");

		return sb.toString();
	}

}
