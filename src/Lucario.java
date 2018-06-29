
public class Lucario extends pokemon {
	Moves m=new Moves();
	public Lucario(int speed, int HP,int attack,int defense, int sAttack,int sDefense) {
		super(speed, HP, attack, defense, sAttack, sDefense, "Lucario", 7, 17);
		
	}
	public void showMoves() {
		System.out.println("Crunch(1)\tNasty Plot(2)\nAura Sphere(3)\tFlash Cannon(4)");
	}
	public void move1(pokemon p) {
		m.crunch(this,p);
	}
	public void move2(pokemon p) {
		m.nastyPlot(this,p);
	}
	public void move3(pokemon p) {
		m.auraSphere(this,p);
	}
	public void move4(pokemon p) {
		m.flashCannon(this,p);
	}

}
