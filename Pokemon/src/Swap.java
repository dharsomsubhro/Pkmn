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
import java.io.IOException;

public class Swap extends JFrame implements ActionListener {

	public JButton p1 = new JButton("");
	public JButton p2 = new JButton("");
	public JButton p3 = new JButton("");
	public JButton p4 = new JButton("");
	public JButton p5 = new JButton("");
	public JButton p6 = new JButton("");
	public JButton back = new JButton("Back");
	public JPanel whole;
	public JButton readyButton = new JButton("Ready");
	public JButton no = new JButton("Don't swap and move on");

	Lucario luke = new Lucario(90, 250, 110, 70, 115, 70);
	Lapras lappy = new Lapras(60, 370, 85, 80, 85, 95);
	Golem gman = new Golem(45, 270, 120, 130, 55, 65);
	Walrein wally = new Walrein(65, 330, 80, 90, 95, 90);
	Houndoom han = new Houndoom(95, 260, 90, 50, 110, 80);
	Camerupt kam = new Camerupt(40, 250, 100, 70, 105, 75);

	Team te1 = new Team(lappy, kam, gman, null, null, null, true);
	Team te2 = new Team(han, luke, wally, null, null, null, false);
	Team te3 = new Team(null, null, null, null, null, null, true);
	Team te4 = new Team(null, null, null, null, null, null, true);
	Image luc = null;
	Image lap = null;
	Image wal = null;
	Image hou = null;
	Image cam = null;
	Image gol = null;

	Team team1;
	Team team2;
	Team swapteam;
	pokemon turn;
	pokemon other;
	pokemon ba;
	boolean dead;
	int y;
	pokemon s1;
	pokemon s2;
	int fight;
	boolean swap = true;

	public Swap(Team t1, Team t2, int fightNum) {
		team1 = t1;
		fight = fightNum;
		if (fight == 1) {
			swapteam = te1;
			team2 = te2;
		} else if (fight == 2) {
			swapteam = te2;
			team2 = te3;
		} else if (fight == 3) {
			swapteam = te3;
			team2 = te4;
		}

		readyButton.setEnabled(false);
		back.setEnabled(false);

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

		setSize(1000, 1100);
		p1.setFont(new Font("Serif", Font.BOLD, 26));
		p2.setFont(new Font("Serif", Font.BOLD, 26));
		p3.setFont(new Font("Serif", Font.BOLD, 26));
		p4.setFont(new Font("Serif", Font.BOLD, 26));
		p5.setFont(new Font("Serif", Font.BOLD, 26));
		p6.setFont(new Font("Serif", Font.BOLD, 26));
		back.setFont(new Font("Serif", Font.BOLD, 26));
		readyButton.setFont(new Font("Serif", Font.BOLD, 26));
		no.setFont(new Font("Serif", Font.BOLD, 26));
		p1.addActionListener(this);
		p2.addActionListener(this);
		p3.addActionListener(this);
		p4.addActionListener(this);
		p5.addActionListener(this);
		p6.addActionListener(this);
		back.addActionListener(this);
		readyButton.addActionListener(this);
		no.addActionListener(this);
		whole = new JPanel(new GridLayout(3, 2));

		p1.setText(swapteam.pkmn[0].name);
		setIcon(p1);
		p2.setText(swapteam.pkmn[1].name);
		setIcon(p2);
		p3.setText(swapteam.pkmn[2].name);
		setIcon(p3);

		whole.add(p1);
		whole.add(p2);
		whole.add(p3);
		whole.add(p4);
		whole.add(p5);
		whole.add(p6);
		back.setBounds(290, 0, 200, 50);
		readyButton.setBounds(490,0, 200, 50);
		no.setBounds(290, 50, 400, 50);

		JPanel bac = new JPanel(null);
		bac.add(back);
		bac.add(readyButton);
		bac.add(no);
		this.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

		add(whole);
		add(bac);
		JOptionPane.showMessageDialog(null,"Do you want to swap for any pokemon?");

	}

	public void setIcon(JButton b) {
		if (b.getText().compareTo("Lucario") == 0) {
			b.setIcon(new ImageIcon(luc));
		}
		if (b.getText().compareTo("Walrein") == 0) {
			b.setIcon(new ImageIcon(wal));
		}
		if (b.getText().compareTo("Camerupt") == 0) {
			b.setIcon(new ImageIcon(cam));
		}
		if (b.getText().compareTo("Houndoom") == 0) {
			b.setIcon(new ImageIcon(hou));
		}
		if (b.getText().compareTo("Golem") == 0) {
			b.setIcon(new ImageIcon(gol));
		}
		if (b.getText().compareTo("Lapras") == 0) {
			b.setIcon(new ImageIcon(lap));
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (swap) {
			if (e.getSource() == no) {
				team1.pkmn[0].reset();
				team1.pkmn[1].reset();
				team1.pkmn[2].reset();
				CPUFight b = new CPUFight(team1.pkmn[0], team2.pkmn[0], team1, team2, 0, fight + 1);
				b.setVisible(true);
				dispose();
			} else if (e.getSource() == readyButton) {
				team1.swap(s2, s1);
				CPUFight b = new CPUFight(team1.pkmn[0], team2.pkmn[0], team1, team2, 0, fight + 1);
				b.setVisible(true);
				dispose();
			} else if (e.getActionCommand() == "Back") {
				back.setEnabled(false);
				p1.setText(swapteam.pkmn[0].name);
				p2.setText(swapteam.pkmn[1].name);
				p3.setText(swapteam.pkmn[2].name);
				setIcon(p1);
				setIcon(p2);
				setIcon(p3);
			}

			if (e.getSource() == p1) {
				JOptionPane.showMessageDialog(null, "Who do you want to swap " + swapteam.pkmn[0].name + " for?");
				swap = false;
				s2 = swapteam.pkmn[0];
				back.setEnabled(true);
				p1.setText(team1.pkmn[0].name);
				p2.setText(team1.pkmn[1].name);
				p3.setText(team1.pkmn[2].name);
				setIcon(p1);
				setIcon(p2);
				setIcon(p3);
			}
			if (e.getSource() == p2) {
				JOptionPane.showMessageDialog(null, "Who do you want to swap " + swapteam.pkmn[1].name + " for?");
				swap = false;
				s2 = swapteam.pkmn[1];
				back.setEnabled(true);
				p1.setText(team1.pkmn[0].name);
				p2.setText(team1.pkmn[1].name);
				p3.setText(team1.pkmn[2].name);
				setIcon(p1);
				setIcon(p2);
				setIcon(p3);
			}
			if (e.getSource() == p3) {
				JOptionPane.showMessageDialog(null, "Who do you want to swap " + swapteam.pkmn[2].name + " for?");
				swap = false;
				s2 = swapteam.pkmn[2];
				back.setEnabled(true);
				p1.setText(team1.pkmn[0].name);
				p2.setText(team1.pkmn[1].name);
				p3.setText(team1.pkmn[2].name);
				setIcon(p1);
				setIcon(p2);
				setIcon(p3);
			}

		} else {
			if (e.getSource() == p1) {
				p1.setEnabled(false);
				p2.setEnabled(true);
				p3.setEnabled(true);
				s1 = team1.pkmn[0];
				back.setEnabled(true);
				readyButton.setEnabled(true);
			}
			if (e.getSource() == p2) {
				p1.setEnabled(true);
				p2.setEnabled(false);
				p3.setEnabled(true);
				s1 = team1.pkmn[1];
				back.setEnabled(true);
				readyButton.setEnabled(true);
			}
			if (e.getSource() == p3) {
				p1.setEnabled(true);
				p2.setEnabled(true);
				p3.setEnabled(false);
				s1 = team1.pkmn[2];
				back.setEnabled(true);
				readyButton.setEnabled(true);
			}
			if (e.getSource() == no) {
				team1.pkmn[0].reset();
				team1.pkmn[1].reset();
				team1.pkmn[2].reset();
				CPUFight b = new CPUFight(team1.pkmn[0], team2.pkmn[0], team1, team2, 0, fight + 1);
				b.setVisible(true);
				dispose();
			} else if (e.getSource() == readyButton) {
				team1.swap(s1, s2);
				team1.pkmn[0].reset();
				team1.pkmn[1].reset();
				team1.pkmn[2].reset();
				CPUFight b = new CPUFight(team1.pkmn[0], team2.pkmn[0], team1, team2, 0, fight + 1);
				b.setVisible(true);
				dispose();
			} else if (e.getActionCommand() == "Back") {
				back.setEnabled(false);
				p1.setText(swapteam.pkmn[0].name);
				p2.setText(swapteam.pkmn[1].name);
				p3.setText(swapteam.pkmn[2].name);
				setIcon(p1);
				setIcon(p2);
				setIcon(p3);
				swap=true;
				s2=null;
			}
		}

	}
}
