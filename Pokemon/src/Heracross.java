
public class Heracross extends pokemon {
	Moves m=new Moves();
	public Heracross() {
		super(85,270,125,75,40,95,"Heracross", 11, 7);
		super.m1=new Move("Drain Punch", 7, true, 75, true);
		super.m2=new Move("Megahorn", 11, true, 120, true);
		super.m3=new Move("Rock Slide", 15, false, 75, true);
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
		return m.drainPunch(this,p);
	}
	public String move2(pokemon p) {
		return m.megahorn(this,p);
	}
	public String move3(pokemon p) {
		return m.rockSlide(this,p);
	}
	public String move4(pokemon p) {
		return m.crunch(this,p);
	}
	public void reset() {
		this.HP=270;
		this.attack=125;
		this.defense=75;
		this.speed=85;
		this.sAttack=40;
		this.sDefense=95;
		
		
	}
}
