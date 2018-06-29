
public class Houndoom extends pokemon {
	Moves m= new Moves();

	public Houndoom(int sped, int hp, int atk, int dfns, int sAttk, int sDef) {
		super(sped, hp, atk, dfns, sAttk, sDef, "Houndoom", 1, 9);
		// TODO Auto-generated constructor stub
	}
	public void showMoves() {
		System.out.println("Flamethrower(1)\tCrunch(2)\nNasty Plot(3)\tFire Blast(4)");
	}
	public void move2(pokemon p) {
		m.crunch(this,p);
	}
	public void move3(pokemon p) {
		m.nastyPlot(this,p);
	}
	public void move1(pokemon p) {
		m.flamethrower(this,p);
	}
	public void move4(pokemon p) {
		m.fireBlast(this,p);
	}

}
