public class Pokedex {
	public int[][] pokedex;
	private Nomi nationalNames;
  
	public Pokedex() {
		nationalNames = new Nomi();
		// {num, attack, defense, stamina}
		pokedex = new int[][] {
			{0, 118, 118,  90}, {0, 151, 151, 120}, {0, 198, 198, 160},		// bulba
			{0, 116,  96,  78}, {0, 158, 129, 116}, {0, 223, 176, 156},		// char
			{0,  88,  94,  88}, {0, 126, 155, 118}, {0, 171, 210, 158},		// turtle
			{0,  55,  62,  90}, {0,  45,  94, 100}, {0, 167, 151, 120},
			{0,  63,  55,  80}, {0,  46,  86,  90}, {0, 169, 150, 130},
			{0,  85,  76,  80}, {0, 117, 108, 126}, {0, 166, 157, 166},		// pidgey
			{0, 103,  70,  60}, {0, 161, 144, 110},
			{0, 112,  61,  80}, {0, 182, 135, 130},
			{0, 110, 102,  70}, {0, 167, 158, 120},
			{0, 112, 101,  70}, {0, 193, 165, 120},		// pika
			{0, 126, 145, 100}, {0, 182, 202, 150},
			{0,  86,  94, 110}, {0, 117, 126, 140}, {0, 180, 174, 180},		// nido
			{0, 105,  76,  92}, {0, 137, 112, 122}, {0, 204, 157, 162},
			{0, 107, 116, 140}, {0, 178, 171, 190},		//  clefa
			{0,  96, 122,  76}, {0, 169, 204, 146},
			{0,  80,  44, 230}, {0, 156,  93, 280},
			{0,  83,  76,  80}, {0, 161, 153, 150},
			{0, 131, 116,  90}, {0, 153, 139, 120}, {0, 202, 170, 150},		// oddish
			{0, 121,  99,  70}, {0, 165, 146, 120},
			{0, 100, 102, 120}, {0, 179, 150, 140},
			{0, 109,  88,  20}, {0, 167, 147,  70},
			{0,  92,  81,  80}, {0, 150, 139, 130}, 		//  persian
			{0, 122,  96, 100}, {0, 191, 163, 160},
			{0, 148,  87,  80}, {0, 207, 144, 130},
			{0, 136,  96, 110}, {0, 227, 166, 180},		// growlithe
			{0, 101,  82,  80}, {0, 130, 130, 130}, {0, 182, 187, 180},		//  poli
			{0, 195, 103,  50}, {0, 232, 138,  80}, {0, 271, 194, 110},		//  abra
			{0, 137,  88, 140}, {0, 177, 130, 160}, {0, 234, 162, 180},
			{0, 139,  64, 100}, {0, 172,  95, 130}, {0, 207, 138, 160},
			{0,  97, 182,  80}, {0, 166, 237, 160},		// tentacool
			{0, 132, 163,  80}, {0, 164, 196, 110}, {0, 211, 229, 160},
			{0, 170, 132, 100}, {0, 207, 167, 130},
			{0, 109, 109, 180}, {0, 177, 194, 190},
			{0, 165, 128,  50}, {0, 223, 182, 100},
			{0, 124, 118, 104},		// Farfetch'd
			{0, 158,  88,  70}, {0, 218, 145, 120},
			{0,  85, 128, 130}, {0, 139, 184, 180},		// seel
			{0, 135,  90, 160}, {0, 190, 184, 210},
			{0, 116, 168,  60}, {0, 186, 323, 100},
			{0, 186,  70,  60}, {0, 223, 112,  90}, {0, 261, 156, 120},		// gengar
			{0,  85, 288,  70},
			{0,  89, 158, 120}, {0, 144, 215, 170},
			{0, 181, 156,  60}, {0, 240, 214, 110},
			{0, 109, 114,  80}, {0, 173, 179, 120},		// voltorb
			{0, 107, 140, 120}, {0, 233, 158, 190},
			{0,  90, 165, 100}, {0, 144, 200, 120},
			{0, 224, 211, 100}, {0, 193, 212, 100},		// hitmon
			{0, 108, 137, 180},
			{0, 119, 164,  80}, {0, 174, 221, 130},
			{0, 140, 157, 160}, {0, 222, 206, 210},
			{0,  60, 176, 500},		// chansey
			{0, 183, 205, 140},
			{0, 181, 165, 210},
			{0, 129, 125,  60}, {0, 187, 182, 110},		// horsea
			{0, 123, 115,  90}, {0, 175, 154, 160},
			{0, 137, 112,  60}, {0, 210, 184, 120},
			{0, 192, 233,  80},		// mr mime
			{0, 218, 170, 140},
			{0, 223, 182, 130},
			{0, 198, 173, 130},
			{0, 206, 169, 130},		// magmar
			{0, 238, 197, 130},
			{0, 198, 197, 150},
			{0,  29, 102,  40}, {0, 237, 197, 190},		// gyarados
			{0, 165, 180, 260},
			{0,  91,  91,  96},
			// eevee
			{0, 104, 121, 110}, {0, 205, 177, 260}, {0, 232, 201, 130},
			{0, 246, 204, 130},
			{0, 153, 139, 130},
			{0, 155, 174,  70}, {0, 207, 227, 140},		// oman
			{0, 148, 162,  60}, {0, 220, 203, 120},
			{0, 221, 164, 160},
			{0, 190, 190, 320},		// snorlax
			{0, 192, 249, 180}, {0, 253, 188, 180}, {0, 251, 184, 180},
			{0, 119,  94,  82}, {0, 163, 138, 122}, {0, 263, 201, 182},
			{0, 330, 200, 212}, {0, 210, 210, 200},

			//  gen 2

			{0,  92, 122,  90}, {0, 122, 155, 120}, {0, 168, 202, 160},		// leaf
			{0, 116,  96,  78}, {0, 158, 129, 116}, {0, 223, 176, 156},		// lava
			{0, 117, 116, 100}, {0, 150, 151, 130}, {0, 205, 197, 170},		// croco
			{0,  79,  77,  70}, {0, 148, 130, 170},
			{0,  67, 101, 120}, {0, 145, 179, 200},		// owl
			{0,  72, 142,  80}, {0, 107, 209, 110},
			{0, 105,  73,  80}, {0, 161, 128, 140},
			{0, 194, 178, 170},		// crobat
			{0, 106, 106, 150}, {0, 146, 146, 250},
			{0,  77,  63,  40}, {0,  75,  91, 100}, {0,  69,  34, 180},		// baby
			{0,  67, 116,  70}, {0, 139, 191, 110},		// toge
			{0, 134,  89,  80}, {0, 192, 146, 130},
			{0, 114,  82, 110}, {0, 145, 112, 140}, {0, 211, 172, 180},		// mareep
			{0, 169, 189, 150},
			{0,  37,  93, 140}, {0, 112, 152, 200},		// marill
			{0, 167, 198, 140}, {0, 174, 192, 180},
			{0,  67, 101,  70}, {0,  91, 127, 110}, {0, 118, 197, 150},
			{0, 136, 112, 110},		// aipom
			{0,  55,  55,  60}, {0, 185, 148, 150},
			{0, 154,  94, 130},		// yanma
			{0,  75,  75, 110}, {0, 152, 152, 190},
			{0, 261, 194, 130}, {0, 126, 250, 190},		// espeon umbreon
			{0, 175,  87, 120},
			{0, 177, 194, 190},
			{0, 167, 167, 120},		// misdreavus
			{0, 136,  91,  96},
			{0,  60, 106, 380},
			{0, 182, 133, 140},
			{0, 108, 146, 100}, {0, 161, 242, 150},		// pineco
			{0, 131, 131, 200},
			{0, 143, 204, 130},
			{0, 148, 333, 150},
			{0, 137,  89, 120}, {0, 212, 137, 180},		// bull
			{0, 184, 148, 130},
			{0, 236, 191, 140},
			{0,  17, 396,  40},		// shuckle
			{0, 234, 189, 160},
			{0, 189, 157, 110},
			{0, 142,  93, 120}, {0, 236, 144, 180},		// ursa
			{0, 118,  71,  80}, {0, 139, 209, 100},
			{0,  90,  74, 100}, {0, 181, 147, 200},
			{0, 118, 156, 110},		// corsola
			{0, 127,  69,  70}, {0, 197, 141, 150},
			{0, 128,  90,  90},
			{0, 148, 260, 130},
			{0, 148, 260, 130},
			{0, 152,  93,  90}, {0, 224, 159, 150},		// hound
			{0, 194, 194, 150},
			{0, 107, 107, 180}, {0, 214, 214, 180},
			{0, 198, 183, 170},		// pory2
			{0, 192, 132, 146},
			{0,  40,  88, 110},
			{0,  64,  64,  70}, {0, 173, 214, 100},		// hitmontop
			{0, 153, 116,  90},
			{0, 135, 110,  90},
			{0, 151, 108,  90},
			{0, 157, 211, 190},	// miltank
			{0, 129, 229, 510},
			{0, 241, 210, 180}, {0, 235, 176, 230}, {0, 180, 235, 200},		// cani
			{0, 115,  93, 100}, {0, 155, 133, 140}, {0, 251, 212, 200},		// Tyranitar
			{0, 193, 323, 212}, {0, 263, 301, 212}, {0, 210, 210, 200},		// Lugia Ho-Oh Celebi

			// gen 3

			{0, 124, 104,  80}, {0, 172, 130, 100}, {0, 223, 180, 140},
			{0, 130,  92,  90}, {0, 163, 115, 120}, {0, 240, 141, 160},
			{0, 126,  93, 100}, {0, 156, 133, 140}, {0, 208, 175, 200},
			{0,  96,  63,  70}, {0, 171, 137, 140},
			{0,  58,  80,  76}, {0, 142, 128, 156},
			{0,  75,  61,  90}, {0,  60,  91, 100}, {0, 189,  98, 120},
			{0,  60,  91, 100}, {0,  98, 172, 120},
			{0,  71,  86,  80}, {0, 112, 128, 120}, {0, 173, 191, 160},
			{0,  71,  86,  80}, {0, 134,  78, 140}, {0, 200, 121, 180},
			{0, 106,  61,  80}, {0, 185, 130, 120},
			{0, 106,  61,  80}, {0, 175, 189, 120},
			{0,  79,  63,  56}, {0, 117, 100,  76}, {0, 237, 220, 136},
			{0,  93,  97,  80}, {0, 192, 161, 140},
			{0,  74, 110, 120}, {0, 241, 153, 120},
			{0, 104, 104, 120}, {0, 159, 159, 160}, {0, 290, 183, 273},
			{0,  80, 153,  62}, {0, 196, 114, 122}, {0, 153,  80,  10},
			{0,  92,  42, 128}, {0, 134,  81, 168}, {0, 179, 142, 208},
			{0,  99,  54, 144}, {0, 209, 114, 288},
			{0,  36,  71, 100}, {0,  82, 236,  60},
			{0,  84,  84, 100}, {0, 132, 132, 140},
			{0, 141, 141, 100}, {0, 155, 155, 100},
			{0, 121, 168, 100}, {0, 158, 240, 120}, {0, 198, 314, 140},
			{0,  78, 107,  60}, {0, 121, 152, 120},
			{0, 123,  78,  80}, {0, 215, 127, 140},
			{0, 167, 147, 120}, {0, 147, 167, 120},
			{0, 143, 171, 130}, {0, 143, 171, 130},
			{0, 186, 148, 100},					// Roselia
			{0,  80,  99, 140}, {0, 140, 159, 200}, 
			{0, 171,  39,  90}, {0, 243,  83, 140},
			{0, 136,  68, 260}, {0, 175,  87, 340},
			{0, 119,  82, 120}, {0, 194, 139, 140},
			{0, 151, 234, 140},
			{0, 125, 145, 120}, {0, 171, 211, 160},
			{0, 116, 116, 120},					// 327
			{0, 162,  78,  90}, {0, 134,  99, 100}, {0, 205, 168, 160},
			{0, 156,  74, 100}, {0, 221, 115, 140},
			{0,  76, 139,  90}, {0, 141, 208, 150},
			{0, 222, 124, 146}, {0, 196, 118, 146},
			{0, 178, 163, 180}, {0, 178, 163, 180},
			{0,  93,  83, 100}, {0, 151, 142, 220},
			{0, 141, 113,  86}, {0, 224, 156, 126},
			{0,  77, 131,  80}, {0, 140, 236, 120},
			{0, 105, 154, 132}, {0, 152, 198, 172},
			{0, 176, 100,  90}, {0, 222, 183, 150},
			{0,  29, 102,  40}, {0, 192, 242, 190},
			{0, 139, 139, 140},
			{0, 161, 212, 120},
			{0, 138,  66,  88}, {0, 218, 127, 128},
			{0,  70, 162,  40}, {0, 124, 234,  80},
			{0, 136, 165, 198},
			{0, 175, 174, 150},					//358
			{0, 246, 120, 130},
			{0,  41,  86, 190},
			{0,  95,  95, 100}, {0, 162, 162, 160},
			{0,  95,  90, 140}, {0, 137, 132, 180}, {0, 182, 176, 220},
			{0, 133, 149,  70}, {0, 197, 194, 110}, {0, 211, 194, 110},
			{0, 162, 234, 200},
			{0,  81, 134,  86},					// 370
			{0, 134, 107,  90}, {0, 172, 179, 130}, {0, 277, 168, 190},
			{0,  96, 141,  80}, {0, 138, 185, 120}, {0, 257, 247, 160},
			// regi
			{0, 179, 356, 160}, {0, 179, 356, 160}, {0, 143, 285, 160},
			// lati*s
			{0, 228, 268, 160}, {0, 268, 228, 160},
			// trio
			{0, 270, 251, 182}, {0, 270, 251, 182}, {0, 284, 170, 191},
			// mitici
			{0, 210, 210, 200}, {0, 345, 115, 100},

			// gen 4

			{0, 119, 115, 110}, {0, 157, 152, 150}, {0, 202, 197, 190},
			{0, 113,  86,  88}, {0, 158, 105, 128}, {0, 222, 151, 152},
			{0, 112, 103, 106}, {0, 150, 143, 128}, {0, 210, 193, 168},
			{0, 101,  58,  80}, {0, 142,  99, 110}, {0, 234, 145, 170},
			{0,  80,  73, 118}, {0, 162, 119, 158},
			{0,  45,  74,  74}, {0, 160, 100, 154},
			{0, 117,  64,  90}, {0, 159,  95, 120}, {0, 232, 156, 160},
			{0,  91, 126,  80}, {0, 243, 206, 120},
			{0, 218,  75, 134}, {0, 295, 114, 194},
			{0,  76, 208,  60}, {0,  94, 299, 120},
			{0,  53,  83,  80}, {0, 185,  98, 140}, {0, 185,  98, 140},
			{0,  59,  83,  60}, {0, 149, 190, 140},
			{0,  94, 182, 120}, 		// pachirisu <3
			{0, 132,  70, 110}, {0, 221, 118, 170},
			{0, 108,  96,  90}, {0, 170, 157, 140},
			{0, 103, 111, 152}, {0, 169, 149, 222},
			{0, 205, 143, 150},
			{0, 117,  85, 180}, {0, 180, 107, 300},
			{0, 130, 111, 110}, {0, 156, 200, 130},
			{0, 211, 211, 120},
			{0, 243, 103, 200},		// 430
			{0, 109,  85,  98}, {0, 172, 136, 142},
			{0, 114,  94,  90},
			{0, 121,  93, 126}, {0, 184, 135, 206},
			{0,  43, 154, 114}, {0, 161, 213, 134},
			{0, 124, 155, 100},		// 438
			{0, 125, 164,  40},
			{0,  25, 105, 200},
			{0, 183,  92, 152}, {0, 169, 199, 100},
			{0, 124,  84, 116}, {0, 172, 130, 136}, {0, 261, 198, 216},
			{0, 137, 137, 270},
			{0, 127,  78,  80}, {0, 236, 144, 140},
			{0, 124, 134, 136}, {0, 201, 212, 216},
			{0,  93, 168,  80}, {0, 180, 219, 140},
			{0, 116,  76,  96}, {0, 211, 133, 166},		// 454
			{0, 187, 136, 148},
			{0,  96, 119,  98}, {0, 142, 175, 138},
			{0, 105, 212,  90},
			{0, 115, 110, 120}, {0, 178, 163, 180},
			// new evo OP
			{0, 243, 182, 140},
			{0, 238, 217, 140},
			{0, 161, 181, 220},
			{0, 241, 224, 230},
			{0, 207, 219, 200},
			{0, 249, 173, 150},
			{0, 247, 186, 150},
			{0, 225, 227, 170},
			{0, 231, 172, 172},
			{0, 216, 254, 130},	{0, 238, 212, 130}, // eevolution
			{0, 185, 248, 150},
			{0, 247, 157, 220},
			{0, 264, 153, 170},
			{0, 237, 220, 136},
			{0, 135, 278, 120},
			{0, 180, 254,  90},
			{0, 171, 150, 140},
	
			{0, 185, 159, 100},			// rotom
			{0, 156, 270, 150}, {0, 212, 212, 160}, {0, 270, 151, 150},		// laghi
			{0, 302, 242, 200}, {0, 308, 247, 180}, {0, 251, 213, 182},
			{0, 315, 231, 220}, {0, 206, 247, 300}, {0, 152, 263, 240},
			{0, 162, 162, 160}, {0, 210, 210, 200},		// manaphy
			{0, 285, 198, 140}, {0, 210, 210, 200},
			{0, 262, 262, 240}		// arceus
		};
		
		for(int i=0; i < pokedex.length; i++) {
			pokedex[i][0] = (i+1);
		}
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

	private static int maggiore(Pokedex poked, int statToOrder) {
		int highest = 0;
		int position = 0;
		boolean sumAll = false;
		if (statToOrder > 3) {
			sumAll = true;
			statToOrder = 1;
		}
		for (int i = 0; i < poked.pokedex.length; i++) {
			int sum = 0;
			if (sumAll)
				sum = poked.pokedex[i][statToOrder] + poked.pokedex[i][statToOrder + 1] + poked.pokedex[i][statToOrder + 2];
			else
				sum = poked.pokedex[i][statToOrder];
			if (sum > highest) {
				highest = sum;
				position = i;  // i = numero pokedex -1
			}
		}
		return position;
	}

	public static Pokedex ordina(Pokedex disordinato, int statToOrder) {
		int[][] ordinato = new int[disordinato.pokedex.length][disordinato.pokedex[0].length];
		Pokedex tmp = new Pokedex();
		
		for (int i = 0; i < disordinato.pokedex.length; i++) {
			int pos = maggiore(tmp, statToOrder);
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

	
	public String getList(int fromMon, int toMon) {
		int longest = Nomi.longestName();
		String lista = "Pokemon: \n";
		String a = "#    Nome";
		String b = a + aggiungiSpazi(15);
		lista = lista + b + b + b + b + a + "\n";

		int j = 1;
		if(fromMon > 1)
			j = 0;
		// i è num pokedex - 1;
		for (int i = fromMon - 1 ; i < toMon; i++) {
			int x = 1;
			if (pokedex[i][0]>=100)
				x = 2;
			else if (pokedex[i][0]>=10)
				x = 3;
			else
				x = 4;
			lista = lista + pokedex[i][0] + aggiungiSpazi(x) + Nomi.getNome(pokedex[i][0]);

			
			if(i == 150 && i+1 < toMon) {
				lista = lista + "\nSeconda Generazione:\n";
				j = 0;
			}
			else if(i == 250 && i+1 < toMon) {
				lista = lista + "\nTerza Generazione:\n";
				j = 0;
			}
			else if(i == 385 && i+1 < toMon) {
				lista = lista + "\nQuarta Generazione:\n";
				j = 0;
			}
			else if ((i+j)%5 == 0)
				lista = lista + "\n";
			else
				lista = lista + aggiungiSpazi(longest - 5  /* =lunghezza nome più lungo, vedi definizione di longest */ 
- Nomi.getNome(pokedex[i][0]).length()) + aggiungiSpazi(9); //11 = "#    Nome".length()
		}

		return lista;
	}

	public String getStats() {
		String finale = "Pokemon: \n";
		String inizio = "#    Nome";

		int longest = Nomi.longestName(); // lunghezza nome pkm + numero a 3 cifre e "  "

		inizio = inizio + aggiungiSpazi(longest - 9 + 4); // 9 = "#    Nome".length() e 4 spazi per staccare nome e stats 
		inizio = inizio + "Att  Def  Stm";
		finale = finale + inizio + aggiungiSpazi(8) + inizio + aggiungiSpazi(8) + inizio + "\n";

		for (int i = 0; i < pokedex.length; i++) {
			int sum = pokedex[i][1] + pokedex[i][2] + pokedex[i][3];

			int x = 1;
			if (pokedex[i][0]>=100)
				x = 2;
			else if (pokedex[i][0]>=10)
				x = 3;
			else
				x = 4;
			finale = finale + pokedex[i][0] + aggiungiSpazi(x) + Nomi.getNome(pokedex[i][0]);

			String s = aggiungiSpazi(2);
			String t = aggiungiSpazi(2);
			String u = aggiungiSpazi(0);

			if (pokedex[i][1] < 100)	s = aggiungiSpazi(3);

			if (pokedex[i][2] < 100)	t = aggiungiSpazi(3);

			if (pokedex[i][3] < 100)	u = aggiungiSpazi(1);

			finale = finale + aggiungiSpazi(4 + (longest - 5  /* =lunghezza nome più lungo, vedi definizione di longest */ 
- Nomi.getNome(pokedex[i][0]).length())) + pokedex[i][1] + s + pokedex[i][2] + t + pokedex[i][3] + u;

			if ((i+1)%3 == 0)
				finale = finale + "\n";
			else
				finale = finale + aggiungiSpazi(8);
		}
		return finale;
	}
}
