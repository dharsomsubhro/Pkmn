import java.util.Scanner;

public class Action {
	pokemon turn;
	pokemon other;

	String t1;
	String t2;

	Team turnTeam;
	Team otherTeam;

	public Action(pokemon p1, pokemon p2, Team te1, Team te2) {
		
		if (te1.isTurn) {
			turn = p1;
			other = p2;
			t1 = turn.name;
			t2 = other.name;
			turnTeam = te1;
			otherTeam = te2;

		} else {
			turn = p2;
			other = p1;
			t2 = turn.name;
			t1 = other.name;
			turnTeam = te2;
			otherTeam = te1;
		}

	}

	public int fight() {
		System.out.println(other.name + " has " + other.HP + " HP");
		System.out.println(turn.name + " has " + turn.HP + " HP");
		System.out.println("It's " + turn.name + "'s turn");
		Scanner sc = new Scanner(System.in);
		Moves m = new Moves();
		while (true) {
			System.out.println("Fight        Bag\nPokemon      Run");
			String s = sc.next();
			s = s.toLowerCase();
			if (s.compareTo("fight") == 0) {
				while (true) {
					System.out.println("What move should " + turn.name + " use?");
					turn.showMoves();
					s = sc.next();
					if(s.compareTo("Back")==0 || s.compareTo("back")==0) {
						break;
					}
					else if (s.compareTo("1") == 0) {
						turn.move1(other);
						if (other.HP <= 0) {
							System.out.println(other.name + " fainted!");
							if (other.name.compareTo(t1) == 0) {
								return 1;
							} else {
								return 2;
							}
						}
						pokemon temp = turn;
						turn = other;
						other = temp;
						turnTeam.isTurn=!turnTeam.isTurn;
						otherTeam.isTurn=!otherTeam.isTurn;
						Team temp2 = turnTeam;
						turnTeam = otherTeam;
						otherTeam = temp2;
						

						System.out.println(other.name + " has " + other.HP + " HP");
						System.out.println(turn.name + " has " + turn.HP + " HP");
						System.out.println("It's " + turn.name + "'s turn");
						break;
					} else if (s.compareTo("2") == 0) {
						turn.move2(other);
						if (other.HP <= 0) {
							System.out.println(other.name + " fainted!");
							if (other.name.compareTo(t1) == 0) {
								return 1;
							} else {
								return 2;
							}
						}
						pokemon temp = turn;
						turn = other;
						other = temp;
						turnTeam.isTurn=!turnTeam.isTurn;
						otherTeam.isTurn=!otherTeam.isTurn;
						Team temp2 = turnTeam;
						turnTeam = otherTeam;
						otherTeam = temp2;

						System.out.println(other.name + " has " + other.HP + " HP");
						System.out.println(turn.name + " has " + turn.HP + " HP");
						System.out.println("It's " + turn.name + "'s turn");
						break;
					} else if (s.compareTo("3") == 0) {
						turn.move3(other);
						if (other.HP <= 0) {
							System.out.println(other.name + " fainted!");
							if (other.name.compareTo(t1) == 0) {
								return 1;
							} else {
								return 2;
							}
						}
						pokemon temp = turn;
						turn = other;
						other = temp;
						turnTeam.isTurn=!turnTeam.isTurn;
						otherTeam.isTurn=!otherTeam.isTurn;
						Team temp2 = turnTeam;
						turnTeam = otherTeam;
						otherTeam = temp2;

						System.out.println(other.name + " has " + other.HP + " HP");
						System.out.println(turn.name + " has " + turn.HP + " HP");
						System.out.println("It's " + turn.name + "'s turn");
						break;
					} else if (s.compareTo("4") == 0) {
						turn.move4(other);
						if (other.HP <= 0) {
							System.out.println(other.name + " fainted!");
							if (other.name.compareTo(t1) == 0) {
								return 1;
							} else {
								return 2;
							}
						}
						pokemon temp = turn;
						turn = other;
						other = temp;
						turnTeam.isTurn=!turnTeam.isTurn;
						otherTeam.isTurn=!otherTeam.isTurn;
						Team temp2 = turnTeam;
						turnTeam = otherTeam;
						otherTeam = temp2;

						System.out.println(other.name + " has " + other.HP + " HP");
						System.out.println(turn.name + " has " + turn.HP + " HP");
						System.out.println("It's " + turn.name + "'s turn");
						break;
					} else {
						System.out.println("Enter a valid move");
					}

				}
			} else if (s.compareTo("bag") == 0) {
				System.out.println("Not ready yet");
			} else if (s.compareTo("run") == 0) {
				System.out.println("Can't do that");
			} else if (s.compareTo("pokemon") == 0) {
				int y = turnTeam.alive();
				if (y == 1) {
					System.out.println("No other pokemon can fight!");
				} else {
					System.out.println("Which pokemon do you want to switch to?");
					while (true) {
						String t = sc.next();

						if(t.compareTo("Back")==0 || t.compareTo("back")==0) {
							break;
						}
						else if (turnTeam.pkmn[0] != null && t.compareTo(turnTeam.pkmn[0].name) == 0) {
							if (turnTeam.pkmn[0].name.compareTo(turn.name) == 0) {
								System.out.println("This pokemon is already in battle");
								continue;
							}
							if (turnTeam.pkmn[0].HP <= 0) {
								System.out.println("This pokemon has no energy left to fight");
								continue;
							} else {
								if (turn.name.compareTo(t1) == 0) {
									return 10;
								}
								return 20;
							}

						} else if (turnTeam.pkmn[1] != null && t.compareTo(turnTeam.pkmn[1].name) == 0) {
							if (turnTeam.pkmn[1].name.compareTo(turn.name) == 0) {
								System.out.println("This pokemon is already in battle");
								continue;
							}
							if (turnTeam.pkmn[1].HP <= 0) {
								System.out.println("This pokemon has no energy left to fight");
								continue;
							} else {
								if (turn.name.compareTo(t1) == 0) {
									return 11;
								}
								return 21;
							}

						} else if (turnTeam.pkmn[2] != null && t.compareTo(turnTeam.pkmn[2].name) == 0) {
							if (turnTeam.pkmn[2].name.compareTo(turn.name) == 0) {
								System.out.println("This pokemon is already in battle");
								continue;
							}
							if (turnTeam.pkmn[2].HP <= 0) {
								System.out.println("This pokemon has no energy left to fight");
								continue;
							} else {
								if (turn.name.compareTo(t1) == 0) {
									return 12;
								}
								return 22;
							}

						} else if (turnTeam.pkmn[3] != null && t.compareTo(turnTeam.pkmn[3].name) == 0) {
							if (turnTeam.pkmn[3].name.compareTo(turn.name) == 0) {
								System.out.println("This pokemon is already in battle");
								continue;
							}
							if (turnTeam.pkmn[3].HP <= 0) {
								System.out.println("This pokemon has no energy left to fight");
								continue;
							} else {
								if (turn.name.compareTo(t1) == 0) {
									return 13;
								}
								return 23;
							}

						} else if (turnTeam.pkmn[4] != null && t.compareTo(turnTeam.pkmn[4].name) == 0) {
							if (turnTeam.pkmn[4].name.compareTo(turn.name) == 0) {
								System.out.println("This pokemon is already in battle");
								continue;
							}
							if (turnTeam.pkmn[4].HP <= 0) {
								System.out.println("This pokemon has no energy left to fight");
								continue;
							} else {
								if (turn.name.compareTo(t1) == 0) {
									return 14;
								}
								return 24;
							}

						} else if (turnTeam.pkmn[5] != null && t.compareTo(turnTeam.pkmn[5].name) == 0) {
							if (turnTeam.pkmn[5].name.compareTo(turn.name) == 0) {
								System.out.println("This pokemon is already in battle");
								continue;
							}
							if (turnTeam.pkmn[5].HP <= 0) {
								System.out.println("This pokemon has no energy left to fight");
								continue;
							} else {
								if (turn.name.compareTo(t1) == 0) {
									return 15;
								}
								return 25;
							}

						} else {
							System.out.println("Enter a valid pokemon(Case Sensitive)");
						}
					}
				}
			} else {
				System.out.println("Enter a legal command");

			}

		}
	}

}
