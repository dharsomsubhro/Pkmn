
public class Espeon extends pokemon {
	Moves m=new Moves();
	public Espeon() {
		super(110,240,65,60,130,95,"Espeon", 8);
		super.m1=new Move("Sludge Bomb", 18, false, 90, false);
		super.m2=new Move("Shadow Ball", 10, false, 80, false);
		super.m3=new Move("Psychic", 8, true, 90, false);
		super.m4=new Move("Nasty Plot", 9, false, 0, false);
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
		return m.sludgeBomb(this,p);
	}
	public String move2(pokemon p) {
		return m.shadowBall(this,p);
	}
	public String move3(pokemon p) {
		return m.psychic(this,p);
	}
	public String move4(pokemon p) {
		return m.nastyPlot(this,p);
	}
	public void reset() {
		this.HP=240;
		this.attack=65;
		this.defense=60;
		this.speed=110;
		this.sAttack=130;
		this.sDefense=95;
		
		
	}
}
