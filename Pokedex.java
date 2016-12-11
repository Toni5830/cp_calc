public class Pokedex {
	public int[][] pokedex;
	private Nomi kantoNames;
  
	public Pokedex() {
		kantoNames = new Nomi();
		pokedex = new int[][] {{1, 118, 118, 90}, {2, 151, 151, 120}, {3, 198, 198, 160},
			{4, 116, 96, 78}, {5, 158, 129, 116}, {6, 223, 176, 156},
			{7, 88, 94, 88}, {8, 126 ,155, 118}, {9, 171, 210, 158},
			{10, 55, 62, 90}, {11, 45, 94, 100}, {12, 167, 151, 120},
			{13, 63, 55, 80}, {14, 46, 86, 90}, {15, 169, 150, 130},
			{16, 85, 76, 80}, {17, 117, 108, 126}, {18, 166, 157, 166}, //pidgey
			{19, 103, 70, 60}, {20, 161, 144, 110},
			{21, 112, 61, 80}, {22, 182, 135, 130},
			{23, 110, 102, 70}, {24, 167, 158, 120},
			{25, 112, 101, 70}, {26, 193, 165, 120}, //pika
			{27, 126, 145, 100}, {28, 182, 202, 150},
			{29, 86, 94, 110}, {30, 117, 126, 140}, {31, 180, 174, 180}, //nido
			{32, 105, 76, 92}, {33, 137, 112, 122}, {34, 204, 157, 162},
			{35, 107, 116, 140}, {36, 178, 171, 190}, // clefa
			{37, 96, 122, 76}, {38, 169, 204, 146},
			{39, 80, 44, 230}, {40, 156, 93, 280},
			{41, 83, 76, 80}, {42, 161, 153, 150},
			{43, 131, 116, 90}, {44, 153, 139, 120}, {45, 202, 170, 150}, //oddish
			{46, 121, 99, 70}, {47, 165, 146, 120},
			{48, 100, 102, 120}, {49, 179, 150, 140},
			{50, 109, 88, 20}, {51, 167, 147, 70},
			{52, 92, 81, 80}, {53, 150, 139, 130},  // persian
			{54, 122, 96, 100}, {55, 191, 163, 160},
			{56, 148, 87, 80}, {57, 207, 144, 130},
			{58, 136, 96, 110}, {59, 227, 166, 180}, //growlithe
			{60, 101, 82, 80}, {61, 130, 130, 130}, {62, 182, 187, 180}, // poli
			{63, 195, 103, 50}, {64, 232, 138, 80}, {65, 271, 194, 110}, // abra
			{66, 137, 88, 140}, {67, 177, 130, 160}, {68, 234, 162, 180},
			{69, 139, 64, 100}, {70, 172, 95, 130}, {71, 207, 138, 160},
			{72, 97, 182, 80}, {73, 166, 237, 160}, //tentacool
			{74, 132, 163, 80}, {75, 164, 196, 110}, {76, 211, 229, 160},
			{77, 170, 132, 100}, {78, 207, 167, 130},
			{79, 109, 109, 180}, {80, 177, 194, 190},
			{81, 165, 128, 50}, {82, 223, 182, 100},
			{83, 124, 118, 104}, //Farfetch'd
			{84, 158, 88, 70}, {85, 218, 145, 120},
			{86, 85, 128, 130}, {87, 139, 184, 180}, //seel
			{88, 135, 90, 160}, {89, 190, 184, 210},
			{90, 116, 168, 60}, {91, 186, 323, 100},
			{92, 186, 70, 60}, {93, 223, 112, 90}, {94, 261, 156, 120}, //gengar
			{95, 85, 288, 70},
			{96, 89, 158, 120}, {97, 144, 215, 170},
			{98, 181, 156, 60}, {99, 240, 214, 110},
			{100, 109, 114, 80}, {101, 173, 179, 120}, //voltorb
			{102, 107, 140, 120}, {103, 233, 158, 190},
			{104, 90, 165, 100}, {105, 144, 200, 120},
			{106, 224, 211, 100}, {107, 193, 212, 100}, //hitmon
			{108, 108, 137, 180},
			{109, 119, 164, 80}, {110, 174, 221, 130},
			{111, 140, 157, 160}, {112, 222, 206, 210},
			{113, 60, 176, 500}, //chansey
			{114, 183, 205, 140},
			{115, 181, 165, 210},
			{116, 129, 125, 60}, {117, 187, 182, 110}, //horsea
			{118, 123, 115, 90}, {119, 175, 154, 160},
			{120, 137, 112, 60}, {121, 210, 184, 120},
			{122, 192, 233, 80}, //mr mime
			{123, 218, 170, 140},
			{124, 223, 182, 130},
			{125, 198, 173, 130},
			{126, 206, 169, 130}, //magmar
			{127, 238, 197, 130},
			{128, 198, 197, 150},
			{129, 29, 102, 40}, {130, 237, 197, 190}, //gyarados
			{131, 186, 190, 260},
			/*
			{132, 110, 110, 96},
			{133, 114, 128, 110}, {134, 186, 168, 260}, {135, 192, 174, 130}, {136, 238, 178, 130}, //eevee
			{137, 156, 158, 130},
			{138, 132, 160, 70}, {139, 180, 202, 140}, //oman
			{140, 148, 142, 60}, {141, 190, 190, 120},
			{142, 182, 162, 160},
			{143, 180, 180, 320}, //snorlax
			{144, 198, 242, 180}, {145, 232, 194, 180}, {146, 242, 194, 180},
			{147, 128, 110, 82}, {148, 170, 152, 122}, {149, 250, 212, 182},
			{150, 284, 202, 212}, {151, 220, 220, 200}
			*/
		};
	}

	public Pokedex(int[][] anArray) {
		pokedex = anArray;
	}

	public int getAttack(int numero) {
		int attack = pokedex[numero][1];
		return attack;
	}

	public int getDefense(int numero) {
		int defense = pokedex[numero][2];
		return defense;
	}

	public int getStamina(int numero) {
		int stamina = pokedex[numero][3];
		return stamina;
	}

	private static int maggiore(Pokedex poked, int cheOrdin) {
		int higher = 0;
		int position = 0;
		int segnalino = 0;
		if (cheOrdin > 3)
		{
			segnalino = 1;
			cheOrdin = 1;
		}
		for (int i = 0; i < poked.pokedex.length; i++) {
			int sum = poked.pokedex[i][cheOrdin] + poked.pokedex[i][cheOrdin + segnalino] + poked.pokedex[i][cheOrdin + 2*segnalino];
			if (segnalino == 0)
			{ sum = sum/3; }
			if (sum > higher) {
				higher = sum;
				position = i;  // i = numero pokedex -1
			}
		}
		return position;
	}

	public static Pokedex ordina(Pokedex disordinato, int cheOrdin) {
		int[][] ordinato = new int[disordinato.pokedex.length][disordinato.pokedex[0].length];
		Pokedex tmp = new Pokedex();
		
		for (int i = 0; i < disordinato.pokedex.length; i++) {
			int pos = maggiore(tmp, cheOrdin);
			ordinato[i] = disordinato.pokedex[pos];
			tmp.pokedex[pos][1] = 0;
			tmp.pokedex[pos][2] = 0;
			tmp.pokedex[pos][3] = 0;
		}

		Pokedex ordinatoP = new Pokedex(ordinato);
		return ordinatoP;
	}

	public String aggiungiSpazi(int n) {
		String spazi = "";
		for (int i = 1; i <= n; i++)
			spazi = spazi + " ";
		return spazi;
	}

	public String getStats() {
		String finale = "Pokemon: \n";
		String inizio = "#    Nome ";

		int longer = Nomi.longer(); // lunghezza nome pkm + 5 (numero e " ")

		inizio = inizio + aggiungiSpazi(longer - 8 + 2); // 8 = "#   Nome".length() e 2 spazi per staccare nome e stats 
		inizio = inizio + "Att  Def  Stm   TOT";
		finale = inizio + aggiungiSpazi(8) + inizio + aggiungiSpazi(8) + inizio + "\n";

		for (int i = 0; i < pokedex.length; i++) {
			int sum = pokedex[i][1] + pokedex[i][2] + pokedex[i][3];

			int x = 0;
			if (pokedex[i][0]>=100)
				x = 1;
			else if (pokedex[i][0]>=10)
				x = 2;
			else
				x = 3;
			finale = finale + pokedex[i][0] + aggiungiSpazi(x + 1) + Nomi.getNome(pokedex[i][0]) + " ";

			String s = "  ";
			String u = "   ";
			String t = "  ";
			if (pokedex[i][1] < 100)
				s = "   ";
			if (pokedex[i][2] < 100)
				t = "   ";
			if (pokedex[i][3] < 100)
				u = "    ";

			finale = finale + aggiungiSpazi(2 + (longer - 4 - Nomi.getNome(pokedex[i][0]).length()))
				+ pokedex[i][1] + s + pokedex[i][2] + t + pokedex[i][3] + u + sum;

			if ((i+1)%3 == 0)
				finale = finale + "\n";
			else
				finale = finale + "        ";
		}
		return finale;
	}
}