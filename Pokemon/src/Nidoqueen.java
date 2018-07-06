
public class Nidoqueen extends pokemon {
	Moves m=new Moves();
	public Nidoqueen() {
		super(76,290,92,87,75,85,"Nidoqueen", 16, 18);
		super.m1=new Move("Earthquake", 16, true, 100, true);
		super.m2=new Move("Sludge Bomb", 18, true, 90, false);
		super.m3=new Move("Flamethrower", 1, false, 80, false);
		super.m4=new Move("Surf", 2, false, 90, false);
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
		return m.earthquake(this,p);
	}
	public String move2(pokemon p) {
		return m.sludgeBomb(this,p);
	}
	public String move3(pokemon p) {
		return m.flamethrower(this,p);
	}
	public String move4(pokemon p) {
		return m.surf(this,p);
	}
	public void reset() {
		this.HP=290;
		this.attack=92;
		this.defense=86;
		this.speed=76;
		this.sAttack=75;
		this.sDefense=85;
		
		
	}
}
