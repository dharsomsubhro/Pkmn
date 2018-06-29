
public class Camerupt extends pokemon {
	Moves m=new Moves();

	public Camerupt(int sped, int hp, int atk, int dfns, int sAttk, int sDef) {
		super(sped, hp, atk, dfns, sAttk, sDef, "Camerupt", 1, 16);
	}
	public void showMoves() {
		System.out.println("Flamethrower(1)\tEarthquake(2)\nMagnitude(3)\tFire Blast(4)");
	}
	public void move1(pokemon p) {
		m.flamethrower(this,p);
	}
	public void move2(pokemon p) {
		m.earthquake(this,p);
	}
	public void move3(pokemon p) {
		m.magnitude(this,p);
	}
	public void move4(pokemon p) {
		m.fireBlast(this,p);
	}

}
