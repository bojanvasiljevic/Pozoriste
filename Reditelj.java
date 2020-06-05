package pozoriste;

public class Reditelj extends Zaposleni {

	private String nadimak;

	public Reditelj(String imePrezime, Pozoriste pozoriste, String nadimak) {
		super(imePrezime, pozoriste);
		this.nadimak = nadimak;
	}

	public String getNadimak() {
		return nadimak;
	}

	@Override
	public String toString() {
		return this.nadimak + "_" + getImePrezime() + "[" + getPozoriste().getIme() + "]";
	}

}
