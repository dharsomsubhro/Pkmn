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

public class CPUSwitch extends JFrame implements ActionListener {

	public JButton p1 = new JButton("");
	public JButton p2 = new JButton("");
	public JButton p3 = new JButton("");
	public JButton p4 = new JButton("");
	public JButton p5 = new JButton("");
	public JButton p6 = new JButton("");
	public JButton back = new JButton("Back");
	public JPanel whole;

	Image luc = null;
	Image lap = null;
	Image wal = null;
	Image hou = null;
	Image cam = null;
	Image gol = null;
	Image cra = null;
	Image el = null;
	Image esp = null;
	Image ge = null;
	Image br = null;
	Image ma = null;

	Team team1;
	Team team2;
	pokemon turn;
	pokemon other;
	pokemon ba;
	boolean dead;
	int y;
	int fight;

	public CPUSwitch(Team t1, pokemon pk1, Team t2, pokemon pk2, boolean ded, int x, pokemon b, int f) {
		fight=f;
		y = x;
		try {
			luc = ImageIO.read(getClass().getResource("/icons/Lucario.png"));
			lap = ImageIO.read(getClass().getResource("/icons/250px-131Lapras.png"));
			gol = ImageIO.read(getClass().getResource("/icons/golem.png"));
			wal = ImageIO.read(getClass().getResource("/icons/walrein.png"));
			cam = ImageIO.read(getClass().getResource("/icons/Camerupt.png"));
			hou = ImageIO.read(getClass().getResource("/icons/250px-229Houndoom.png"));
			cra = ImageIO.read(getClass().getResource("/icons/250px-346Cradily.png"));
			br = ImageIO.read(getClass().getResource("/icons/250px-286Breloom.png"));
			el = ImageIO.read(getClass().getResource("/icons/250px-466Electivire.png"));
			esp = ImageIO.read(getClass().getResource("/icons/250px-196Espeon.png"));
			ma = ImageIO.read(getClass().getResource("/icons/250px-467Magmortar.png"));
			ge = ImageIO.read(getClass().getResource("/icons/250px-094Gengar.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
		p1.addActionListener(this);
		p2.addActionListener(this);
		p3.addActionListener(this);
		p4.addActionListener(this);
		p5.addActionListener(this);
		p6.addActionListener(this);
		back.addActionListener(this);
		whole = new JPanel(new GridLayout(3, 2));
		
		p1.setText(t1.pkmn[0].name);
		setIcon(p1);
		p2.setText(t1.pkmn[1].name);
		setIcon(p2);
		p3.setText(t1.pkmn[2].name);
		setIcon(p3);
		
		whole.add(p1);
		whole.add(p2);
		whole.add(p3);
		whole.add(p4);
		whole.add(p5);
		whole.add(p6);
		back.setBounds(380, 20, 200, 50);
		JPanel bac = new JPanel(null);
		bac.add(back);
		this.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		add(whole);
		add(bac);
		if (pk1 == null || ba == null) {
			back.setEnabled(false);
		}
		if (t1.pkmn[0] != null && t1.pkmn[0].HP <= 0) {
			p1.setEnabled(false);
		}
		if (t1.pkmn[1] != null && t1.pkmn[1].HP <= 0) {
			p2.setEnabled(false);
		}
		if (t1.pkmn[2] != null && t1.pkmn[2].HP <= 0) {
			p3.setEnabled(false);
		}
		if (t1.pkmn[3] != null && t1.pkmn[3].HP <= 0) {
			p4.setEnabled(false);
		}
		if (t1.pkmn[4] != null && t1.pkmn[4].HP <= 0) {
			p5.setEnabled(false);
		}
		if (t1.pkmn[5] != null && t1.pkmn[5].HP <= 0) {
			p6.setEnabled(false);
		}

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
		if (b.getText().compareTo("Gengar") == 0) {
			b.setIcon(new ImageIcon(ge));
		}
		if (b.getText().compareTo("Magmortar") == 0) {
			b.setIcon(new ImageIcon(ma));
		}
		if (b.getText().compareTo("Electivire") == 0) {
			b.setIcon(new ImageIcon(el));
		}
		if (b.getText().compareTo("Breloom") == 0) {
			b.setIcon(new ImageIcon(br));
		}
		if (b.getText().compareTo("Cradily") == 0) {
			b.setIcon(new ImageIcon(cra));
		}
		if (b.getText().compareTo("Espeon") == 0) {
			b.setIcon(new ImageIcon(esp));
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "Back") {
			CPUFight b = new CPUFight(turn, ba, team1, team2, 0, fight);
			b.setVisible(true);
			dispose();
		} else if (e.getActionCommand() == "") {

		} else if (e.getSource() == p6) {
			if (team1.pkmn[5] == turn) {
				JOptionPane.showMessageDialog(null, turn.name + " is already in battle!");
			} else {
				turn = team1.pkmn[5];
				if (!dead) {
					team1.isTurn = !team1.isTurn;
					team2.isTurn = !team2.isTurn;
				}
				CPUFight b = new CPUFight(turn, other, team1, team2, y, fight);
				b.setVisible(true);
				dispose();
			}
		} else if (e.getSource() == p5) {
			if (team1.pkmn[4] == turn) {
				JOptionPane.showMessageDialog(null, turn.name + " is already in battle!");
			} else {
				turn = team1.pkmn[4];
				if (!dead) {
					team1.isTurn = !team1.isTurn;
					team2.isTurn = !team2.isTurn;
				}
				CPUFight b = new CPUFight(turn, other, team1, team2, y, fight);
				b.setVisible(true);
				dispose();
			}
		} else if (e.getSource() == p4) {
			if (team1.pkmn[3] == turn) {
				JOptionPane.showMessageDialog(null, turn.name + " is already in battle!");
			} else {
				turn = team1.pkmn[3];
				if (!dead) {
					team1.isTurn = !team1.isTurn;
					team2.isTurn = !team2.isTurn;
				}
				CPUFight b = new CPUFight(turn, other, team1, team2, y, fight);
				b.setVisible(true);
				dispose();
			}
		} else if (e.getSource() == p3) {
			if (team1.pkmn[2] == turn) {
				JOptionPane.showMessageDialog(null, turn.name + " is already in battle!");
			} else {
				turn = team1.pkmn[2];
				if (!dead) {
					team1.isTurn = !team1.isTurn;
					team2.isTurn = !team2.isTurn;
				}
				CPUFight b = new CPUFight(turn, other, team1, team2, y, fight);
				b.setVisible(true);
				dispose();
			}
		} else if (e.getSource() == p2) {
			if (team1.pkmn[1] == turn) {
				JOptionPane.showMessageDialog(null, turn.name + " is already in battle!");
			} else {
				turn = team1.pkmn[1];
				if (!dead) {
					team1.isTurn = !team1.isTurn;
					team2.isTurn = !team2.isTurn;
				}
				CPUFight b = new CPUFight(turn, other, team1, team2, y, fight);
				b.setVisible(true);
				dispose();
			}
		} else if (e.getSource() == p1) {
			if (team1.pkmn[0] == turn) {
				JOptionPane.showMessageDialog(null, turn.name + " is already in battle!");
			} else {
				turn = team1.pkmn[0];
				if (!dead) {
					team1.isTurn = !team1.isTurn;
					team2.isTurn = !team2.isTurn;
				}
				CPUFight b = new CPUFight(turn, other, team1, team2, y, fight);
				b.setVisible(true);
				dispose();
			}
		}

	}

}
