import java.util.Random;

public class Moves {
	TypeEffective t = new TypeEffective();

	public String crunch(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Crunch!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		double y;
		if (!p2.monotype) {
			y = t.effective(9, p2.type1, p2.type2);
		} else {
			y = t.effective(9, p2.type1);
		}
		double STAB;
		if (p1.type1 == 9 || p1.type2 == 9) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.attack * 80) / p2.defense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		s += "Did " + damage + " damage!</html>";
		p2.HP -= damage;
		return s;

	}
	
	public String dragonClaw(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Dragon Claw!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		double y;
		if (!p2.monotype) {
			y = t.effective(14, p2.type1, p2.type2);
		} else {
			y = t.effective(14, p2.type1);
		}
		double STAB;
		if (p1.type1 == 14 || p1.type2 == 14) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.attack * 80) / p2.defense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		s += "Did " + damage + " damage!</html>";
		p2.HP -= damage;
		return s;

	}
	
	public String aerialAce(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Aerial Ace!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		double y;
		if (!p2.monotype) {
			y = t.effective(6, p2.type1, p2.type2);
		} else {
			y = t.effective(6, p2.type1);
		}
		double STAB;
		if (p1.type1 == 6 || p1.type2 == 6) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.attack * 60) / p2.defense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		s += "Did " + damage + " damage!</html>";
		p2.HP -= damage;
		return s;

	}
	

	public String earthquake(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Earthquake!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		double y;
		if (!p2.monotype) {
			y = t.effective(16, p2.type1, p2.type2);
		} else {
			y = t.effective(16, p2.type1);
		}
		double STAB;
		if (p1.type1 == 16 || p1.type2 == 16) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.attack * 100) / p2.defense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		s += "Did " + damage + " damage!</html>";
		p2.HP -= damage;
		return s;

	}

	public String magnitude(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Magnitude!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		int k = rand.nextInt(10) + 1;
		s += "Magnitude " + k + "!<br>";
		k *= 10;
		double y;
		if (!p2.monotype) {
			y = t.effective(16, p2.type1, p2.type2);
		} else {
			y = t.effective(16, p2.type1);
		}
		double STAB;
		if (p1.type1 == 16 || p1.type2 == 16) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.attack * k) / p2.defense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		s += "Did " + damage + " damage!</html>";
		p2.HP -= damage;
		return s;

	}

	public String rockSlide(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Rock Slide!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		double y;
		int k = rand.nextInt(10) + 1;
		if (k == 1) {
			s += "It Missed!";
			return s;
		}
		if (!p2.monotype) {
			y = t.effective(15, p2.type1, p2.type2);
		} else {
			y = t.effective(15, p2.type1);
		}
		double STAB;
		if (p1.type1 == 15 || p1.type2 == 15) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.attack * 75) / p2.defense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		s += "Did " + damage + " damage!</html>";
		p2.HP -= damage;
		return s;

	}
	
	public String megahorn(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Megahorn!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		double y;
		int k = rand.nextInt(20) + 1;
		if (k > 17 ) {
			s += "It Missed!</html>";
			return s;
		}
		if (!p2.monotype) {
			y = t.effective(11, p2.type1, p2.type2);
		} else {
			y = t.effective(11, p2.type1);
		}
		double STAB;
		if (p1.type1 == 11 || p1.type2 == 11) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.attack * 120) / p2.defense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		s += "Did " + damage + " damage!</html>";
		p2.HP -= damage;
		return s;

	}
	
	public String fireFang(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Fire Fang!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		double y;
		int k = rand.nextInt(20) + 1;
		if (k == 20 ) {
			s += "It Missed!</html>";
			return s;
		}
		if (!p2.monotype) {
			y = t.effective(1, p2.type1, p2.type2);
		} else {
			y = t.effective(1, p2.type1);
		}
		double STAB;
		if (p1.type1 == 1 || p1.type2 == 1) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.attack * 65) / p2.defense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		s += "Did " + damage + " damage!</html>";
		p2.HP -= damage;
		return s;

	}
	
	

	public String surf(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Surf!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		double y;
		if (!p2.monotype) {
			y = t.effective(2, p2.type1, p2.type2);
		} else {
			y = t.effective(2, p2.type1);
		}
		double STAB;
		if (p1.type1 == 2 || p1.type2 == 2) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.sAttack * 90) / p2.sDefense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		s += "Did " + damage + " damage!</html>";
		p2.HP -= damage;
		return s;
	}
	
	public String moonblast(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Moonblast!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		double y;
		if (!p2.monotype) {
			y = t.effective(13, p2.type1, p2.type2);
		} else {
			y = t.effective(13, p2.type1);
		}
		double STAB;
		if (p1.type1 == 13 || p1.type2 == 13) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.sAttack * 90) / p2.sDefense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		s += "Did " + damage + " damage!</html>";
		p2.HP -= damage;
		return s;
	}
	

	public String shadowBall(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Shadow Ball!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		double y;
		if (!p2.monotype) {
			y = t.effective(10, p2.type1, p2.type2);
		} else {
			y = t.effective(10, p2.type1);
		}
		double STAB;
		if (p1.type1 == 10 || p1.type2 == 10) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.sAttack * 80) / p2.sDefense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		s += "Did " + damage + " damage!</html>";
		p2.HP -= damage;
		return s;
	}

	public String psychic(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Psychic!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		double y;
		if (!p2.monotype) {
			y = t.effective(8, p2.type1, p2.type2);
		} else {
			y = t.effective(8, p2.type1);
		}
		double STAB;
		if (p1.type1 == 8 || p1.type2 == 8) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.sAttack * 90) / p2.sDefense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		s += "Did " + damage + " damage!</html>";
		p2.HP -= damage;
		return s;
	}

	public String sludgeBomb(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Sludge Bomb!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		double y;
		if (!p2.monotype) {
			y = t.effective(18, p2.type1, p2.type2);
		} else {
			y = t.effective(18, p2.type1);
		}
		double STAB;
		if (p1.type1 == 18 || p1.type2 == 18) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.sAttack * 90) / p2.sDefense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		s += "Did " + damage + " damage!</html>";
		p2.HP -= damage;
		return s;
	}

	public String thunderbolt(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used ThunderBolt!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		double y;
		if (!p2.monotype) {
			y = t.effective(4, p2.type1, p2.type2);
		} else {
			y = t.effective(4, p2.type1);
		}
		double STAB;
		if (p1.type1 == 4 || p1.type2 == 4) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.sAttack * 90) / p2.sDefense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		s += "Did " + damage + " damage!</html>";
		p2.HP -= damage;
		return s;
	}

	public String waterfall(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Waterfall!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		double y;
		if (!p2.monotype) {
			y = t.effective(2, p2.type1, p2.type2);
		} else {
			y = t.effective(2, p2.type1);
		}
		double STAB;
		if (p1.type1 == 2 || p1.type2 == 2) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.attack * 85) / p2.defense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		s += "Did " + damage + " damage!</html>";
		p2.HP -= damage;
		return s;
	}

	public String seedBomb(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Seed Bomb!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		double y;
		if (!p2.monotype) {
			y = t.effective(3, p2.type1, p2.type2);
		} else {
			y = t.effective(3, p2.type1);
		}
		double STAB;
		if (p1.type1 == 3 || p1.type2 == 3) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.attack * 80) / p2.defense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		s += "Did " + damage + " damage!</html>";
		p2.HP -= damage;
		return s;
	}

	public String drainPunch(pokemon p1, pokemon p2) {
		int h = p2.HP;
		String s = "<html>" + p1.name + " used Drain Punch!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		double y;
		if (!p2.monotype) {
			y = t.effective(7, p2.type1, p2.type2);
		} else {
			y = t.effective(7, p2.type1);
		}
		double STAB;
		if (p1.type1 == 7 || p1.type2 == 7) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.attack * 75) / p2.defense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		p2.HP -= damage;
		int g;
		if (p2.HP <= 0) {
			s += "Did " + h + " damage!<br>";
			g=h/2;
		} else {
			s += "Did " + damage + " damage!<br>";
			g = damage / 2;
		}
		
		p1.HP += g;
		s += p1.name + " restored " + g + " HP!</html>";
		if (p1.HP > p1.maxHP) {
			p1.HP = p1.maxHP;
		}
		return s;
	}

	public String firePunch(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Fire Punch!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		double y;
		if (!p2.monotype) {
			y = t.effective(1, p2.type1, p2.type2);
		} else {
			y = t.effective(1, p2.type1);
		}
		double STAB;
		if (p1.type1 == 1 || p1.type2 == 1) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.attack * 75) / p2.defense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		s += "Did " + damage + " damage!</html>";
		p2.HP -= damage;
		return s;
	}
	

	public String auraSphere(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Aura Sphere!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		double y;
		if (!p2.monotype) {
			y = t.effective(7, p2.type1, p2.type2);
		} else {
			y = t.effective(7, p2.type1);
		}
		double STAB;
		if (p1.type1 == 7 || p1.type2 == 7) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.sAttack * 90) / p2.sDefense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		s += "Did " + damage + " damage!</html>";
		p2.HP -= damage;
		return s;
	}

	public String flashCannon(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Flash Cannon!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		double y;
		if (!p2.monotype) {
			y = t.effective(17, p2.type1, p2.type2);
		} else {
			y = t.effective(17, p2.type1);
		}
		double STAB;
		if (p1.type1 == 17 || p1.type2 == 17) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.sAttack * 90) / p2.sDefense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		s += "Did " + damage + " damage!</html>";
		p2.HP -= damage;
		return s;
	}

	public String iceBeam(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Ice Beam!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		double y;
		if (!p2.monotype) {
			y = t.effective(5, p2.type1, p2.type2);
		} else {
			y = t.effective(5, p2.type1);
		}
		double STAB;
		if (p1.type1 == 5 || p1.type2 == 5) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.sAttack * 90) / p2.sDefense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		s += "Did " + damage + " damage!</html>";
		p2.HP -= damage;
		return s;
	}

	public String flamethrower(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Flamethrower!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		double y;
		if (!p2.monotype) {
			y = t.effective(1, p2.type1, p2.type2);
		} else {
			y = t.effective(1, p2.type1);
		}
		double STAB;
		if (p1.type1 == 1 || p1.type2 == 1) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.sAttack * 90) / p2.sDefense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		s += "Did " + damage + " damage!</html>";
		p2.HP -= damage;
		return s;
	}

	public String fireBlast(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Fire Blast!<br>";
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		int k = rand.nextInt(20) + 1;
		if (k > 17) {
			s += "It Missed!";
			return s;
		}
		double y;
		if (!p2.monotype) {
			y = t.effective(1, p2.type1, p2.type2);
		} else {
			y = t.effective(1, p2.type1);
		}
		double STAB;
		if (p1.type1 == 1 || p1.type2 == 1) {
			STAB = 1.5;
		} else {
			STAB = 1;
		}
		double x = ((((22 * p1.sAttack * 110) / p2.sDefense / 50) + 2) * STAB * y * z) / 255;
		int damage = (int) x;
		if (y == 2 || y == 4) {
			s += "It's super effective!<br>";
		}
		if (y == 0.5 || y == 0.25) {
			s += "It's not very effective...<br>";
		}
		if (y == 0) {
			s += "It didn't have any effect...<br>";
		}
		s += "Did " + damage + " damage!</html>";
		p2.HP -= damage;
		return s;
	}

	public String nastyPlot(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Nasty Plot!<br>";
		p1.sAttack *= 2;
		s += p1.name + "'s Special Attack rose sharply!</html>";
		return s;

	}

	public String curse(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Curse!<br>";
		p1.attack *= 1.5;
		p1.defense *= 1.5;
		p1.speed /= 1.5;
		s += p1.name + "'s Speed fell!<br>";
		s += p1.name + "'s Atatack Rose!<br>";
		s += p1.name + "'s Defense Rose!</html>";
		return s;

	}

	public String tWave(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Thunder Wave!<br>";
		p2.speed /= 2;
		s += p2.name + " is paralyzed!</html>";
		return s;
	}

	public String sSpore(pokemon p1, pokemon p2) {
		String s = "<html>" + p1.name + " used Stun Spore!<br>";
		p2.speed /= 2;
		s += p2.name + " is paralyzed!</html>";
		return s;
	}

}
