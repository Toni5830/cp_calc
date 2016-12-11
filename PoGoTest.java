import java.util.Scanner;

public class PoGoTest {
	public static void main(String[] args) {

		PokeCalc conti = new PokeCalc();
		Pokedex kanto = new Pokedex();

		Scanner in = new Scanner(System.in);
		boolean done = false;
		while (!done) {
			System.out.println("");
			System.out.println("Inserire numero (Q per terminare sequenza):");
			System.out.println("1. vedi Pokedex \n" + "2. ordina per stats \n" + "3. vedi cp \n" + "4. calcolo specifico");
			String newInput = in.next();
			if (newInput.equalsIgnoreCase("Q"))
				done = true;
			else {
				int value = Integer.parseInt(newInput);

				if (value == 1)
					System.out.println(kanto.getStats());

				else if (value == 2) {
					Scanner in2 = new Scanner(System.in);
					boolean done2 = false;
					while (!done2) {
						System.out.println("");
						System.out.println("Inserire numero (B per tornare indietro):");
						System.out.println("1. ordina per attacco \n" + "2. ordina per difesa \n" + "3. ordina per stamina \n" + "4. ordina per stats totali");
						String newInput2 = in.next();
						if (newInput2.equalsIgnoreCase("B"))
							done2 = true;
						else {
							int cheOrdine = Integer.parseInt(newInput2);
							Pokedex ordinato = Pokedex.ordina(kanto, cheOrdine);
							System.out.println(ordinato.getStats());
						}
					}
				}

				else if (value == 3) {
					System.out.println("Per quale livello?");
					int liv = in.nextInt();
					System.out.println(conti.maxCP(liv));
				}

				else if (value == 4) {
					System.out.println("Numero Pokedex?");
					int numero = in.nextInt();
					System.out.println("Livello?");
					int livello = in.nextInt();
					System.out.println("IV attacco?");
					int ivA = in.nextInt();
					System.out.println("IV difesa?");
					int ivD = in.nextInt();
					System.out.println("IV stamina?");
					int ivS = in.nextInt();

					System.out.println("Il cp del tuo pokemon sarà: " + conti.calcola(numero-1, livello, ivA, ivD, ivS));
				}

				else
					System.out.println("to mare omo");
			}
		}
	}
}