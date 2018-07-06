
public class Aerodactyl extends pokemon {
	Moves m=new Moves();
	public Aerodactyl() {
		super(130,270,105,65,60,75,"Aerodactyl", 6, 15);
		super.m1=new Move("Aerial Ace", 6, true, 60, true);
		super.m2=new Move("Rock Slide", 15, true, 75, true);
		super.m3=new Move("Dragon Claw", 14, false, 80, true);
		super.m4=new Move("Fire Fang", 1, false, 65, true);
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
		return m.rockSlide(this,p);
	}
	public String move3(pokemon p) {
		return m.dragonClaw(this,p);
	}
	public String move4(pokemon p) {
		return m.fireFang(this,p);
	}
	public void reset() {
		this.HP=270;
		this.attack=105;
		this.defense=65;
		this.speed=130;
		this.sAttack=60;
		this.sDefense=75;
		
		
	}
}
