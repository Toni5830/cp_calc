public class reverse {
	public static void main(String[] args) {

		int[][] pOld = new int[][] {
			// stat prese da pokemongo.gamepress
		};

		int[][] pNew = new int[150][4];

		for(int i = 0; i < pNew.length && i < pOld.length; i++) {
			pNew[i][0] = 0;
			pNew[i][1] = pOld[i][2];
			pNew[i][2] = pOld[i][3];
			pNew[i][3] = pOld[i][1];
		}

		for(int i = 0; i < pNew.length; i++) {
			System.out.println("{0, " + pNew[i][1] + ", " + pNew[i][2] + ", " + pNew[i][3] + "},");
		}
	}
}