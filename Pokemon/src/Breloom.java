
public class Breloom extends pokemon {
	Moves m=new Moves();
	public Breloom() {
		super(70,230,130,80,60,60,"Breloom", 3, 7);
		super.m1=new Move("Drain Punch", 7, true, 75, true);
		super.m2=new Move("Seed Bomb", 3, true, 80, true);
		super.m3=new Move("Rock Slide", 15, false, 75, true);
		super.m4=new Move("Stun Spore", 3, false, 0, false);
	}
	public String showMove1() {
		return this.m1.name;
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
		return m.drainPunch(this,p);
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
		this.HP=230;
		this.attack=130;
		this.defense=80;
		this.speed=70;
		this.sAttack=60;
		this.sDefense=60;
		
		
	}
}
