
public class Magmortar extends pokemon {
	Moves m=new Moves();
	public Magmortar() {
		super(83,260,95,67,125,95,"Magmortar", 1);
		super.m1=new Move("Thunderbolt", 4, true, 90, false);
		super.m2=new Move("Fire Punch", 1, true, 75, true);
		super.m3=new Move("Nasty Plot", 9, false, 0, false);
		super.m4=new Move("Flamethrower", 1, true, 90, false);
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
		return m.nastyPlot(this,p);
	}
	public String move4(pokemon p) {
		return m.flamethrower(this,p);
	}
	public void reset() {
		this.HP=260;
		this.attack=95;
		this.defense=67;
		this.speed=83;
		this.sAttack=125;
		this.sDefense=85;
		
		
	}
}
