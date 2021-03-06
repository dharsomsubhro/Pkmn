
public class Camerupt extends pokemon {
	Moves m=new Moves();
	
	public Camerupt(int sped, int hp, int atk, int dfns, int sAttk, int sDef) {
		super(sped, hp, atk, dfns, sAttk, sDef, "Camerupt", 1, 16);
		super.m3=new Move("Magnitude", 16, true, 50, true);
		super.m2=new Move("Earthquake", 16, true, 100, true);
		super.m1=new Move("Flamethrower", 1, true, 90, false);
		super.m4=new Move("Fire Blast", 1, true, 110, false);
	}
	public void showMoves() {
		System.out.println("Flamethrower(1)\tEarthquake(2)\nMagnitude(3)\tFire Blast(4)");
	}
	public String showMove1() {
		return "Flamethrower";
	}
	public String showMove2() {
		return "Earthquake";
	}
	public String showMove3() {
		return "Magnitude";
	}
	public String showMove4() {
		return "Fire Blast";
	}
	public String move1(pokemon p) {
		return m.flamethrower(this,p);
	}
	public String move2(pokemon p) {
		return m.earthquake(this,p);
	}
	public String move3(pokemon p) {
		return m.magnitude(this,p);
	}
	public String move4(pokemon p) {
		return m.fireBlast(this,p);
	}
	public void reset() {
		this.HP=250;
		this.attack=100;
		this.defense=70;
		this.speed=40;
		this.sAttack=105;
		this.sDefense=75;
		
		
	}

}
