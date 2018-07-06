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
	Cradily crad= new Cradily();
	Electivire ele=new Electivire();
	Espeon es=new Espeon();
	//Creating the teams
	Team userTeam=new Team(null,null,null,null,null,null,true);
	Team t1 = new Team(crad, ele, es, null, null, null, true);
	
	pokemon p1 = t1.pkmn[0];
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
			
		}
		if(e.getSource()==twoPlayer) {
			ButtonBattle b=new ButtonBattle();
			b.main(null);
			dispose();
		}
	}
	
	public static void main(String[] args) {
		Start s=new Start();
		s.setVisible(true);
		
	}

}
