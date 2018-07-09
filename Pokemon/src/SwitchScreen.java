import javax.imageio.ImageIO;
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

public class SwitchScreen extends JFrame implements ActionListener {
	//GUI components
	private JButton p1 = new JButton("");
	private JButton p2 = new JButton("");
	private JButton p3 = new JButton("");
	private JButton p4 = new JButton("");
	private JButton p5 = new JButton("");
	private JButton p6 = new JButton("");
	
	private JPanel whole;
	//Images
	Image luc=null;
	Image lap=null;
	Image wal=null;
	Image hou=null;
	Image cam=null;
	Image gol=null;
	
	Team team1;
	Team team2;
	pokemon turn;
	pokemon other;
	boolean dead;

	public SwitchScreen(Team t1, pokemon pk1, Team t2, pokemon pk2, boolean ded) {
		//setting up images
		try {
			luc = ImageIO.read(getClass().getResource("icons/Lucario.png"));
			lap= ImageIO.read(getClass().getResource("icons/250px-131Lapras.png"));
			gol=ImageIO.read(getClass().getResource("icons/golem.png"));
			wal=ImageIO.read(getClass().getResource("icons/walrein.png"));
			cam=ImageIO.read(getClass().getResource("icons/Camerupt.png"));
			hou=ImageIO.read(getClass().getResource("icons/250px-229Houndoom.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dead = ded;
		team1 = t1;
		turn = pk1;
		team2 = t2;
		other = pk2;
		//setting up GUI
		setSize(1000, 1000);
		p1.setFont(new Font("Serif", Font.BOLD, 26));
		p2.setFont(new Font("Serif", Font.BOLD, 26));
		p3.setFont(new Font("Serif", Font.BOLD, 26));
		p4.setFont(new Font("Serif", Font.BOLD, 26));
		p5.setFont(new Font("Serif", Font.BOLD, 26));
		p6.setFont(new Font("Serif", Font.BOLD, 26));
		
		p1.addActionListener(this);
		p2.addActionListener(this);
		p3.addActionListener(this);
		p4.addActionListener(this);
		p5.addActionListener(this);
		p6.addActionListener(this);

		whole = new JPanel(new GridLayout(3, 2));
		//setting up the screen with labels and images
		if (t1.pkmn[0] != null) {
			p1.setText(t1.pkmn[0].name);
			if(p1.getText().compareTo("Lucario")==0) {
				p1.setIcon(new ImageIcon(luc));
			}
			if(p1.getText().compareTo("Walrein")==0) {
				p1.setIcon(new ImageIcon(wal));
			}
			if(p1.getText().compareTo("Camerupt")==0) {
				p1.setIcon(new ImageIcon(cam));
			}
			if(p1.getText().compareTo("Houndoom")==0) {
				p1.setIcon(new ImageIcon(hou));
			}
			if(p1.getText().compareTo("Golem")==0) {
				p1.setIcon(new ImageIcon(gol));
			}
			if(p1.getText().compareTo("Lapras")==0) {
				p1.setIcon(new ImageIcon(lap));
			}
			
		}
		if (t1.pkmn[1] != null) {
			p2.setText(t1.pkmn[1].name);
			if(p2.getText().compareTo("Lucario")==0) {
				p2.setIcon(new ImageIcon(luc));
			}
			if(p2.getText().compareTo("Walrein")==0) {
				p2.setIcon(new ImageIcon(wal));
			}
			if(p2.getText().compareTo("Camerupt")==0) {
				p2.setIcon(new ImageIcon(cam));
			}
			if(p2.getText().compareTo("Houndoom")==0) {
				p2.setIcon(new ImageIcon(hou));
			}
			if(p2.getText().compareTo("Golem")==0) {
				p2.setIcon(new ImageIcon(gol));
			}
			if(p2.getText().compareTo("Lapras")==0) {
				p2.setIcon(new ImageIcon(lap));
			}
		}
		if (t1.pkmn[2] != null) {
			p3.setText(t1.pkmn[2].name);
			if(p3.getText().compareTo("Lucario")==0) {
				p3.setIcon(new ImageIcon(luc));
			}
			if(p3.getText().compareTo("Walrein")==0) {
				p3.setIcon(new ImageIcon(wal));
			}
			if(p3.getText().compareTo("Camerupt")==0) {
				p3.setIcon(new ImageIcon(cam));
			}
			if(p3.getText().compareTo("Houndoom")==0) {
				p3.setIcon(new ImageIcon(hou));
			}
			if(p3.getText().compareTo("Golem")==0) {
				p3.setIcon(new ImageIcon(gol));
			}
			if(p3.getText().compareTo("Lapras")==0) {
				p3.setIcon(new ImageIcon(lap));
			}
		}
		if (t1.pkmn[3] != null) {
			p4.setText(t1.pkmn[3].name);
			if(p4.getText().compareTo("Lucario")==0) {
				p4.setIcon(new ImageIcon(luc));
			}
			if(p4.getText().compareTo("Walrein")==0) {
				p4.setIcon(new ImageIcon(wal));
			}
			if(p4.getText().compareTo("Camerupt")==0) {
				p4.setIcon(new ImageIcon(cam));
			}
			if(p4.getText().compareTo("Houndoom")==0) {
				p4.setIcon(new ImageIcon(hou));
			}
			if(p4.getText().compareTo("Golem")==0) {
				p4.setIcon(new ImageIcon(gol));
			}
			if(p4.getText().compareTo("Lapras")==0) {
				p4.setIcon(new ImageIcon(lap));
			}
		}
		if (t1.pkmn[4] != null) {
			p5.setText(t1.pkmn[4].name);
			if(p5.getText().compareTo("Lucario")==0) {
				p5.setIcon(new ImageIcon(luc));
			}
			if(p5.getText().compareTo("Walrein")==0) {
				p5.setIcon(new ImageIcon(wal));
			}
			if(p5.getText().compareTo("Camerupt")==0) {
				p5.setIcon(new ImageIcon(cam));
			}
			if(p5.getText().compareTo("Houndoom")==0) {
				p5.setIcon(new ImageIcon(hou));
			}
			if(p5.getText().compareTo("Golem")==0) {
				p5.setIcon(new ImageIcon(gol));
			}
			if(p5.getText().compareTo("Lapras")==0) {
				p5.setIcon(new ImageIcon(lap));
			}
		}
		if (t1.pkmn[5] != null) {
			p6.setText(t1.pkmn[5].name);
			if(p6.getText().compareTo("Lucario")==0) {
				p6.setIcon(new ImageIcon(luc));
			}
			if(p6.getText().compareTo("Walrein")==0) {
				p6.setIcon(new ImageIcon(wal));
			}
			if(p6.getText().compareTo("Camerupt")==0) {
				p6.setIcon(new ImageIcon(cam));
			}
			if(p6.getText().compareTo("Houndoom")==0) {
				p6.setIcon(new ImageIcon(hou));
			}
			if(p6.getText().compareTo("Golem")==0) {
				p6.setIcon(new ImageIcon(gol));
			}
			if(p6.getText().compareTo("Lapras")==0) {
				p6.setIcon(new ImageIcon(lap));
			}
		}
		whole.add(p1);
		whole.add(p2);
		whole.add(p3);
		whole.add(p4);
		whole.add(p5);
		whole.add(p6);
		add(whole);

	}

	public void actionPerformed(ActionEvent e) {
		//
		if (e.getActionCommand() == "") {

		} else if (e.getSource() == p1 && team1.pkmn[0].HP <= 0) {
			JOptionPane.showMessageDialog(null, team1.pkmn[0].name + " has no energy left to fight");
		} else if (e.getSource() == p2 && team1.pkmn[1].HP <= 0) {
			JOptionPane.showMessageDialog(null, team1.pkmn[1].name + " has no energy left to fight");
		} else if (e.getSource() == p3 && team1.pkmn[2].HP <= 0) {
			JOptionPane.showMessageDialog(null, team1.pkmn[2].name + " has no energy left to fight");
		} else if (e.getSource() == p4 && team1.pkmn[3].HP <= 0) {
			JOptionPane.showMessageDialog(null, team1.pkmn[3].name + " has no energy left to fight");
		} else if (e.getSource() == p5 && team1.pkmn[4].HP <= 0) {
			JOptionPane.showMessageDialog(null, team1.pkmn[4].name + " has no energy left to fight");
		} else if (e.getSource() == p6 && team1.pkmn[5].HP <= 0) {
			JOptionPane.showMessageDialog(null, team1.pkmn[5].name + " has no energy left to fight");
		} else if (e.getSource() == p1 && team1.pkmn[0] == turn) {
			JOptionPane.showMessageDialog(null, team1.pkmn[0].name + " is already in battle");
		} else if (e.getSource() == p2 && team1.pkmn[1] == turn) {
			JOptionPane.showMessageDialog(null, team1.pkmn[1].name + " is already in battle");
		} else if (e.getSource() == p3 && team1.pkmn[2] == turn) {
			JOptionPane.showMessageDialog(null, team1.pkmn[2].name + " is already in battle");
		} else if (e.getSource() == p4 && team1.pkmn[3] == turn) {
			JOptionPane.showMessageDialog(null, team1.pkmn[3].name + " is already in battle");
		} else if (e.getSource() == p5 && team1.pkmn[4] == turn) {
			JOptionPane.showMessageDialog(null, team1.pkmn[4].name + " is already in battle");
		} else if (e.getSource() == p6 && team1.pkmn[5] == turn) {
			JOptionPane.showMessageDialog(null, team1.pkmn[5].name + " is already in battle");
		} else if (e.getSource() == p6) {
			turn = team1.pkmn[5];
			if (!dead) {
				team1.isTurn = !team1.isTurn;
				team2.isTurn = !team2.isTurn;
			}
			ButtonFight b = new ButtonFight(turn, other, team1, team2);
			b.setVisible(true);
			dispose();

		} else if (e.getSource() == p5) {
			turn = team1.pkmn[4];
			if (!dead) {
				team1.isTurn = !team1.isTurn;
				team2.isTurn = !team2.isTurn;
			}
			ButtonFight b = new ButtonFight(turn,other, team1, team2);
			b.setVisible(true);
			dispose();

		} else if (e.getSource() == p4) {
			turn = team1.pkmn[3];
			if (!dead) {
				team1.isTurn = !team1.isTurn;
				team2.isTurn = !team2.isTurn;
			}
			ButtonFight b = new ButtonFight(turn,other, team1, team2);
			b.setVisible(true);
			dispose();

		} else if (e.getSource() == p3) {
			turn = team1.pkmn[2];
			if (!dead) {
				team1.isTurn = !team1.isTurn;
				team2.isTurn = !team2.isTurn;
			}
			ButtonFight b = new ButtonFight(turn,other, team1, team2);
			b.setVisible(true);
			dispose();

		} else if (e.getSource() == p2) {
			turn = team1.pkmn[1];
			if (!dead) {
				team1.isTurn = !team1.isTurn;
				team2.isTurn = !team2.isTurn;
			}
			ButtonFight b = new ButtonFight(turn, other, team1, team2);
			b.setVisible(true);
			dispose();

		} else if (e.getSource() == p1) {
			turn = team1.pkmn[0];
			if (!dead) {
				team1.isTurn = !team1.isTurn;
				team2.isTurn = !team2.isTurn;
			}
			ButtonFight b = new ButtonFight(turn, other, team1, team2);
			b.setVisible(true);
			dispose();

		}

	}

}
