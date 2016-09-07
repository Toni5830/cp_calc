public class Nomi {
	private static String[] nomi;

	public Nomi() {
		nomi = new String[] {"Bulbasaur", "Ivysaur", "Venosaur", "Charmander", "Charmeleon", "Charizard",
			"Squirtle", "Wartortle", "Blastoise", "Caterpie", "Metapod", "Butterfree", "Weedle", "Kakuna",
			"Beedrill", "Pidgey", "Pidgeotto", "Pidgeot", "Rattata", "Ratticate", "Spearow", "Fearow", "Ekans",
			"Arbok", "Pikachu", "Raichu", "Sandshrew", "Sanslash", "Nidoran", "Nidorina", "Nidoqueen",
			"Nidoran", "Nidorino", "Nidoking", "Clefairy", "Clefable", "Vulpix", "Ninetails", "Jigglypuff",
			"Wigglytuff", "Zubat", "Golbat", "Oddish", "Gloom", "Vileplume", "Paras", "Parasect", "Venonat",
			"Venomoth", "Diglett", "Dugtrio", "Meowth", "Persian", "Psyduck", "Golduck", "Mankey", "Primeape",
			"Growlithe", "Arcanine", "Poliwag", "Poliwhirl", "Poliwrath", "Abra", "Kadabra", "Alakazam",
			"Machop", "Machoke", "Machamp", "Bellsprout", "Weepinbell", "Victreebel", "Tentacool", "Tentacruel",
			"Geodude", "Graveler", "Golem", "Ponyta", "Rapidash", "Slowpoke", "Slowbro", "Magnemite", "Magneton",
			"Farfetch'd", "Doduo", "Dodrio", "Seel", "Dewgong", "Grimer", "Muk", "Shellder", "Cloyster",
			"Gastly", "Haunter", "Gengar", "Onix", "Drowzee", "Hypno", "Krabby", "Kingler", "Voltorb",	"Electrode",
			"Exeggcute", "Exeggutor", "Cubone", "Marowak", "Hitmonlee", "Hitmonchan", "Lickitung",
			"Koffing", "Weezing", "Rhyhorn", "Rhydon", "Chansey", "Tangela", "Kangaskhan", "Horsea", "Seadra",
			"Goldeen", "Seaking", "Staryu", "Starmie", "Mr. Mime", "Scyther", "Jynx", "Electabuzz", "Magmar",
			"Pinsir", "Tauros", "Magikarp", "Gyarados", "Lapras", "Ditto", "Eevee", "Vaporeon", "Jolteon", "Flareon",
			"Porygon", "Omanyte", "Omastar", "Kabuto", "Kabutops", "Aerodactyl", "Snorlax",
			"Articuno", "Zapdos", "Moltres",
			"Dratini", "Dragonair", "Dragonite",
			"Mewtwo", "Mew"
		};
	}

	public static String getNome(int nPoked) {
		String name = "";
		name = nomi[nPoked - 1];
		return name;
	}

	public static int longer() {
		int longer = 0;
		for (int i = 0; i < nomi.length; i++)
			if (nomi[i].length() > longer)
				longer = nomi[i].length();
		return longer + 4;
	}
}