
public class Brain {

	Team CPUTeam;
	Team userTeam;
	pokemon userPokemon;
	pokemon CPUpokemon;
	TypeEffective t = new TypeEffective();

	public Brain(Team uTeam, Team cTeam, pokemon p1, pokemon p2) {
		userTeam = uTeam;
		CPUTeam = cTeam;
		userPokemon = p1;
		CPUpokemon = p2;
	}

	public pokemon switchTo() {
		pokemon p = null;
		if (CPUTeam.pkmn[0].HP > 0) {
			if (CPUpokemon == CPUTeam.pkmn[0]) {
				return null;
			}
			return CPUTeam.pkmn[0];
		}
		if (CPUTeam.pkmn[1].HP > 0) {
			if (CPUpokemon == CPUTeam.pkmn[1]) {
				return null;
			}
			return CPUTeam.pkmn[1];
		}
		if (CPUTeam.pkmn[2].HP > 0) {
			if (CPUpokemon == CPUTeam.pkmn[2]) {
				return null;
			}
			return CPUTeam.pkmn[2];
		}

		return p;
	}

	public int moveToUse(pokemon cp, pokemon mp) {
		int m1rating = 0;
		int m2rating = 0;
		int m3rating = 0;
		int m4rating = 0;
		double effective = 0;

		/* Calculating m1rating */
		// STAB rating
		if (cp.m1.STAB == true) {
			m1rating++;
		}

		// Power rating
		if (cp.m1.power > 0 && cp.m1.power <=50) {
			m1rating++;
		} else if (cp.m1.power > 50 && cp.m1.power < 100) {
			m1rating += 2;
		} else {
			m1rating += 3;
		}
		// Effectiveness rating
		if (mp.monotype) {
			effective = t.effective(cp.m1.type, mp.type1);
			if (effective == 2) {
				m1rating += 2;
			} else if (effective == 4) {
				m1rating += 3;
			} else if (effective == 0.5) {
				m1rating -= 2;
			} else if (effective == 0.25) {
				m1rating -= 3;
			}
		} else {
			effective = t.effective(cp.m1.type, mp.type1, mp.type2);
			if (effective == 2) {
				m1rating += 2;
			} else if (effective == 4) {
				m1rating += 3;
			} else if (effective == 0.5) {
				m1rating -= 2;
			} else if (effective == 0.25) {
				m1rating -= 3;
			}
		}
		if(cp.sAttack>cp.attack && cp.m1.physical==false) {
			m1rating++;
		}
		if(cp.attack>cp.sAttack && cp.m1.physical==true) {
			m1rating++;
		}

		/* Calculating m2rating */
		// STAB rating
		if (cp.m2.STAB == true) {
			m2rating++;
		}

		// Power rating
		if (cp.m2.power > 0 && cp.m2.power <=50) {
			m2rating++;
		} else if (cp.m2.power > 50 && cp.m2.power < 100) {
			m2rating += 2;
		} else {
			m2rating += 3;
		}
		// Effectiveness rating
		if (mp.monotype) {
			effective = t.effective(cp.m2.type, mp.type1);
			if (effective == 2) {
				m2rating += 2;
			} else if (effective == 4) {
				m2rating += 3;
			} else if (effective == 0.5) {
				m2rating -= 2;
			} else if (effective == 0.25) {
				m2rating -= 3;
			}
		} else {
			effective = t.effective(cp.m2.type, mp.type1, mp.type2);
			if (effective == 2) {
				m2rating += 2;
			} else if (effective == 4) {
				m2rating += 3;
			} else if (effective == 0.5) {
				m2rating -= 2;
			} else if (effective == 0.25) {
				m2rating -= 3;
			}
		}
		if(cp.sAttack>cp.attack && cp.m2.physical==false) {
			m2rating++;
		}
		if(cp.attack>cp.sAttack && cp.m2.physical==true) {
			m2rating++;
		}
		/* Calculating m3rating */
		// STAB rating
		if (cp.m3.STAB == true) {
			m3rating++;
		}

		// Power rating
		if (cp.m3.power > 0 && cp.m3.power <=50) {
			m3rating++;
		} else if (cp.m3.power > 50 && cp.m3.power < 100) {
			m3rating += 2;
		} else {
			m3rating += 3;
		}
		// Effectiveness rating
		if (mp.monotype) {
			effective = t.effective(cp.m3.type, mp.type1);
			if (effective == 2) {
				m3rating += 2;
			} else if (effective == 4) {
				m3rating += 3;
			} else if (effective == 0.5) {
				m3rating -= 2;
			} else if (effective == 0.25) {
				m3rating -= 3;
			}
		} else {
			effective = t.effective(cp.m3.type, mp.type1, mp.type2);
			if (effective == 2) {
				m3rating += 2;
			} else if (effective == 4) {
				m3rating += 3;
			} else if (effective == 0.5) {
				m3rating -= 2;
			} else if (effective == 0.25) {
				m3rating -= 3;
			}
		}
		if(cp.sAttack>cp.attack && cp.m3.physical==false) {
			m3rating++;
		}
		if(cp.attack>cp.sAttack && cp.m3.physical==true) {
			m3rating++;
		}

		/* Calculating m4rating */
		// STAB rating
		if (cp.m4.STAB == true) {
			m4rating++;
		}

		// Power rating
		if (cp.m4.power > 0 && cp.m4.power <=50) {
			m4rating++;
		} else if (cp.m4.power > 50 && cp.m4.power < 100) {
			m4rating += 2;
		} else {
			m4rating += 3;
		}
		// Effectiveness rating
		if (mp.monotype) {
			effective = t.effective(cp.m4.type, mp.type1);
			if (effective == 2) {
				m4rating += 2;
			} else if (effective == 4) {
				m4rating += 3;
			} else if (effective == 0.5) {
				m4rating -= 2;
			} else if (effective == 0.25) {
				m4rating -= 3;
			}
		} else {
			effective = t.effective(cp.m4.type, mp.type1, mp.type2);
			if (effective == 2) {
				m4rating += 2;
			} else if (effective == 4) {
				m4rating += 3;
			} else if (effective == 0.5) {
				m4rating -= 2;
			} else if (effective == 0.25) {
				m4rating -= 3;
			}
		}
		if(cp.sAttack>cp.attack && cp.m4.physical==false) {
			m4rating++;
		}
		if(cp.attack>cp.sAttack && cp.m4.physical==true) {
			m4rating++;
		}

		// Deciding which move is best
		int m = Math.max(Math.max(m1rating, m2rating), Math.max(m3rating, m4rating));
		if (m == m1rating) {
			return 11;
		} else if (m == m2rating) {
			return 12;
		} else if (m == m3rating) {
			return 13;
		} else {
			return 14;
		}
	}

}
