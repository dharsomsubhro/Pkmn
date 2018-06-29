
public class Lapras extends pokemon {
	Moves m = new Moves();

	public Lapras(int speed, int HP, int attack, int defense, int sAttack, int sDefense) {
		super(speed, HP, attack, defense, sAttack, sDefense, "Lapras", 2, 5);
	}

	public void showMoves() {
		System.out.println("Surf(1)\tIce Beam(2)\nWaterfall(3)\tThunder Wave(4)");
	}

	public void move1(pokemon p) {
		m.surf(this, p);
	}

	public void move2(pokemon p) {
		m.iceBeam(this, p);
	}

	public void move3(pokemon p) {
		m.waterfall(this, p);
	}

	public void move4(pokemon p) {
		m.tWave(this, p);
	}
}
