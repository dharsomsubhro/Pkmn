
public class Gengar extends pokemon {
	Moves m=new Moves();
	public Gengar() {
		super(110,230,65,60,130,75,"Gengar", 10, 18);
		super.m1=new Move("Curse", 10, true, 0, false);
		super.m2=new Move("Shadow Ball", 10, true, 80, false);
		super.m3=new Move("Sludge Bomb", 18, true, 90, false);
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
		return m.curse(this,p);
	}
	public String move2(pokemon p) {
		return m.shadowBall(this,p);
	}
	public String move3(pokemon p) {
		return m.sludgeBomb(this,p);
	}
	public String move4(pokemon p) {
		return m.nastyPlot(this,p);
	}
	public void reset() {
		this.HP=230;
		this.attack=65;
		this.defense=65;
		this.speed=110;
		this.sAttack=130;
		this.sDefense=75;
		
		
	}
}
