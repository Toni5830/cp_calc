public class Pokedex {
	public int[][] pokedex;
	private Nomi kantoNames;
  
	public Pokedex() {
		kantoNames = new Nomi();
		pokedex = new int[][] {{1, 126, 126, 90}, {2, 156, 158, 120}, {3, 198, 200, 160},
			{4, 128, 108, 78}, {5, 160, 140, 116}, {6, 212, 182, 156},
			{7, 112, 142, 88}, {8, 144 ,176, 118}, {9, 186, 222, 158},
			{10, 62, 66, 90}, {11, 56, 86, 100}, {12, 144, 144, 120},
			{13, 68, 64, 80}, {14, 62, 82, 80}, {15, 144, 130, 130},
			{16, 94, 90, 80}, {17, 126, 122, 126}, {18, 170, 166, 166}, //pidgey
			{19, 92, 86, 60}, {20, 146, 150, 110},
			{21, 102, 78, 80}, {22, 168, 146, 130},
			{23, 112, 112, 70}, {24, 166, 166, 120},
			{25, 124, 108, 70}, {26, 200, 154, 120}, //pika
			{27, 90, 114, 100}, {28, 150, 172, 150},
			{29, 100, 104, 110}, {30, 132, 136, 140}, {31, 184, 190, 180}, //nido
			{32, 110, 94, 92}, {33, 142, 128, 122}, {34, 204, 170, 162},
			{35, 116, 124, 140}, {36, 178, 178, 190}, // clefa
			{37, 106, 118, 76}, {38, 176, 194, 146},
			{39, 98, 54, 230}, {40, 168, 108, 280},
			{41, 88, 90, 80}, {42, 164, 164, 150},
			{43, 134, 130, 90}, {44, 162, 158, 120}, {45, 202, 190, 150}, //oddish
			{46, 122, 120, 70}, {47, 162, 170, 120},
			{48, 108, 118, 120}, {49, 172, 154, 140},
			{50, 108, 86, 20}, {51, 148, 140, 70},
			{52, 104, 94, 80}, {53, 156, 146, 130},  // persian
			{54, 132, 112, 100}, {55, 194, 176, 160},
			{56, 122, 96, 80}, {57, 178, 150, 130},
			{58, 156, 110, 110}, {59, 230, 180, 180}, //growlithe
			{60, 108, 98, 80}, {61, 132, 132, 130}, {62, 180, 202, 180}, // poli
			{63, 110, 76, 50}, {64, 150, 112, 80}, {65, 186, 152, 110}, // abra
			{66, 118, 96, 140}, {67, 154, 144, 160}, {68, 198, 180, 180},
			{69, 158, 78, 100}, {70, 190, 110, 130}, {71, 222, 152, 160},
			{72, 106, 136, 80}, {73, 170, 196, 160}, //tentacool
			{74, 106, 118, 80}, {75, 142, 156, 110}, {76, 176, 198, 160},
			{77, 168, 138, 100}, {78, 200, 170, 130},
			{79, 110, 110, 180}, {80, 184, 198, 190},
			{81, 128, 138, 50}, {82, 186, 180, 100},
			{83, 138, 132, 104}, //Farfetch'd
			{84, 126, 96, 70}, {85, 182, 150, 120},
			{86, 104, 138, 130}, {87, 156, 192, 180},
			{88, 124, 110, 160}, {89, 180, 188, 210},
			{90, 120, 112, 60}, {91, 196, 196, 100},
			{92, 136, 82, 60}, {93, 172, 118, 90}, {94, 204, 156, 120}, //gengar
			{95, 90, 186, 60},
			{96, 104, 140, 120}, {97, 162, 196, 170},
			{98, 116, 110, 60}, {99, 178, 168, 110},
			{100, 102, 124, 80}, {101, 150, 174, 120}, //voltorb
			{102, 110, 132, 120}, {103, 232, 164, 190},
			{104, 102, 150, 100}, {105, 140, 202, 120},
			{106, 148, 172, 100}, {107, 138, 204, 100}, //hitmon
			{108, 126, 160, 180},
			{109, 136, 142, 80}, {110, 190, 198, 130},
			{111, 110, 116, 160}, {112, 166, 160, 210},
			{113, 40, 60, 500}, //chansey
			{114, 164, 152, 140},
			{115, 142, 178, 210},
			{116, 122, 100, 60}, {117, 176, 150, 110}, //horsea
			{118, 112, 126, 90}, {119, 172, 160, 160},
			{120, 130, 128, 60}, {121, 194, 192, 120},
			{122, 154, 196, 80}, //mr mime
			{123, 176, 180, 140},
			{124, 172, 134, 130},
			{125, 198, 160, 130},
			{126, 214, 158, 130}, //magmar
			{127, 184, 186, 130},
			{128, 148, 184, 150},
			{129, 42, 84, 40}, {130, 192, 196, 190}, //gyarados
			{131, 186, 190, 260},
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

	private static int maggiore(Pokedex poked) {
		int higher = 0;
		int position = 0;
		for (int i = 0; i < poked.pokedex.length; i++) {
			int sum = poked.pokedex[i][1] + poked.pokedex[i][2] + poked.pokedex[i][3];
			if (sum > higher) {
				higher = sum;
				position = i;  // i = numero pokedex -1
			}
		}
		return position;
	}

	public static Pokedex ordina(Pokedex disordinato) {
		int[][] ordinato = new int[disordinato.pokedex.length][disordinato.pokedex[0].length];
		Pokedex tmp = new Pokedex();
		
		for (int i = 0; i < disordinato.pokedex.length; i++) {
			int pos = maggiore(tmp);
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
		String inizio = "#   Nome";

		int longer = Nomi.longer(); // lunghezza nome pkm + 5 (numero e " ")

		inizio = inizio + aggiungiSpazi(longer - 8 + 2); // 8 = "#   Nome".length() e 2 spazi per staccare nome e stats 
		inizio = inizio + "Att  Def  Stm   TOT";
		finale = inizio + aggiungiSpazi(6) + inizio + aggiungiSpazi(6) + inizio + "\n";

		for (int i = 0; i < pokedex.length; i++) {
			int sum = pokedex[i][1] + pokedex[i][2] + pokedex[i][3];

			int x = 0;
			if (pokedex[i][0]>=100)
				x = 1;
			else if (pokedex[i][0]>=10)
				x = 2;
			else
				x = 3;
			finale = finale + pokedex[i][0] + aggiungiSpazi(x) + Nomi.getNome(pokedex[i][0]);

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
				finale = finale + "      ";
		}
		return finale;
	}
}