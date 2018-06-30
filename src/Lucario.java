
public class Lucario extends pokemon {
	Moves m=new Moves();
	public Lucario(int speed, int HP,int attack,int defense, int sAttack,int sDefense) {
		super(speed, HP, attack, defense, sAttack, sDefense, "Lucario", 7, 17);
		
	}
	public void showMoves() {
		System.out.println("Crunch(1)\tNasty Plot(2)\nAura Sphere(3)\tFlash Cannon(4)");
	}
	public String showMove1() {
		return "Crunch";
	}
	public String showMove2() {
		return "Nasty Plot";
	}
	public String showMove3() {
		return "Aura Sphere";
	}
	public String showMove4() {
		return "Flash Cannon";
	}
	public String move1(pokemon p) {
		String s="";
		s+=m.crunch(this,p);
		return s;
	}
	public String move2(pokemon p) {
		String s="";
		s+=m.nastyPlot(this,p);
		return s;
	}
	public String move3(pokemon p) {
		String s="";
		s+=m.auraSphere(this,p);
		return s;
	}
	public String move4(pokemon p) {
		String s="";
		s+=m.flashCannon(this,p);
		return s;
	}

}
