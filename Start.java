import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Start extends JFrame implements ActionListener{
	public JButton onePlayer=new JButton("One Player v/s Computer");
	public JButton twoPlayer=new JButton("Two Player");
	public JLabel welcome=new JLabel("<html>Welcome. This is a Pokemon Battling Simulator<br> Would you like to play against a friend(2 Player)<br> or against the computer(1 Player)?</html>");
	
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
			CPUStart c=new CPUStart();
			c.main(null);
			
		}
		if(e.getSource()==twoPlayer) {
			ButtonBattle b=new ButtonBattle();
			b.main(null);
		}
	}
	
	public static void main(String[] args) {
		Start s=new Start();
		s.setVisible(true);
	}

}
