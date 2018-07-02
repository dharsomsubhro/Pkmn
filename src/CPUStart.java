import javax.swing.JOptionPane;

public class CPUStart {

	
	public static void main(String[] args) {
		//Creating the pokemon
		Lucario luke = new Lucario(90, 250, 110, 70, 115, 70);
		Lapras lappy = new Lapras(60, 370, 85, 80, 85, 95);
		Golem gman = new Golem(45, 270, 120, 130, 55, 65);
		Walrein wally = new Walrein(65, 330, 80, 90, 95, 90);
		Houndoom han = new Houndoom(95, 260, 90, 50, 110, 80);
		Camerupt cam = new Camerupt(40, 250, 100, 70, 105, 75);
		//Creating the teams
		Team t1 = new Team(lappy, cam, han, null, null, null, true);
		Team t2 = new Team(gman, luke, wally, null, null, null, false);
		Team turn = t1;
		Team other = t2;
		pokemon p1 = t1.pkmn[0];
		pokemon p2 = t2.pkmn[0];
		//Starting the first fight
		JOptionPane.showMessageDialog(null, "Pick a pokemon to start with");
		CPUSwitch s=new CPUSwitch(t1,null,t2,p2,true,0,null);
		s.setVisible(true);
		
	}
}
