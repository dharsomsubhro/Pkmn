
public class Lapras extends pokemon {
	Moves m = new Moves();

	public Lapras(int speed, int HP, int attack, int defense, int sAttack, int sDefense) {
		super(speed, HP, attack, defense, sAttack, sDefense, "Lapras", 2, 5);
	}

	public void showMoves() {
		System.out.println("Surf(1)\tIce Beam(2)\nWaterfall(3)\tThunder Wave(4)");
	}
	public String showMove1() {
		return "Surf";
	}
	public String showMove2() {
		return "Ice Beam";
	}
	public String showMove3() {
		return "Waterfall";
	}
	public String showMove4() {
		return "Thunder Wave";
	}

	public String move1(pokemon p) {
		return m.surf(this,p);
	}
	public String move2(pokemon p) {
		return m.iceBeam(this,p);
	}
	public String move3(pokemon p) {
		return m.waterfall(this,p);
	}
	public String move4(pokemon p) {
		return m.tWave(this,p);
	}
}
