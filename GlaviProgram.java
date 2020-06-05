package pozoriste;

public class GlaviProgram {

	public static void main(String[] args) {

		Pozoriste atelje212 = new Pozoriste("Atelje 212");
		Pozoriste jdp = new Pozoriste("Jugoslovensko Dramsko Pozoriste");
		Pozoriste narodno = new Pozoriste("Narodno pozoriste");

		Zaposleni cistac = new Zaposleni("Pera Peric", atelje212);
		Zaposleni blagajnik = new Zaposleni("Zika Zikic", narodno);

		Glumac draganBjelogrlic = new Glumac("Dragan Bjelogrlic", jdp, "Kure");
		Glumac zoranCvijanovic = new Glumac("Zoran Cvijanovic", narodno, "Bg skola trgovine");
		Glumac nikolaKojo = new Glumac("Nikola Kojo", atelje212, "Niki");

		Reditelj goranPaskaljevic = new Reditelj("Goran Paskaljevic", jdp, "Gox");
		Reditelj srdjanDragojevic = new Reditelj("Srdjan Dragojevic", narodno, "Srki");

//		Predstava hamlet = new Predstava("Hamlet", jdp);
//		hamlet.addZposleni(cistac);
//		hamlet.addZposleni(draganBjelogrlic);
//		hamlet.addZposleni(nikolaKojo);
//		hamlet.addZposleni(srdjanDragojevic);
		System.out.println(jdp.getListaZaposlenih());
		
		
		
		
		
		

	}

}
