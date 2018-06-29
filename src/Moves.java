import java.util.Random;

public class Moves {
	TypeEffective t = new TypeEffective();

	public void crunch(pokemon p1, pokemon p2) {
		System.out.println(p1.name+ " used Crunch!");
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
		if(y==0.5 || y==0.25){
			System.out.println("It's not very effective...");
		}
		if (y == 0) {
			System.out.println("It didn't have any effect...");
		}
		System.out.println("Did " + damage + " damage!");
		p2.HP -= damage;

	}
	public void earthquake(pokemon p1, pokemon p2) {
		System.out.println(p1.name+ " used Earthquake!");
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
			System.out.println("It's super effective!");
		}
		if(y==0.5 || y==0.25){
			System.out.println("It's not very effective...");
		}
		if (y == 0) {
			System.out.println("It didn't have any effect...");
		}
		System.out.println("Did " + damage + " damage!");
		p2.HP -= damage;

	}
	public void magnitude(pokemon p1, pokemon p2) {
		System.out.println(p1.name+ " used Magnitude!");
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		int k=rand.nextInt(10)+1;
		System.out.println("Magnitude "+k+"!");
		k*=10;
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
			System.out.println("It's super effective!");
		}
		if(y==0.5 || y==0.25){
			System.out.println("It's not very effective...");
		}
		if (y == 0) {
			System.out.println("It didn't have any effect...");
		}
		System.out.println("Did " + damage + " damage!");
		p2.HP -= damage;

	}
	public void rockSlide(pokemon p1, pokemon p2) {
		System.out.println(p1.name+ " used Rock Slide!");
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		double y;
		int k=rand.nextInt(10)+1;
		if(k==1) {
			System.out.println("It Missed!");
			return;
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
			System.out.println("It's super effective!");
		}
		if(y==0.5 || y==0.25){
			System.out.println("It's not very effective...");
		}
		if (y == 0) {
			System.out.println("It didn't have any effect...");
		}
		System.out.println("Did " + damage + " damage!");
		p2.HP -= damage;

	}

	public void surf(pokemon p1, pokemon p2) {
		System.out.println(p1.name+ " used Surf!");
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
		if(y==0.5 || y==0.25){
			System.out.println("It's not very effective...");
		}
		if (y == 0) {
			System.out.println("It didn't have any effect...");
		}
		System.out.println("Did " + damage + " damage!");
		p2.HP -= damage;
	}
	public void waterfall(pokemon p1, pokemon p2) {
		System.out.println(p1.name+ " used Waterfall!");
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
			System.out.println("It's super effective!");
		}
		if (y == 0.5 || y==0.25) {
			System.out.println("It's not very effective...");
		}
		if (y == 0) {
			System.out.println("It didn't have any effect...");
		}
		System.out.println("Did " + damage + " damage!");
		p2.HP -= damage;
	}
	public void auraSphere(pokemon p1, pokemon p2) {
		System.out.println(p1.name+ " used Aura Sphere!");
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
			System.out.println("It's super effective!");
		}
		else if (y == 0) {
			System.out.println("It didn't have any effect...");
		}
		else if(y==0.5 || y==0.25){
			System.out.println("It's not very effective...");
		}
		
		System.out.println("Did " + damage + " damage!");
		p2.HP -= damage;
	}
	public void flashCannon(pokemon p1, pokemon p2) {
		System.out.println(p1.name+ " used Flash Cannon!");
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
			System.out.println("It's super effective!");
		}
		else if (y == 0) {
			System.out.println("It didn't have any effect...");
		}
		else if(y==0.5 || y==0.25){
			System.out.println("It's not very effective...");
		}
		
		System.out.println("Did " + damage + " damage!");
		p2.HP -= damage;
	}
	public void iceBeam(pokemon p1, pokemon p2) {
		System.out.println(p1.name+ " used Ice Beam!");
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
			System.out.println("It's super effective!");
		}
		else if (y == 0) {
			System.out.println("It didn't have any effect...");
		}
		else if(y==0.5 || y==0.25){
			System.out.println("It's not very effective...");
		}
		
		System.out.println("Did " + damage + " damage!");
		p2.HP -= damage;
	}
	public void flamethrower(pokemon p1, pokemon p2) {
		System.out.println(p1.name+ " used Flamethrower!");
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
			System.out.println("It's super effective!");
		}
		else if (y == 0) {
			System.out.println("It didn't have an effect...");
		}
		else if(y==0.5 || y==0.25){
			System.out.println("It's not very effective...");
		}
		
		System.out.println("Did " + damage + " damage!");
		p2.HP -= damage;
	}
	public void fireBlast(pokemon p1, pokemon p2) {
		System.out.println(p1.name+ " used Fire Blast!");
		Random rand = new Random();
		int z = rand.nextInt(38) + 217;
		int k=rand.nextInt(20)+1;
		if(k>17) {
			System.out.println("It Missed!");
			return;
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
			System.out.println("It's super effective!");
		}
		if(y==0.5 || y==0.25){
			System.out.println("It's not very effective...");
		}
		if (y == 0) {
			System.out.println("It didn't have an effect...");
		}
		System.out.println("Did " + damage + " damage!");
		p2.HP -= damage;
	}

	public void nastyPlot(pokemon p1, pokemon p2) {
		System.out.println(p1.name+ " used Nasty Plot!");
		p1.sAttack *= 2;
		System.out.println(p1.name+"'s Special Attack rose to "+ p1.sAttack);
		
	}
	public void tWave(pokemon p1, pokemon p2) {
		System.out.println(p1.name+ " used Thunder Wave!");
		p2.speed /= 2;
	}

}
