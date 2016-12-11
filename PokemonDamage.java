import java.util.Scanner;

public class PokemonDamage {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		boolean done = false;
		while (!done) {
			System.out.println("");
			System.out.println("Inserire numero (Q per terminare sequenza):");
			System.out.println("Inserire il livello del pokemon.");
			String newInput = in.next();
			if (newInput.equalsIgnoreCase("Q"))
				done = true;
			else {
				int value = Integer.parseInt(newInput);

				if (value < 101) {
					int level = value;
					System.out.println("Attacco?");
					int atk = in.nextInt();
					System.out.println("Difesa?");
					double def = in.nextDouble();
					System.out.println("Potenza attacco");
					int base = in.nextInt();
					System.out.println("STAB? (1=sì, 0=no)");
					int stab = in.nextInt();
					double modifier = 1;
					if (stab == 1)
						modifier = 1.5;
						
					System.out.print("Danno della mossa: ");
					double damage = ((2*level+10)/250.0 * (atk/def) * base + 2) * modifier;

					System.out.println(Math.round(damage));
				}
				else
					System.out.println("to mare omo");
			}
		}
	}
}