
public class Golem extends pokemon {
	Moves m =new Moves();
	public Golem(int sped, int hp, int atk, int dfns, int sAttk, int sDef) {
		super(sped, hp, atk, dfns, sAttk, sDef, "Golem", 15,16);
	}
	public void showMoves() {
		System.out.println("Earthquake(1)\tRock Slide(2)\nCrunch(3)\tMagnitude(4)");
	}
	public String showMove1() {
		return "Earthquake";
	}
	public String showMove2() {
		return "Rock Slide";
	}
	public String showMove3() {
		return "Crunch";
	}
	public String showMove4() {
		return "Magnitude";
	}
	public String move1(pokemon p) {
		return m.earthquake(this,p);
	}
	public String move2(pokemon p) {
		return m.rockSlide(this,p);
	}
	public String move3(pokemon p) {
		return m.crunch(this,p);
	}
	public String move4(pokemon p) {
		return m.magnitude(this,p);
	}

	

}
