import java.util.Scanner;

public class Battle {

	public static Team which(pokemon p, Team t, Team j) {
		for (int i = 0; i < 6; i++) {
			if (t.pkmn[i] == p) {
				return t;
			}
		}
		return j;
	}

	public static void main(String[] args) {
		Lucario luke = new Lucario(90, 70, 110, 70, 115, 70);
		Lapras lappy = new Lapras(60, 130, 85, 80, 85, 95);
		Golem gman=new Golem(45,80,120,130,55,65);
		Team t1 = new Team(luke, gman, null, null, null, null, true);
		Team t2 = new Team(lappy, null, null, null, null, null, false);
		Team turn = t1;
		Team other = t2;
		pokemon p1=t1.pkmn[0];
		pokemon p2=t2.pkmn[0];
		Scanner sc = new Scanner(System.in);

		while (true) {
			Action a = new Action(p1, p2);
			int ded = a.fight();
			if(ded==1) {
				turn=t1;
				other=t2;
			}
			else {
				turn=t2;
				other=t1;
			}
			int y = turn.alive();
			if (y <= 0) {
				if(turn==t2) {
					System.out.println("Player 1 won!");
				}
				else {
					System.out.println("Player 2 won!");
				}
				break;
			} else {
				System.out.println("Which pokemon next?");
				while (true) {
					String s = sc.next();
					
					if (turn.pkmn[0]!=null && s.compareTo(turn.pkmn[0].name) == 0) {
						if (turn.pkmn[0].HP <= 0) {
							System.out.println("This pokemon has no energy left to fight");
							continue;
						}
						else {
							if(ded==1) {
								p1=t1.pkmn[0];
							}
							else {
								p2=t2.pkmn[0];
							}
							break;
						}
						
					}
					else if (turn.pkmn[1]!=null && s.compareTo(turn.pkmn[1].name) == 0) {
						if (turn.pkmn[1].HP <= 0) {
							System.out.println("This pokemon has no energy left to fight");
							continue;
						}
						else {
							if(ded==1) {
								p1=t1.pkmn[1];
							}
							else {
								p2=t2.pkmn[1];
							}
							break;
						}
						
					}
					else if (turn.pkmn[2]!=null && s.compareTo(turn.pkmn[2].name) == 0) {
						if (turn.pkmn[2].HP <= 0) {
							System.out.println("This pokemon has no energy left to fight");
							continue;
						}
						else {
							if(ded==1) {
								p1=t1.pkmn[2];
							}
							else {
								p2=t2.pkmn[2];
							}
							break;
						}
						
					}
					else if (turn.pkmn[3]!=null && s.compareTo(turn.pkmn[3].name) == 0) {
						if (turn.pkmn[3].HP <= 0) {
							System.out.println("This pokemon has no energy left to fight");
							continue;
						}
						else {
							if(ded==1) {
								p1=t1.pkmn[3];
							}
							else {
								p2=t2.pkmn[3];
							}
							break;
						}
						
					}
					else if (turn.pkmn[4]!=null && s.compareTo(turn.pkmn[4].name) == 0) {
						if (turn.pkmn[4].HP <= 0) {
							System.out.println("This pokemon has no energy left to fight");
							continue;
						}
						else {
							if(ded==1) {
								p1=t1.pkmn[4];
							}
							else {
								p2=t2.pkmn[4];
							}
							break;
						}
						
					}
					else if (turn.pkmn[5]!=null && s.compareTo(turn.pkmn[5].name) == 0) {
						if (turn.pkmn[5].HP <= 0) {
							System.out.println("This pokemon has no energy left to fight");
							continue;
						}
						else {
							if(ded==1) {
								p1=t1.pkmn[5];
							}
							else {
								p2=t2.pkmn[5];
							}
							break;
						}
						
					}
					else {
						System.out.println("Enter a valid pokemon");
					}
				}
			}

		}

		System.exit(0);
	}

}
