
public class Flygon extends pokemon {
	Moves m=new Moves();
	public Flygon() {
		super(100,270,100,80,80,80,"Flygon", 16, 14);
		super.m1=new Move("Earthquake", 16, true, 100, true);
		super.m2=new Move("Fire Punch", 1, false, 75, true);
		super.m3=new Move("Dragon Claw", 14, true, 80, true);
		super.m4=new Move("Crunch", 9, false, 80, true);
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
		return m.firePunch(this,p);
	}
	public String move3(pokemon p) {
		return m.dragonClaw(this,p);
	}
	public String move4(pokemon p) {
		return m.crunch(this,p);
	}
	public void reset() {
		this.HP=270;
		this.attack=100;
		this.defense=80;
		this.speed=100;
		this.sAttack=80;
		this.sDefense=80;
		
		
	}
}
