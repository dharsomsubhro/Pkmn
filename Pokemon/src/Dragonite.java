
public class Dragonite extends pokemon {
	Moves m=new Moves();
	public Dragonite() {
		super(80,292,134,95,100,100,"Dragonite", 6, 14);
		super.m1=new Move("Aerial Ace", 6, true, 60, true);
		super.m2=new Move("Fire Punch", 1, false, 75, true);
		super.m3=new Move("Dragon Claw", 14, true, 80, true);
		super.m4=new Move("Waterfall", 2, false, 85, true);
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
		return m.aerialAce(this,p);
	}
	public String move2(pokemon p) {
		return m.firePunch(this,p);
	}
	public String move3(pokemon p) {
		return m.dragonClaw(this,p);
	}
	public String move4(pokemon p) {
		return m.waterfall(this,p);
	}
	public void reset() {
		this.HP=292;
		this.attack=134;
		this.defense=95;
		this.speed=80;
		this.sAttack=100;
		this.sDefense=100;
		
		
	}
}
