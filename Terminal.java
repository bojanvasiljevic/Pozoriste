package pozoriste;

import java.util.Scanner;

public class Terminal {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		boolean stop = true;
		String end = "";

		while (stop) {
			System.out.println("Unestite -->STOP<--, ili pritisnite bilo koje dugme za nastavak");
			end = s.next();
			if (end.equalsIgnoreCase("stop")) {
				stop = false;
				break;
			}
			
			//String options = s.next();

			System.out.print("Unesite ime pozorista: ");
			String name = s.next();
			Pozoriste prvo = new Pozoriste(name);
			System.out.println("Dodajte zaposlenog");
			String empName= s.next();
			Zaposleni zap = new Zaposleni(empName, prvo);
			Zaposleni dap = new Zaposleni("hshshsh", prvo);
			
			System.out.println(prvo.getListaZaposlenih());
		}
		

	}

}
