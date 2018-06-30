
public class Houndoom extends pokemon {
	Moves m= new Moves();

	public Houndoom(int sped, int hp, int atk, int dfns, int sAttk, int sDef) {
		super(sped, hp, atk, dfns, sAttk, sDef, "Houndoom", 1, 9);
		// TODO Auto-generated constructor stub
	}
	public void showMoves() {
		System.out.println("Flamethrower(1)\tCrunch(2)\nNasty Plot(3)\tFire Blast(4)");
	}
	public String showMove1() {
		return "Flamethrower";
	}
	public String showMove2() {
		return "Crunch";
	}
	public String showMove3() {
		return "Nasty Plot";
	}
	public String showMove4() {
		return "Fire Blast";
	}
	public String move2(pokemon p) {
		return m.crunch(this,p);
	}
	public String move3(pokemon p) {
		return m.nastyPlot(this,p);
	}
	public String move1(pokemon p) {
		return m.flamethrower(this,p);
	}
	public String move4(pokemon p) {
		return m.fireBlast(this,p);
	}

}
