
public class Camerupt extends pokemon {
	Moves m=new Moves();

	public Camerupt(int sped, int hp, int atk, int dfns, int sAttk, int sDef) {
		super(sped, hp, atk, dfns, sAttk, sDef, "Camerupt", 1, 16);
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

}
