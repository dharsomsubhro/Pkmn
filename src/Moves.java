import java.util.Random;

public class Moves {
	TypeEffective t = new TypeEffective();

	public void crunch(pokemon p1, pokemon p2) {
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
			System.out.println("It's super effective!");
		}
		if (y == 0.5) {
			System.out.println("It's not very effective...");
		}
		if (y == 0) {
			System.out.println("It didn't have and effect...");
		}
		System.out.println("Did " + damage + " damage!");
		p2.HP -= damage;

	}

	public void surf(pokemon p1, pokemon p2) {
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
			System.out.println("It's super effective!");
		}
		if (y == 0.5) {
			System.out.println("It's not very effective...");
		}
		if (y == 0) {
			System.out.println("It didn't have and effect...");
		}
		System.out.println("Did " + damage + " damage!");
		p2.HP -= damage;
	}

	public void nastyPlot(pokemon p1, pokemon p2) {
		p1.sAttack *= 2;
	}

}
