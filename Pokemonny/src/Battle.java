import java.util.Scanner;

public class Battle {

	public static void main(String[] args) {
		Lucario luke = new Lucario(90, 250, 110, 70, 115, 70);
		Lapras lappy = new Lapras(60, 370, 85, 80, 85, 95);
		Golem gman = new Golem(45, 270, 120, 130, 55, 65);
		Walrein wally = new Walrein(65, 330, 80, 90, 95, 90);
		Houndoom han = new Houndoom(95, 260, 90, 50, 110, 80);
		Camerupt cam = new Camerupt(40, 250, 100, 70, 105, 75);
		Team t1 = new Team(luke, wally, han, null, null, null, true);
		Team t2 = new Team(gman, lappy, cam, null, null, null, false);
		Team turn = t1;
		Team other = t2;
		pokemon p1 = t1.pkmn[0];
		pokemon p2 = t2.pkmn[0];
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(p1.name + " vs "+ p2.name);
			Action a = new Action(p1, p2, t1, t2);
			int ded = a.fight();
			
			if (ded > 2) {
				if (ded == 10) {
					t1.isTurn = !t1.isTurn;
					t2.isTurn = !t2.isTurn;
					p1 = t1.pkmn[0];
					turn = t2;
					other = t1;

				}
				if (ded == 20) {
					t1.isTurn = !t1.isTurn;
					t2.isTurn = !t2.isTurn;
					p2 = t2.pkmn[0];
					turn = t1;
					other = t2;
				}
				if (ded == 11) {
					t1.isTurn = !t1.isTurn;
					t2.isTurn = !t2.isTurn;
					p1 = t1.pkmn[1];
					turn = t2;
					other = t1;
				}
				if (ded == 21) {
					t1.isTurn = !t1.isTurn;
					t2.isTurn = !t2.isTurn;
					p2 = t2.pkmn[1];
					turn = t1;
					other = t2;

				}
				if (ded == 12) {
					t1.isTurn = !t1.isTurn;
					t2.isTurn = !t2.isTurn;
					p1 = t1.pkmn[2];
					turn = t2;
					other = t1;

				}
				if (ded == 22) {
					t1.isTurn = !t1.isTurn;
					t2.isTurn = !t2.isTurn;
					p2 = t2.pkmn[2];
					turn = t1;
					other = t2;

				}
				if (ded == 13) {
					t1.isTurn = !t1.isTurn;
					t2.isTurn = !t2.isTurn;
					p1 = t1.pkmn[3];
					turn = t2;
					other = t1;
					
				}
				if (ded == 23) {
					t1.isTurn = !t1.isTurn;
					t2.isTurn = !t2.isTurn;
					p2 = t2.pkmn[3];
					turn = t1;
					other = t2;
					
				}
				if (ded == 14) {
					t1.isTurn = !t1.isTurn;
					t2.isTurn = !t2.isTurn;
					p1 = t1.pkmn[4];
					turn = t2;
					other = t1;
					
				}
				if (ded == 24) {
					t1.isTurn = !t1.isTurn;
					t2.isTurn = !t2.isTurn;
					p2 = t2.pkmn[4];
					turn = t1;
					other = t2;
					
				}
				if (ded == 15) {
					t1.isTurn = !t1.isTurn;
					t2.isTurn = !t2.isTurn;
					p1 = t1.pkmn[5];
					turn = t2;
					other = t1;
					
				}
				if (ded == 25) {
					t1.isTurn = !t1.isTurn;
					t2.isTurn = !t2.isTurn;
					p2 = t2.pkmn[5];
					turn = t1;
					other = t2;
					
				}

				continue;

			} else if (ded == 1) {
				t1.isTurn = !t1.isTurn;
				t2.isTurn = !t2.isTurn;
				turn = t1;
				other = t2;
				
			} else if (ded == 2) {
				t1.isTurn = !t1.isTurn;
				t2.isTurn = !t2.isTurn;
				turn = t2;
				other = t1;
				
			}
			int y = turn.alive();
			if (y <= 0) {
				if (turn == t2) {
					System.out.println("None");
					System.out.println("Player 1 won!");
				} else {
					System.out.println("None");
					System.out.println("Player 2 won!");
				}
				break;
			} else {
				System.out.println("Which pokemon do you want to switch to?");
				while (true) {
					String s = sc.next();

					if (turn.pkmn[0] != null && s.compareTo(turn.pkmn[0].name) == 0) {
						if (turn.pkmn[0].HP <= 0) {
							System.out.println("This pokemon has no energy left to fight");
							continue;
						} else {
							if (ded == 1) {
								p1 = t1.pkmn[0];
							} else {
								p2 = t2.pkmn[0];
							}
							break;
						}

					} else if (turn.pkmn[1] != null && s.compareTo(turn.pkmn[1].name) == 0) {
						if (turn.pkmn[1].HP <= 0) {
							System.out.println("This pokemon has no energy left to fight");
							continue;
						} else {
							if (ded == 1) {
								p1 = t1.pkmn[1];
							} else {
								p2 = t2.pkmn[1];
							}
							break;
						}

					} else if (turn.pkmn[2] != null && s.compareTo(turn.pkmn[2].name) == 0) {
						if (turn.pkmn[2].HP <= 0) {
							System.out.println("This pokemon has no energy left to fight");
							continue;
						} else {
							if (ded == 1) {
								p1 = t1.pkmn[2];
							} else {
								p2 = t2.pkmn[2];
							}
							break;
						}

					} else if (turn.pkmn[3] != null && s.compareTo(turn.pkmn[3].name) == 0) {
						if (turn.pkmn[3].HP <= 0) {
							System.out.println("This pokemon has no energy left to fight");
							continue;
						} else {
							if (ded == 1) {
								p1 = t1.pkmn[3];
							} else {
								p2 = t2.pkmn[3];
							}
							break;
						}

					} else if (turn.pkmn[4] != null && s.compareTo(turn.pkmn[4].name) == 0) {
						if (turn.pkmn[4].HP <= 0) {
							System.out.println("This pokemon has no energy left to fight");
							continue;
						} else {
							if (ded == 1) {
								p1 = t1.pkmn[4];
							} else {
								p2 = t2.pkmn[4];
							}
							break;
						}

					} else if (turn.pkmn[5] != null && s.compareTo(turn.pkmn[5].name) == 0) {
						if (turn.pkmn[5].HP <= 0) {
							System.out.println("This pokemon has no energy left to fight");
							continue;
						} else {
							if (ded == 1) {
								p1 = t1.pkmn[5];
							} else {
								p2 = t2.pkmn[5];
							}
							break;
						}

					} else {
						System.out.println("Enter a valid pokemon");
					}
				}
			}

		}

		System.exit(0);
	}

}
