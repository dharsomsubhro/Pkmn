
public class Golem extends pokemon {
	Moves m =new Moves();
	public Golem(int sped, int hp, int atk, int dfns, int sAttk, int sDef) {
		super(sped, hp, atk, dfns, sAttk, sDef, "Golem", 15,16);
	}
	public void showMoves() {
		System.out.println("Earthquake(1)\tRock Slide(2)\nCrunch(3)\tMagnitude(4)");
	}
	
	public void move1(pokemon p) {
		m.earthquake(this,p);
	}
	public void move2(pokemon p) {
		m.rockSlide(this,p);
	}
	public void move3(pokemon p) {
		m.crunch(this,p);
	}
	public void move4(pokemon p) {
		m.magnitude(this,p);
	}

	

}
