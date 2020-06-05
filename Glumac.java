package pozoriste;

public class Glumac extends Zaposleni {

	private String uloga;

	public Glumac(String imePrezime, Pozoriste pozoriste, String uloga) {
		super(imePrezime, pozoriste);
		this.uloga = uloga;
	}
	public String getUloga() {
		return uloga;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(this.uloga).append("_").append(getImePrezime()).append("[").append(getPozoriste().getIme())
				.append("]");
		return sb.toString();
	}

}
