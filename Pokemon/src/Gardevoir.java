
public class Gardevoir extends pokemon {
	Moves m=new Moves();
	public Gardevoir() {
		super(80,246,65,65,125,115,"Gardevoir", 8, 13);
		super.m1=new Move("Moonblast", 13, true, 90, false);
		super.m2=new Move("Shadow Ball", 10, false, 80, false);
		super.m3=new Move("Psychic", 8, true, 90, false);
		super.m4=new Move("Thunderbolt", 4, false, 90, false);
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
		return m.moonblast(this,p);
	}
	public String move2(pokemon p) {
		return m.shadowBall(this,p);
	}
	public String move3(pokemon p) {
		return m.psychic(this,p);
	}
	public String move4(pokemon p) {
		return m.thunderbolt(this,p);
	}
	public void reset() {
		this.HP=246;
		this.attack=65;
		this.defense=65;
		this.speed=80;
		this.sAttack=125;
		this.sDefense=115;
		
		
	}
}
