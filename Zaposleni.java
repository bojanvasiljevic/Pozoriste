package pozoriste;

public class Zaposleni {

	private String imePreime;
	private Pozoriste pozoriste;

	public Zaposleni(String imePrezime, Pozoriste pozoriste) {
		this.imePreime = imePrezime;
		this.pozoriste = pozoriste;
		this.pozoriste.addZaposleni(imePrezime);

	}

	public String getImePrezime() {
		return imePreime;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(imePreime).append("[").append(pozoriste.getIme()).append("]");
		return sb.toString();
	}
}
