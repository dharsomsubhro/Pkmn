
public class Walrein extends pokemon {
	Moves m =new Moves();
	
	public Walrein(int sped, int hp, int atk, int dfns, int sAttk, int sDef) {
		super(sped, hp, atk, dfns, sAttk, sDef, "Walrein", 2,5);
		super.m1=new Move("Surf", 2, true, 90, false);
		super.m2=new Move("Ice Beam", 5, true, 90, false);
		super.m3=new Move("Waterfall", 2, true, 85, true);
		super.m4=new Move("Thunder Wave", 4, false, 0, false);
		
	}
	public void showMoves() {
		System.out.println("Surf(1)\tIce Beam(2)\nWaterfall(3)\tThunder Wave(4)");
	}
	public String showMove1() {
		return "Surf";
	}
	public String showMove2() {
		return "Ice Beam";
	}
	public String showMove3() {
		return "Waterfall";
	}
	public String showMove4() {
		return "Thunder Wave";
	}
	public String move1(pokemon p) {
		return m.surf(this,p);
	}
	public String move2(pokemon p) {
		return m.iceBeam(this,p);
	}
	public String move3(pokemon p) {
		return m.waterfall(this,p);
	}
	public String move4(pokemon p) {
		return m.tWave(this,p);
	}

}
