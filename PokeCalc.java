public class PokeCalc {
	private Pokedex myMon;
  
	public PokeCalc() {
		myMon = new Pokedex();
	}

	private double level2multiplier(int level) {
		double multiplier = 0;
		if (level == 1)
			multiplier = 0.094;
		else if (level == 2)
			multiplier = 0.16639787;
		else if (level == 3)
			multiplier = 0.21573247;
		else if (level == 4)
			multiplier = 0.25572005;
		else if (level == 5)
			multiplier = 0.29024988;
		else if (level == 6)
			multiplier = 0.3210876;
		else if (level == 7)
			multiplier = 0.34921268;
		else if (level == 8)
			multiplier = 0.37523559;
		else if (level == 9)
			multiplier = 0.39956728;
		else if (level == 10)
			multiplier = 0.42250001;
		else if (level == 11)
			multiplier = 0.44310755;
		else if (level == 12)
			multiplier = 0.46279839;
		else if (level == 13)
			multiplier = 0.48168495;
		else if (level == 14)
			multiplier = 0.49985844;
		else if (level == 15)
			multiplier = 0.51739395;
		else if (level == 16)
			multiplier = 0.53435433;
		else if (level == 17)
			multiplier = 0.55079269;
		else if (level == 18)
			multiplier = 0.56675452;
		else if (level == 19)
			multiplier = 0.58227891;
		else if (level == 20)
			multiplier = 0.59740001;
		else if (level == 21)
			multiplier = 0.61215729;
		else if (level == 22)
			multiplier = 0.62656713;
		else if (level == 23)
			multiplier = 0.64065295;
		else if (level == 24)
			multiplier = 0.65443563;
		else if (level == 25)
			multiplier = 0.667934;
		else if (level == 26)
			multiplier = 0.68116492;
		else if (level == 27)
			multiplier = 0.69414365;
		else if (level == 28)
			multiplier = 0.70688421;
		else if (level == 29)
			multiplier = 0.71939909;
		else if (level == 30)
			multiplier = 0.7317;
		else if (level == 31)
			multiplier = 0.73776948;
		else if (level == 32)
			multiplier = 0.74378943;
		else if (level == 33)
			multiplier = 0.74976104;
		else if (level == 34)
			multiplier = 0.75568551;
		else if (level == 35)
			multiplier = 0.76156384;
		else if (level == 36)
			multiplier = 0.76739717;
		else if (level == 37)
			multiplier = 0.7731865;
		else if (level == 38)
			multiplier = 0.77893275;
		else if (level == 39)
			multiplier = 0.78463697;
		else if (level == 40)
			multiplier = 0.79030001;
		return multiplier;
	}

	public int calcola(int numero, int livello, int ivA ,int ivD ,int ivS) {
		double cpMulti = level2multiplier(livello);
		double attacco = myMon.getAttack(numero);
		double difesa = myMon.getDefense(numero);
		double stamina = myMon.getStamina(numero);

		double cp = ((attacco + ivA) * Math.sqrt(difesa + ivD) * Math.sqrt(stamina + ivS) * cpMulti*cpMulti)/10;
		int cpInt = (int) cp;
		if (cpInt < 10)
			cpInt = 10;
		return cpInt;
	}

	public String maxCP(int level) {
		String finale = "Pokemon: \n";
		String inizio = "#    Nome";

		int longest = Nomi.longestName(); // lunghezza nome pkm + 3 cifre (numero e "  ")

		inizio = inizio + myMon.aggiungiSpazi(longest - 9 + 3); // 9 = "#    Nome".length() e 2 spazi per staccare nome e stats 
		inizio = inizio + "CP";
		finale = inizio + myMon.aggiungiSpazi(10) + inizio + myMon.aggiungiSpazi(10) + inizio + myMon.aggiungiSpazi(10) + inizio + "\n";

		for (int i = 0; i < myMon.pokedex.length; i++) {
			int x = 0;
			if (myMon.pokedex[i][0]>=100)
				x = 2;
			else if (myMon.pokedex[i][0]>=10)
				x = 3;
			else
				x = 4;
			finale = finale + myMon.pokedex[i][0] + myMon.aggiungiSpazi(x) + Nomi.getNome(myMon.pokedex[i][0]);

			int cp = calcola(i, level, 15, 15, 15);
			finale = finale + myMon.aggiungiSpazi(-2 + (longest - Nomi.getNome(myMon.pokedex[i][0]).length())) + cp;
			if (cp < 1000)
				finale = finale + " ";
			if (cp < 100)
				finale = finale + " ";

			if ((i+1)%4 == 0)
				finale = finale + "\n";
			else
				finale = finale + myMon.aggiungiSpazi(8);
		}
		return finale;
	}
}
