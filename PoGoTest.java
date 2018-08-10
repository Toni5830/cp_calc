import java.util.Scanner;

public class PoGoTest {
	public static void main(String[] args) {

		PokeCalc conti = new PokeCalc();
		Pokedex national = new Pokedex();

		Scanner in = new Scanner(System.in);
		boolean done = false;
		while (!done) {
			System.out.println("");
			System.out.println("Inserire numero (Q per terminare sequenza):");
			System.out.println("1. vedi Pokedex \n" + "2. vedi stats \n" + "3. ordina per stats \n" + "4. vedi cp \n" + "5. calcolo specifico");
			String newInput = in.next();
			if (newInput.equalsIgnoreCase("Q"))
				done = true;
			else {
				int value = Integer.parseInt(newInput);

				if (value == 1) {
					Scanner in3 = new Scanner(System.in);
					boolean done3 = false;
					while (!done3) {
						System.out.println("");
						System.out.println("Inserire numero (B per tornare indietro):");
						System.out.println("1. Gen 1 \n" + "2. Gen 2 \n" + "3. Gen 3 \n" + "4. Gen 4 \n" + "0. Tutte le generazioni.");
						String newInput3 = in.next();
						if (newInput3.equalsIgnoreCase("B"))
							done3 = true;
						else {
							int cheGen = Integer.parseInt(newInput3);
							int min = 1;
							int max = 493;

							if(cheGen == 1) {max = 151;}
							else if(cheGen == 2) {
								min = 152;
								max = 251;	}
							else if(cheGen == 3) {
								min = 252;
								max = 386;	}
							else if(cheGen == 4) {
								min = 387;	}
							System.out.println(national.getList(min, max));
						}
					}
				}

				else if (value == 2)
					System.out.println(national.getStats());

				else if (value == 3) {
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
							Pokedex ordinato = Pokedex.ordina(national, cheOrdine);
							System.out.println(ordinato.getStats());
						}
					}
				}

				else if (value == 4) {
					System.out.println("Per quale livello?");
					int liv = in.nextInt();
					System.out.println(conti.maxCP(liv));
				}

				else if (value == 5) {
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

					System.out.println("Il cp del tuo " + Nomi.getNome(numero-1) + " sarà: " + conti.calcola(numero-1, livello, ivA, ivD, ivS));
				}

				else
					System.out.println("to mare omo");
			}
		}
	}
}