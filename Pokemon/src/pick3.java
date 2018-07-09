import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class pick3 extends JFrame implements ActionListener {
	//GUI components
	public JButton p1 = new JButton("");
	public JButton p2 = new JButton("");
	public JButton p3 = new JButton("");
	public JButton p4 = new JButton("");
	public JButton p5 = new JButton("");
	public JButton p6 = new JButton("");
	public JButton back = new JButton("Back");
	public JPanel whole;
	public JButton readyButton = new JButton("Ready");
	//starting option pokemon
	Lucario luke = new Lucario(90, 250, 110, 70, 115, 70);
	Lapras lappy = new Lapras(60, 370, 85, 80, 85, 95);
	Golem gman = new Golem(45, 270, 120, 130, 55, 65);
	Walrein wally = new Walrein(65, 330, 80, 90, 95, 90);
	Houndoom han = new Houndoom(95, 260, 90, 50, 110, 80);
	Camerupt kam = new Camerupt(40, 250, 100, 70, 105, 75);

	
	//Images
	Image luc = null;
	Image lap = null;
	Image wal = null;
	Image hou = null;
	Image cam = null;
	Image gol = null;

	Team team1;
	Team team2;
	pokemon turn;
	pokemon other;
	pokemon ba;
	boolean dead;
	int y;
	JButton firstPick = null;
	JButton secondPick = null;
	JButton thirdPick = null;

	public pick3(Team t1, pokemon pk1, Team t2, pokemon pk2, boolean ded, int x, pokemon b) {
		readyButton.setEnabled(false);
		back.setEnabled(false);
		y = x;
		//setting up images
		try {
			luc = ImageIO.read(getClass().getResource("/icons/Lucario.png"));
			lap = ImageIO.read(getClass().getResource("/icons/250px-131Lapras.png"));
			gol = ImageIO.read(getClass().getResource("/icons/golem.png"));
			wal = ImageIO.read(getClass().getResource("/icons/walrein.png"));
			cam = ImageIO.read(getClass().getResource("/icons/Camerupt.png"));
			hou = ImageIO.read(getClass().getResource("/icons/250px-229Houndoom.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//setting up GUI
		dead = ded;
		team1 = t1;
		turn = pk1;
		team2 = t2;
		other = pk2;
		ba = b;
		setSize(1000, 1000);
		p1.setFont(new Font("Serif", Font.BOLD, 26));
		p2.setFont(new Font("Serif", Font.BOLD, 26));
		p3.setFont(new Font("Serif", Font.BOLD, 26));
		p4.setFont(new Font("Serif", Font.BOLD, 26));
		p5.setFont(new Font("Serif", Font.BOLD, 26));
		p6.setFont(new Font("Serif", Font.BOLD, 26));
		back.setFont(new Font("Serif", Font.BOLD, 26));
		readyButton.setFont(new Font("Serif", Font.BOLD, 26));
		p1.addActionListener(this);
		p2.addActionListener(this);
		p3.addActionListener(this);
		p4.addActionListener(this);
		p5.addActionListener(this);
		p6.addActionListener(this);
		back.addActionListener(this);
		readyButton.addActionListener(this);
		whole = new JPanel(new GridLayout(3, 2));

		p1.setText("Lucario");
		p1.setIcon(new ImageIcon(luc));
		p2.setText("Walrein");
		p2.setIcon(new ImageIcon(wal));
		p3.setText("Camerupt");
		p3.setIcon(new ImageIcon(cam));
		p4.setText("Houndoom");
		p4.setIcon(new ImageIcon(hou));
		p5.setText("Golem");
		p5.setIcon(new ImageIcon(gol));
		p6.setText("Lapras");
		p6.setIcon(new ImageIcon(lap));

		whole.add(p1);
		whole.add(p2);
		whole.add(p3);
		whole.add(p4);
		whole.add(p5);
		whole.add(p6);
		back.setBounds(290, 20, 200, 50);
		readyButton.setBounds(490, 20, 200, 50);

		JPanel bac = new JPanel(null);
		bac.add(back);
		bac.add(readyButton);
		this.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

		add(whole);
		add(bac);

	}

	public void actionPerformed(ActionEvent e) {
		if (readyButton.isEnabled()) {
			//if user has picked all 3 pokemon
			if (e.getSource() == readyButton) {
				//start a fight with the 3 picked
				CPUFight b = new CPUFight(team1.pkmn[0], other, team1, team2, 0, 1);
				b.setVisible(true);
				dispose();
				//if they go back
			} else if (e.getActionCommand() == "Back") {
				//figuring out how many pokemon they picked and getting rid
				//of most recent one
				if (thirdPick != null) {
					thirdPick.setEnabled(true);
					thirdPick = null;
					readyButton.setEnabled(false);
				} else {
					if (secondPick != null) {
						secondPick.setEnabled(true);
						secondPick = null;
					} else {
						firstPick.setEnabled(true);
						firstPick = null;
						back.setEnabled(false);
					}
				}
				team1.remove();
			}
		} else {
			//if they haven't picked all 3 pokemon yet
			if (e.getSource() == readyButton) {
				CPUFight b = new CPUFight(team1.pkmn[0], other, team1, team2, 0, 1);
				b.setVisible(true);
				dispose();
			} else if (e.getActionCommand() == "Back") {
				//same as before, getting rid of most recent pokemon
				if (thirdPick != null) {
					thirdPick.setEnabled(true);
					thirdPick = null;
					readyButton.setEnabled(false);
				} else {
					if (secondPick != null) {
						secondPick.setEnabled(true);
						secondPick = null;
					} else {
						firstPick.setEnabled(true);
						firstPick = null;
						back.setEnabled(false);
					}
				}
				team1.remove();
			} 
			
			/* All the pokemon to add */
			else if (e.getSource() == p6) {
				p6.setEnabled(false);
				team1.add(lappy);
				back.setEnabled(true);
				if (firstPick == null) {
					firstPick = p6;
				} else if (secondPick == null) {
					secondPick = p6;
				} else if (thirdPick == null) {
					thirdPick = p6;
					readyButton.setEnabled(true);
				}
			} else if (e.getSource() == p5) {
				p5.setEnabled(false);
				team1.add(gman);
				back.setEnabled(true);
				if (firstPick == null) {
					firstPick = p5;
				} else if (secondPick == null) {
					secondPick = p5;
				} else if (thirdPick == null) {
					thirdPick = p5;
					readyButton.setEnabled(true);
				}
			} else if (e.getSource() == p4) {
				p4.setEnabled(false);
				team1.add(han);
				back.setEnabled(true);
				if (firstPick == null) {
					firstPick = p4;
				} else if (secondPick == null) {
					secondPick = p4;
				} else if (thirdPick == null) {
					thirdPick = p4;
					readyButton.setEnabled(true);
				}
			} else if (e.getSource() == p3) {
				p3.setEnabled(false);
				team1.add(kam);
				back.setEnabled(true);
				if (firstPick == null) {
					firstPick = p3;
				} else if (secondPick == null) {
					secondPick = p3;
				} else if (thirdPick == null) {
					thirdPick = p3;
					readyButton.setEnabled(true);
				}
			} else if (e.getSource() == p2) {
				p2.setEnabled(false);
				team1.add(wally);
				back.setEnabled(true);
				if (firstPick == null) {
					firstPick = p2;
				} else if (secondPick == null) {
					secondPick = p2;
				} else if (thirdPick == null) {
					thirdPick = p2;
					readyButton.setEnabled(true);
				}
			} else if (e.getSource() == p1) {
				p1.setEnabled(false);
				team1.add(luke);
				back.setEnabled(true);
				if (firstPick == null) {
					firstPick = p1;
				} else if (secondPick == null) {
					secondPick = p1;
				} else if (thirdPick == null) {
					thirdPick = p1;
					readyButton.setEnabled(true);
				}
			}
		}
	}
}
