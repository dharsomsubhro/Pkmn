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

public class ButtonFight extends JFrame implements ActionListener {

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

	Image img=null;
	ImageIcon turnImage;
	ImageIcon otherImage;
	Image luc=null;
	Image lap=null;
	Image wal=null;
	Image hou=null;
	Image cam=null;
	Image gol=null;
	
	public ButtonFight(pokemon p1, pokemon p2, Team te1, Team te2) {
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
		if(turn.name.compareTo("Lucario")==0) {
			turnImage=(new ImageIcon(luc));
		}
		if(turn.name.compareTo("Walrein")==0) {
			turnImage=new ImageIcon(wal);
		}
		if(turn.name.compareTo("Lapras")==0) {
			turnImage=new ImageIcon(lap);
		}
		if(turn.name.compareTo("Golem")==0) {
			turnImage=new ImageIcon(gol);
		}
		if(turn.name.compareTo("Houndoom")==0) {
			turnImage=new ImageIcon(hou);
		}
		if(turn.name.compareTo("Camerupt")==0) {
			turnImage=new ImageIcon(cam);
		}
		
		if(other.name.compareTo("Lucario")==0) {
			otherImage=new ImageIcon(luc);
		}
		if(other.name.compareTo("Walrein")==0) {
			otherImage=new ImageIcon(wal);
		}
		if(other.name.compareTo("Lapras")==0) {
			otherImage=new ImageIcon(lap);
		}
		if(other.name.compareTo("Golem")==0) {
			otherImage=new ImageIcon(gol);
		}
		if(other.name.compareTo("Houndoom")==0) {
			otherImage=new ImageIcon(hou);
		}
		if(other.name.compareTo("Camerupt")==0) {
			otherImage=new ImageIcon(cam);
		}
		JPanel whole = new JPanel();
		whole.setLayout(null);
		setSize(1000, 1000);
		this.add(whole);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("What should " + turn.name + " do?");
		turnLabel=new JLabel(turn.name+": "+turn.HP+"/"+turn.maxHP);
		otherLabel=new JLabel(other.name+": "+other.HP+"/"+other.maxHP);
		eventLabel=new JLabel("");
		eventLabel.setFont(new Font("Serif", Font.BOLD, 18));
		eventLabel.setBounds(180,300, 400,100);
		label.setFont(new Font("Serif", Font.BOLD, 26));
		label.setBounds(350,650,400,40);
		turnLabel.setFont(new Font("Serif", Font.BOLD, 26));
		turnLabel.setBounds(580,550,200,35);
		otherLabel.setFont(new Font("Serif", Font.BOLD, 26));
		otherLabel.setBounds(100, 100, 200,35);
		fightButton1 = new JButton("Fight");
		pkmnButton2 = new JButton("Pokemon");
		
		try {
			img = ImageIO.read(getClass().getResource("icons/pokeball.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pkmnButton2.setIcon(new ImageIcon(img));
		bagButton3 = new JButton("Bag");
		runButton4 = new JButton("Run");
		fightButton1.setBounds(280, 750, 200, 50);
		pkmnButton2.setBounds(500,750,200,50);
		bagButton3.setBounds(280,800,200,50);
		runButton4.setBounds(500,800,200,50);
		fightButton1.setFont(new Font("Serif", Font.BOLD, 18));
		pkmnButton2.setFont(new Font("Serif", Font.BOLD, 18));
		bagButton3.setFont(new Font("Serif", Font.BOLD, 18));
		runButton4.setFont((new Font("Serif", Font.BOLD, 18)));
		fightButton1.addActionListener(this);
		pkmnButton2.addActionListener(this);
		bagButton3.addActionListener(this);
		runButton4.addActionListener(this);
		whole.add(otherLabel);
		whole.add(turnLabel);
		whole.add(eventLabel);
		whole.add(label);
		whole.add(fightButton1);
		whole.add(pkmnButton2);
		whole.add(bagButton3);
		whole.add(runButton4);
		JLabel tPicLabel=new JLabel(turnImage);
		tPicLabel.setBounds(50, 250, 500, 500);
		whole.add(tPicLabel);
		JLabel oPicLabel=new JLabel(otherImage);
		oPicLabel.setBounds(450, 50, 500, 500);
		whole.add(oPicLabel);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		if (mainScreen) {
			if (e.getSource() == fightButton1) {
				label.setBounds(325,650,400,40);
				label.setText("What move should " + turn.name + " use?");
				fightButton1.setText(turn.showMove1());
				pkmnButton2.setText(turn.showMove2());
				pkmnButton2.setIcon(null);
				bagButton3.setText(turn.showMove3());
				runButton4.setText(turn.showMove4());
				mainScreen = false;
			}
			if (e.getSource() == pkmnButton2) {
				s = new SwitchScreen(turnTeam, turn, otherTeam, other, false);
				s.setVisible(true);
				dispose();
			}
			if (e.getSource() == bagButton3) {
				JOptionPane.showMessageDialog(null, "Not ready yet");
			}
			if (e.getSource() == runButton4) {
				JOptionPane.showMessageDialog(null, "Can't do that!");
			}
		} else {
			if (e.getSource() == fightButton1) {
				eventLabel.setText(turn.move1(other));
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
				turnTeam.isTurn = !turnTeam.isTurn;
				otherTeam.isTurn = !otherTeam.isTurn;
				Team temp2 = turnTeam;
				turnTeam = otherTeam;
				otherTeam = temp2;
				mainScreen = true;
				fightButton1.setText("Fight");
				pkmnButton2.setText("Pokemon");
				pkmnButton2.setIcon(new ImageIcon(img));
				bagButton3.setText("Bag");
				runButton4.setText("Run");
				label.setText("What should " + turn.name + " do?");
				label.setBounds(350,650,400,40);
				turnLabel.setText(turn.name+": "+turn.HP+"/"+turn.maxHP);
				otherLabel.setText(other.name+": "+other.HP+"/"+other.maxHP);

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
				turnTeam.isTurn = !turnTeam.isTurn;
				otherTeam.isTurn = !otherTeam.isTurn;
				Team temp2 = turnTeam;
				turnTeam = otherTeam;
				otherTeam = temp2;
				mainScreen = true;
				fightButton1.setText("Fight");
				pkmnButton2.setText("Pokemon");
				pkmnButton2.setIcon(new ImageIcon(img));
				bagButton3.setText("Bag");
				runButton4.setText("Run");
				label.setBounds(350,650,400,40);
				label.setText("What should " + turn.name + " do?");
				turnLabel.setText(turn.name+": "+turn.HP+"/"+turn.maxHP);
				otherLabel.setText(other.name+": "+other.HP+"/"+other.maxHP);

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
				turnTeam.isTurn = !turnTeam.isTurn;
				otherTeam.isTurn = !otherTeam.isTurn;
				Team temp2 = turnTeam;
				turnTeam = otherTeam;
				otherTeam = temp2;
				mainScreen = true;
				fightButton1.setText("Fight");
				pkmnButton2.setText("Pokemon");
				pkmnButton2.setIcon(new ImageIcon(img));
				bagButton3.setText("Bag");
				runButton4.setText("Run");
				label.setBounds(350,650,400,40);
				label.setText("What should " + turn.name + " do?");
				turnLabel.setText(turn.name+": "+turn.HP+"/"+turn.maxHP);
				otherLabel.setText(other.name+": "+other.HP+"/"+other.maxHP);

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
				turnTeam.isTurn = !turnTeam.isTurn;
				otherTeam.isTurn = !otherTeam.isTurn;
				Team temp2 = turnTeam;
				turnTeam = otherTeam;
				otherTeam = temp2;
				mainScreen = true;
				fightButton1.setText("Fight");
				pkmnButton2.setText("Pokemon");
				pkmnButton2.setIcon(new ImageIcon(img));
				bagButton3.setText("Bag");
				runButton4.setText("Run");
				label.setBounds(350,650,400,40);
				label.setText("What should " + turn.name + " do?");
				turnLabel.setText(turn.name+": "+turn.HP+"/"+turn.maxHP);
				otherLabel.setText(other.name+": "+other.HP+"/"+other.maxHP);

			}

		}

	}

}
