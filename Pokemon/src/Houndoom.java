
public class Houndoom extends pokemon {
	Moves m= new Moves();
	
	public Houndoom(int sped, int hp, int atk, int dfns, int sAttk, int sDef) {
		super(sped, hp, atk, dfns, sAttk, sDef, "Houndoom", 1, 9);
		super.m2=new Move("Crunch", 9, true, 80, true);
		super.m3=new Move("Nasty Plot", 9, true, 0, false);
		super.m1=new Move("Flamethrower", 1, true, 90, false);
		super.m4=new Move("Fire Blast", 1, true, 110, false);
		
	}
	public void showMoves() {
		System.out.println("Flamethrower(1)\tCrunch(2)\nNasty Plot(3)\tFire Blast(4)");
	}
	public String showMove1() {
		return "Flamethrower";
	}
	public String showMove2() {
		return "Crunch";
	}
	public String showMove3() {
		return "Nasty Plot";
	}
	public String showMove4() {
		return "Fire Blast";
	}
	public String move2(pokemon p) {
		return m.crunch(this,p);
	}
	public String move3(pokemon p) {
		return m.nastyPlot(this,p);
	}
	public String move1(pokemon p) {
		return m.flamethrower(this,p);
	}
	public String move4(pokemon p) {
		return m.fireBlast(this,p);
	}
	public void reset() {
		this.HP=260;
		this.attack=90;
		this.defense=50;
		this.speed=95;
		this.sAttack=110;
		this.sDefense=80;
	}

}
