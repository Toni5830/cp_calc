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
			"Gastly", "Haunter", "Gengar", "Onix", "Drowzee", "Hypno", "Krabby", "Kingler", "Voltorb", "Electrode",
			"Exeggcute", "Exeggutor", "Cubone", "Marowak", "Hitmonlee", "Hitmonchan", "Lickitung",
			"Koffing", "Weezing", "Rhyhorn", "Rhydon", "Chansey", "Tangela", "Kangaskhan", "Horsea", "Seadra",
			"Goldeen", "Seaking", "Staryu", "Starmie", "Mr. Mime", "Scyther", "Jynx", "Electabuzz", "Magmar",
			"Pinsir", "Tauros", "Magikarp", "Gyarados", "Lapras", "Ditto", "Eevee", "Vaporeon", "Jolteon", "Flareon",
			"Porygon", "Omanyte", "Omastar", "Kabuto", "Kabutops", "Aerodactyl", "Snorlax",
			"Articuno", "Zapdos", "Moltres",
			"Dratini", "Dragonair", "Dragonite",
			"Mewtwo", "Mew",
			//gen 2
			"Chikorita", "Bayleff", "Meganium", "Cyndaquil", "Quilava", "Typhlosion",
			"Totodile", "Croconaw", "Feraligatr", "Sentret", "Furret", "Hoothoot", "Noctowl",
			"Ledyba", "Ledian", "Spinarak", "Ariados", "Crobat", "Chinchou", "Lanturn", "Pichu", "Cleffa",
			"Igglybuff", "Togepi", "Togetic", "Natu", "Xatu", "Mareep", "Flaffy", "Ampharos", "Bellossom",
			"Marill", "Azumarill", "Sudowoodo", "Politoed", "Hoppip", "Skiploom", "Jumpluff", "Aipom",
			"Sunkern", "Sunflora", "Yanma", "Wooper", "Quagsire", "Espeon", "Umbreon", "Murkrow", "Slowking",
			"Misdreavus", "Unown", "Wobbufett", "Girafarig", "Pineco", "Forretress", "Dunsparce", "Gligar",
			"Steelix", "Snubbull", "Granbull", "Qwilfish", "Scizor", "Shuckle", "Heracross", "Sneasel",
			"Teddiursa", "Ursaring", "Slugma", "Magcargo", "Swinub", "Piloswine", "Corsola", "Remoraid", "Octillery",
			"Delibird", "Mantine", "Skarmory", "Houndour", "Houndoom", "Kingdra", "Phanpy", "Donphan", "Porygon2",
			"Stantler", "Smeargle", "Tyrogue", "Hitmontop", "Smoochum", "Elekid", "Magby", "Miltank", "Blissey",
			"Raikou", "Entei", "Suicune",
			"Larvitar", "Pupitar", "Tyranitar",
			"Lugia", "Ho-Oh", "Celebi"
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
		return longer + 5;
	}
}