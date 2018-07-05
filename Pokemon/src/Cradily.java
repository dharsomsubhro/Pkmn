
public class Cradily extends pokemon {
	Moves m=new Moves();
	public Cradily() {
		super(43,282,81,97,81,107,"Cradily", 3, 15);
		super.m1=new Move("Curse", 10, false, 0, false);
		super.m2=new Move("Seed Bomb", 3, true, 80, true);
		super.m3=new Move("Rock Slide", 15, true, 75, true);
		super.m4=new Move("Stun Spore", 3, false, 0, false);
	}
	public String showMove1() {
		return m1.name;
	}
	public String showMove2() {
		return m2.name;
	}
	public String showMove3() {
		return m3.name;
	}
	public String showMove4() {
		return m4.name;
	}
	public String move1(pokemon p) {
		return m.curse(this,p);
	}
	public String move2(pokemon p) {
		return m.seedBomb(this,p);
	}
	public String move3(pokemon p) {
		return m.rockSlide(this,p);
	}
	public String move4(pokemon p) {
		return m.sSpore(this,p);
	}
	public void reset() {
		this.HP=282;
		this.attack=81;
		this.defense=97;
		this.speed=43;
		this.sAttack=81;
		this.sDefense=107;
		
		
	}
}
