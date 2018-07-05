
public class Electivire extends pokemon {
	Moves m=new Moves();
	public Electivire() {
		super(95,260,123,67,95,85,"Electivire", 4);
		super.m1=new Move("Thunderbolt", 4, true, 90, false);
		super.m2=new Move("Fire Punch", 1, false, 75, true);
		super.m3=new Move("Drain Punch", 7, false, 75, true);
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
		return m.thunderbolt(this,p);
	}
	public String move2(pokemon p) {
		return m.firePunch(this,p);
	}
	public String move3(pokemon p) {
		return m.drainPunch(this,p);
	}
	public String move4(pokemon p) {
		return m.crunch(this,p);
	}
	public void reset() {
		this.HP=260;
		this.attack=123;
		this.defense=67;
		this.speed=95;
		this.sAttack=95;
		this.sDefense=85;
		
		
	}
}
