package pozoriste;

import java.util.ArrayList;
import java.util.Arrays;

public class Predstava {

	private String imePredstave;
	private Pozoriste pozoriste;
	private ArrayList<Zaposleni> listaZaposlenih;

	public Predstava(String imePredstave, Pozoriste pozoriste) {
		this.imePredstave = imePredstave;
		this.pozoriste = pozoriste;
		listaZaposlenih = new ArrayList<Zaposleni>();
		this.pozoriste.addPredstava(imePredstave);

	}

	public String getImePredstave() {
		return imePredstave;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	public ArrayList<Zaposleni> getListaZaposlenih() {
		return listaZaposlenih;
	}

	public void addZposleni(Zaposleni zaposleni) {
		listaZaposlenih.add(zaposleni);
	}

	public void removeZposleni(Zaposleni zaposleni) {
		boolean provera = true;
		for (int i = 0; i < listaZaposlenih.size(); i++) {
			if (listaZaposlenih.get(i) == zaposleni) {
				listaZaposlenih.remove(zaposleni);
				provera = true;
				break;
			} else {
				provera = false;
			}
		}
		if (!provera) {
			System.out.println("Greska!!! " + zaposleni.getImePrezime() + " ne radi na ovoj prestavi!");
		}

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(imePredstave).append(pozoriste.getIme()).append("\n")
				.append(Arrays.toString(listaZaposlenih.toArray()));
		return sb.toString();
	}

}
