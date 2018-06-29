
public class Walrein extends pokemon {
	Moves m =new Moves();

	public Walrein(int sped, int hp, int atk, int dfns, int sAttk, int sDef) {
		super(sped, hp, atk, dfns, sAttk, sDef, "Walrein", 2,5);
		// TODO Auto-generated constructor stub
	}
	public void showMoves() {
		System.out.println("Surf(1)\tIce Beam(2)\nWaterfall(3)\tThunder Wave(4)");
	}
	public void move1(pokemon p) {
		m.surf(this,p);
	}
	public void move2(pokemon p) {
		m.iceBeam(this,p);
	}
	public void move3(pokemon p) {
		m.waterfall(this,p);
	}
	public void move4(pokemon p) {
		m.tWave(this,p);
	}

}
