import java.util.Scanner;

public class pro2 {

	public static void main(String[] args) {

		Scanner userinput = new Scanner(System.in);
		Scanner userinput1 = new Scanner(System.in);

		int[] safe = new int[99999];
		int u = 0;
		while (true) {
			System.out.print("Draw, Deposit, Balance, Exit: ");
			String g = userinput.next();
			if (g.equalsIgnoreCase("deposit") || g.equalsIgnoreCase("depo")) {
				deposit(safe, u);
				u++;
			} else if (g.equals("draw")) {
				draw(safe);
			} else if (g.equals("balance")) {
				ballance(safe);
			} else if (g.equalsIgnoreCase("exit")) {
				break;
			}
		}
	}

	private static int[] deposit(int[] safe, int u) {
		int j = 0, i = 0, k = 0, h = 0;
		int aa = 0, aa2 = 0;
		int minIndex = 0;
		int m = 0;
		int[] p = new int[40];

		Scanner input2 = new Scanner(System.in);
		System.out.print("insert sum: ");
		h = input2.nextInt();

		if (h < 0) {
			int z = h;

			aa2 = 0;

			for (int n = 0; n < safe.length; n++) {
				if(safe[n] == 0){
					continue;
				} else {
				aa2 += safe[n];
			
				}
			}
			if (aa2 < h * -1) {
				System.out
						.println("Not enough money for complete loan payment! "
								+ "\n" + "Sum drawn for partial loan payment: "
								+ aa2);

				for (int n = 0; n < safe.length; n++) {
					safe[n] = 0;
				}

			}

			while (z < 0) {
				aa2 = 0;

				for (int n = 0; n < safe.length; n++) {
					aa2 += safe[n];
				}

				if (aa2 <= 0) {
					System.out.println("No money in ballance for loan! " + "\n"
							+ "Sum drawn for partial loan payment: " + aa2);

					break;
				} else {

					for (i = 0; i < safe.length; i++) {
						int min = 999999999;
						minIndex = 0;
						for (j = i; j < safe.length; j++) {
							if (min > safe[j]) {
								min = safe[j];
								minIndex = j;
							}
						}
						int swap = safe[minIndex];
						safe[minIndex] = safe[i];
						safe[i] = swap;
						k = safe[i];

					}
					safe[minIndex] = 0;

					if (k > 0) {
						z += k;
					}
				}

				if (z >= 0) {

					System.out.println("change returned in safe (as packate): "
							+ z);

					for (int n = 0; n < safe.length; n++) {
						if (safe[n] == 0) {
							safe[n] = z;
							break;
						}

					}
					aa = 0;
					for (int n = 0; n < safe.length; n++) {

						aa += safe[n];
						if (n == safe.length - 1) {
							System.out.println("Whole sum in safe: " + aa);
						}
					}

				}
			}
		} else if (h >= 0) {
			m = 0;
			// for (int n = 0; n < p.length; n++) {
			// p[n] = 0;
			// }

			safe[u] = h;
			for (int n = 0; n < safe.length; n++) {
				if (safe[n] != 0) {

					p[m] = safe[n];
					m++;
				}

			}
			u++;
			for (int t = 0; t < p.length; t++) {
				if (p[t] != 0) {
					System.out.println("Paketi v seifa: " + p[t] + ", ");
				}
			}
		}
		return safe;

	}

	private static int[] draw(int[] safe) {
		int f = 0, j = 0, i = 0, k = 0, l = 0, h = 0, u = 0;
		int aa = 0, aa2 = 0, aa3 = 0, aa4 = 0;
		int minIndex = 0;

		Scanner userinput1 = new Scanner(System.in);
		System.out
				.println("Draw by package (P) / Draw whole sum of safe (S) / Menu (M):");
		String c = userinput1.nextLine();

		if (c.equalsIgnoreCase("p")) {

			while (true) {

				System.out.print("draw? ( Y / n ) : ");
				String v = userinput1.nextLine();

				if (v.equalsIgnoreCase("y")) {

					for (i = 0; i < safe.length; i++) {
						int min = 999999999;
						minIndex = 0;
						for (j = i; j < safe.length; j++) {
							if (min > safe[j]) {
								min = safe[j];
								minIndex = j;
							}
						}
						int swap = safe[minIndex];
						safe[minIndex] = safe[i];
						safe[i] = swap;
						k = safe[i];

					}
					safe[minIndex] = 0;
					if (k != 0) {
						System.out.println(k);
					} else if (k <= 0) {
						System.out.println("No money in ballance! ");
					}
				} else if (v.equalsIgnoreCase("n")) {
					break;
				}
			}

		} else if (c.equalsIgnoreCase("s")) {
			aa4 = 0;
			for (int n = 0; n < safe.length; n++) {
				aa4 += safe[n];
				safe[n] = 0;
			}
			if (aa4 != 0) {
				System.out.println("Sum drawn: " + aa4);
			} else {
				System.out.println("No money in balance! ");
			}

			System.out.println("Return to menu? (Enter)");
			String ff = userinput1.nextLine();
			if (!ff.equals("safsadf")) {

			}

		} else if (c.equalsIgnoreCase("m")) {

		} else if (!c.equals("safg")) {

			for (int n = 0; n < 20; n++) {
				System.out.println();
			}

			System.out.println("Invalid choice");
			System.out.println("Return to main menu (Enter)");

			String ss = userinput1.nextLine();
			if (!ss.equals("TeXt koito nqma shans da suvpadne :D ")) {

				for (int n = 0; n < 20; n++) {
					System.out.println();
				}
			}
		}

		return safe;
	}

	private static void ballance(int[] safe) {
		Scanner userinput1 = new Scanner(System.in);
		int[] p = new int[safe.length];
		int aa = 0, aa3 = 0;
		int[] p2 = new int[safe.length];
		aa = 0;

		for (int o = 0; o < safe.length; o++) {
			aa += safe[o];
			if (safe[o] != 0) {
				p2[aa3] = safe[o];
				aa3++;
			}
		}
		System.out.println(aa);
		System.out.println();
		System.out.print("View of packets? (Y / n) : ");
		String b = userinput1.nextLine();
	
		if (b.equalsIgnoreCase("y")) {

			for (int n = 0; n < p2.length; n++) {
				if (p2[n] != 0) {
					System.out.print(p2[n] + ", ");
				}
			}
			if (aa <= 0) {
				System.out.println("No packets");
			}

			System.out.println("Main menu? (Enter) ");
			String bb = userinput1.nextLine();
			if (!bb.equals("sdsge")) {

				System.out.println();

			}
		}
		System.out.println();
		System.out.println();

		if (b.equals("n")) {

		}

		if (!b.equalsIgnoreCase("y") || !b.equalsIgnoreCase("n")) {
			System.out.println("Invalid choice");
			System.out.println("Return to main menu (Enter)");

			String ss = userinput1.nextLine();
			if (!ss.equals("TeXt koito nqma shans da suvpadne :D ")) {

				for (int n = 0; n < 20; n++) {
					System.out.println();
				}
			}

		}

	}

}
