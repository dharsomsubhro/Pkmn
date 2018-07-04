import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Start extends JFrame implements ActionListener{
	public JButton onePlayer=new JButton("One Player v/s Computer");
	public JButton twoPlayer=new JButton("Two Player");
	public JLabel welcome=new JLabel("<html>Welcome. This is a Pokemon Battling Simulator<br> Would you like to play against a friend(2 Player)<br> or against the computer(1 Player)?</html>");
	Lucario luke = new Lucario(90, 250, 110, 70, 115, 70);
	Lapras lappy = new Lapras(60, 370, 85, 80, 85, 95);
	Golem gman = new Golem(45, 270, 120, 130, 55, 65);
	Walrein wally = new Walrein(65, 330, 80, 90, 95, 90);
	Houndoom han = new Houndoom(95, 260, 90, 50, 110, 80);
	Camerupt cam = new Camerupt(40, 250, 100, 70, 105, 75);
	//Creating the teams
	Team userTeam=new Team(null,null,null,null,null,null,true);
	Team t1 = new Team(lappy, cam, gman, null, null, null, true);
	Team t2 = new Team(han, luke, wally, null, null, null, false);
	
	pokemon p1 = t1.pkmn[0];
	pokemon p2 = t2.pkmn[0];
	//Starting the first fight
	
	public Start() {
		super("Pokemon Battle Simulator");
		setLayout(null);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		onePlayer.addActionListener(this);
		twoPlayer.addActionListener(this);
		onePlayer.setBounds(150, 200, 200, 50);
		twoPlayer.setBounds(150, 300, 200, 50);
		welcome.setBounds(120,100,400,50);
		this.add(onePlayer);
		this.add(twoPlayer);
		this.add(welcome);
		
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==onePlayer) {
			JOptionPane.showMessageDialog(null, "Pick your first three pokemon");
			pick3 s=new pick3(userTeam,null,t1,p1,true,0,null);
			s.setVisible(true);
			dispose();
			//CPUStart c=new CPUStart();
			//c.main(null);
			//dispose();
			
		}
		//if(e.getSource()==twoPlayer) {
			//ButtonBattle b=new ButtonBattle();
			//b.main(null);
		//}
	}
	
	public static void main(String[] args) {
		Start s=new Start();
		s.setVisible(true);
	}

}
