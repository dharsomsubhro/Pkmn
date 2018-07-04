
public class Golem extends pokemon {
	Moves m =new Moves();
	
	public Golem(int sped, int hp, int atk, int dfns, int sAttk, int sDef) {
		super(sped, hp, atk, dfns, sAttk, sDef, "Golem", 15,16);
		super.m1=new Move("Earthquake", 16, true, 100, true);
		super.m2=new Move("Rock Slide", 15, true, 75, true);
		super.m3=new Move("Crunch", 9, false, 80, true);
		super.m4=new Move("Magnitude", 16, true, 50, true);
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
	public void reset() {
		this.HP=270;
		this.attack=120;
		this.defense=130;
		this.speed=45;
		this.sAttack=55;
		this.sDefense=65;
	}
	

}
