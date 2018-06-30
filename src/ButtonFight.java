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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ButtonFight extends JFrame implements ActionListener {

	// Creating all the components of the GUI
	public JButton fightButton1;
	public JButton pkmnButton2;
	public JButton bagButton3;
	public JButton runButton4;
	public JLabel label;
	public JPanel top;
	public JPanel bot;
	public JLabel turnLabel;
	public JLabel otherLabel;
	public JLabel eventLabel;

	ImageIcon turnImage;
	ImageIcon otherImage;
	Image luc = null;
	Image lap = null;
	Image wal = null;
	Image hou = null;
	Image cam = null;
	Image gol = null;
	Image back = null;

	JLabel tPicLabel;
	JLabel oPicLabel;

	// Pokemon information
	pokemon turn;
	pokemon other;

	String t1;
	String t2;

	Team turnTeam;
	Team otherTeam;

	SwitchScreen s;

	boolean mainScreen = true;
	int x = 1000;
	int y = 0;

	public ButtonFight(pokemon p1, pokemon p2, Team te1, Team te2) {
		// Creating all the icons
		try {
			luc = ImageIO.read(getClass().getResource("icons/Lucario.png"));
			lap = ImageIO.read(getClass().getResource("icons/250px-131Lapras.png"));
			gol = ImageIO.read(getClass().getResource("icons/golem.png"));
			wal = ImageIO.read(getClass().getResource("icons/walrein.png"));
			cam = ImageIO.read(getClass().getResource("icons/Camerupt.png"));
			hou = ImageIO.read(getClass().getResource("icons/250px-229Houndoom.png"));
			back = ImageIO.read(getClass().getResource("icons/background.jpg"));
			this.setContentPane(new JLabel(new ImageIcon(back)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Finding out whose turn it is
		if (te1.isTurn) {
			turn = p1;
			other = p2;
			t1 = turn.name;
			t2 = other.name;
			turnTeam = te1;
			otherTeam = te2;

		} else {
			turn = p2;
			other = p1;
			t2 = turn.name;
			t1 = other.name;
			turnTeam = te2;
			otherTeam = te1;
		}
		// Getting the right icons for pokemon
		if (turn.name.compareTo("Lucario") == 0) {
			turnImage = (new ImageIcon(luc));
		}
		if (turn.name.compareTo("Walrein") == 0) {
			turnImage = new ImageIcon(wal);
		}
		if (turn.name.compareTo("Lapras") == 0) {
			turnImage = new ImageIcon(lap);
		}
		if (turn.name.compareTo("Golem") == 0) {
			turnImage = new ImageIcon(gol);
		}
		if (turn.name.compareTo("Houndoom") == 0) {
			turnImage = new ImageIcon(hou);
		}
		if (turn.name.compareTo("Camerupt") == 0) {
			turnImage = new ImageIcon(cam);
		}

		if (other.name.compareTo("Lucario") == 0) {
			otherImage = new ImageIcon(luc);
		}
		if (other.name.compareTo("Walrein") == 0) {
			otherImage = new ImageIcon(wal);
		}
		if (other.name.compareTo("Lapras") == 0) {
			otherImage = new ImageIcon(lap);
		}
		if (other.name.compareTo("Golem") == 0) {
			otherImage = new ImageIcon(gol);
		}
		if (other.name.compareTo("Houndoom") == 0) {
			otherImage = new ImageIcon(hou);
		}
		if (other.name.compareTo("Camerupt") == 0) {
			otherImage = new ImageIcon(cam);
		}
		// Setting up the GUI
		this.setLayout(null);
		setSize(1000, 1000);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("What should " + turn.name + " do?");
		turnLabel = new JLabel(turn.name + ": " + turn.HP + "/" + turn.maxHP + " HP");
		otherLabel = new JLabel(other.name + ": " + other.HP + "/" + other.maxHP + " HP");
		eventLabel = new JLabel("");
		eventLabel.setFont(new Font("Serif", Font.BOLD, 24));
		eventLabel.setBounds(400, 520, 400, 100);
		label.setFont(new Font("Serif", Font.BOLD, 26));
		label.setBounds(350, 650, 400, 40);
		turnLabel.setFont(new Font("Serif", Font.BOLD, 26));
		turnLabel.setBounds(650, 400, 350, 35);
		otherLabel.setFont(new Font("Serif", Font.BOLD, 26));
		otherLabel.setBounds(100, 100, 350, 35);
		fightButton1 = new JButton("Fight");
		pkmnButton2 = new JButton("Pokemon");
		bagButton3 = new JButton("Bag");
		runButton4 = new JButton("Run");
		fightButton1.setBounds(280, 750, 200, 50);
		pkmnButton2.setBounds(500, 750, 200, 50);
		bagButton3.setBounds(280, 800, 200, 50);
		runButton4.setBounds(500, 800, 200, 50);
		turnLabel.setForeground(new Color(255, 255, 255));
		otherLabel.setForeground(new Color(255, 255, 255));
		otherLabel.setBackground(new Color(255, 255, 255));
		fightButton1.setFont(new Font("Serif", Font.BOLD, 18));
		pkmnButton2.setFont(new Font("Serif", Font.BOLD, 18));
		bagButton3.setFont(new Font("Serif", Font.BOLD, 18));
		runButton4.setFont((new Font("Serif", Font.BOLD, 18)));
		fightButton1.addActionListener(this);
		pkmnButton2.addActionListener(this);
		bagButton3.addActionListener(this);
		runButton4.addActionListener(this);

		// Adding the components to the GUI
		this.add(otherLabel);
		this.add(turnLabel);
		this.add(eventLabel);
		this.add(label);
		this.add(fightButton1);
		this.add(pkmnButton2);
		this.add(bagButton3);
		this.add(runButton4);
		tPicLabel = new JLabel(turnImage);
		tPicLabel.setBounds(0, 100, 500, 500);
		this.add(tPicLabel);
		oPicLabel = new JLabel(otherImage);
		oPicLabel.setBounds(500, 0, 500, 350);
		this.add(oPicLabel);

	}

	public void actionPerformed(ActionEvent e) {
		// If the main screen
		if (mainScreen) {
			// Fight
			if (e.getSource() == fightButton1) {
				label.setBounds(325, 650, 400, 40);
				label.setText("What move should " + turn.name + " use?");
				fightButton1.setText(turn.showMove1());
				pkmnButton2.setText(turn.showMove2());
				pkmnButton2.setIcon(null);
				bagButton3.setText(turn.showMove3());
				runButton4.setText(turn.showMove4());
				mainScreen = false;
			}
			// Pokemon
			if (e.getSource() == pkmnButton2) {
				if (turnTeam.alive() == 1) {
					JOptionPane.showMessageDialog(null, "No other pokemon can fight!");
				} else {
					s = new SwitchScreen(turnTeam, turn, otherTeam, other, false);
					s.setVisible(true);
					dispose();
				}
			}
			// Bag
			if (e.getSource() == bagButton3) {
				JOptionPane.showMessageDialog(null, "Not ready yet");
			}
			// Run
			if (e.getSource() == runButton4) {
				JOptionPane.showMessageDialog(null, "Can't do that!");
			}
		} else {
			// First move
			if (e.getSource() == fightButton1) {
				eventLabel.setText(turn.move1(other));
				// if pokemon fainted
				if (other.HP <= 0) {
					// if no more pokemon left
					if (otherTeam.alive() == 0) {
						if (other.name.compareTo(t1) == 0) {
							JOptionPane.showMessageDialog(null, other.name + " fainted!\nPlayer 2 wins!");
						} else {
							JOptionPane.showMessageDialog(null, other.name + " fainted!\nPlayer 1 wins!");
						}
						System.exit(0);
					}
					// if pokemon left
					JOptionPane.showMessageDialog(null, other.name + " fainted!\nWhich pokemon should replace it?");
					// getting the switch
					s = new SwitchScreen(otherTeam, other, turnTeam, turn, true);
					s.setVisible(true);
					dispose();

				} else {
					pokemon temp = turn;
					turn = other;
					other = temp;
				}
				ImageIcon tempi = turnImage;
				turnImage = otherImage;
				otherImage = tempi;
				tPicLabel.setIcon(turnImage);
				oPicLabel.setIcon(otherImage);
				turnTeam.isTurn = !turnTeam.isTurn;
				otherTeam.isTurn = !otherTeam.isTurn;
				Team temp2 = turnTeam;
				turnTeam = otherTeam;
				otherTeam = temp2;
				mainScreen = true;
				fightButton1.setText("Fight");
				pkmnButton2.setText("Pokemon");

				bagButton3.setText("Bag");
				runButton4.setText("Run");
				label.setText("What should " + turn.name + " do?");
				label.setBounds(350, 650, 400, 40);
				turnLabel.setText(turn.name + ": " + turn.HP + "/" + turn.maxHP + " HP");
				otherLabel.setText(other.name + ": " + other.HP + "/" + other.maxHP + " HP");

			} else if (e.getSource() == pkmnButton2) {
				eventLabel.setText(turn.move2(other));
				if (other.HP <= 0) {
					if (otherTeam.alive() == 0) {
						if (other.name.compareTo(t1) == 0) {
							JOptionPane.showMessageDialog(null, other.name + " fainted!\nPlayer 2 wins!");
						} else {
							JOptionPane.showMessageDialog(null, other.name + " fainted!\nPlayer 1 wins!");
						}
						System.exit(0);
					}
					JOptionPane.showMessageDialog(null, other.name + " fainted!\nWhich pokemon should replace it?");
					s = new SwitchScreen(otherTeam, other, turnTeam, turn, true);
					s.setVisible(true);
					dispose();

				} else {
					pokemon temp = turn;
					turn = other;
					other = temp;
				}
				ImageIcon tempi = turnImage;
				turnImage = otherImage;
				otherImage = tempi;
				tPicLabel.setIcon(turnImage);
				oPicLabel.setIcon(otherImage);
				turnTeam.isTurn = !turnTeam.isTurn;
				otherTeam.isTurn = !otherTeam.isTurn;
				Team temp2 = turnTeam;
				turnTeam = otherTeam;
				otherTeam = temp2;
				mainScreen = true;
				fightButton1.setText("Fight");
				pkmnButton2.setText("Pokemon");

				bagButton3.setText("Bag");
				runButton4.setText("Run");
				label.setBounds(350, 650, 400, 40);
				label.setText("What should " + turn.name + " do?");
				turnLabel.setText(turn.name + ": " + turn.HP + "/" + turn.maxHP + " HP");
				otherLabel.setText(other.name + ": " + other.HP + "/" + other.maxHP + " HP");

			} else if (e.getSource() == bagButton3) {
				eventLabel.setText(turn.move3(other));
				if (other.HP <= 0) {
					if (otherTeam.alive() == 0) {
						if (other.name.compareTo(t1) == 0) {
							JOptionPane.showMessageDialog(null, other.name + " fainted!\nPlayer 2 wins!");
						} else {
							JOptionPane.showMessageDialog(null, other.name + " fainted!\nPlayer 1 wins!");
						}
						System.exit(0);
					}
					JOptionPane.showMessageDialog(null, other.name + " fainted!\nWhich pokemon should replace it?");
					s = new SwitchScreen(otherTeam, other, turnTeam, turn, true);
					s.setVisible(true);
					dispose();

				} else {
					pokemon temp = turn;
					turn = other;
					other = temp;
				}
				ImageIcon tempi = turnImage;
				turnImage = otherImage;
				otherImage = tempi;
				tPicLabel.setIcon(turnImage);
				oPicLabel.setIcon(otherImage);
				turnTeam.isTurn = !turnTeam.isTurn;
				otherTeam.isTurn = !otherTeam.isTurn;
				Team temp2 = turnTeam;
				turnTeam = otherTeam;
				otherTeam = temp2;
				mainScreen = true;
				fightButton1.setText("Fight");
				pkmnButton2.setText("Pokemon");

				bagButton3.setText("Bag");
				runButton4.setText("Run");
				label.setBounds(350, 650, 400, 40);
				label.setText("What should " + turn.name + " do?");
				turnLabel.setText(turn.name + ": " + turn.HP + "/" + turn.maxHP + " HP");
				otherLabel.setText(other.name + ": " + other.HP + "/" + other.maxHP + "HP");

			} else if (e.getSource() == runButton4) {
				eventLabel.setText(turn.move4(other));
				if (other.HP <= 0) {
					if (otherTeam.alive() == 0) {
						if (other.name.compareTo(t1) == 0) {
							JOptionPane.showMessageDialog(null, other.name + " fainted!\nPlayer 2 wins!");
						} else {
							JOptionPane.showMessageDialog(null, other.name + " fainted!\nPlayer 1 wins!");
						}
						System.exit(0);
					}
					JOptionPane.showMessageDialog(null, other.name + " fainted!\nWhich pokemon should replace it?");
					s = new SwitchScreen(otherTeam, other, turnTeam, turn, true);
					s.setVisible(true);
					dispose();

				} else {
					pokemon temp = turn;
					turn = other;
					other = temp;
				}
				ImageIcon tempi = turnImage;
				turnImage = otherImage;
				otherImage = tempi;
				tPicLabel.setIcon(turnImage);
				oPicLabel.setIcon(otherImage);
				turnTeam.isTurn = !turnTeam.isTurn;
				otherTeam.isTurn = !otherTeam.isTurn;
				Team temp2 = turnTeam;
				turnTeam = otherTeam;
				otherTeam = temp2;
				mainScreen = true;
				fightButton1.setText("Fight");
				pkmnButton2.setText("Pokemon");

				bagButton3.setText("Bag");
				runButton4.setText("Run");
				label.setBounds(350, 650, 400, 40);
				label.setText("What should " + turn.name + " do?");
				turnLabel.setText(turn.name + ": " + turn.HP + "/" + turn.maxHP + " HP");
				otherLabel.setText(other.name + ": " + other.HP + "/" + other.maxHP + " HP");

			}

		}

	}

}
