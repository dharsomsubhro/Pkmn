import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CPUFight extends JFrame implements ActionListener {

	public Brain b;
	// Creating all the components of the GUI
	public JButton fightButton1;
	public JButton pkmnButton2;
	public JButton bagButton3;
	public JButton runButton4;
	public JButton backButton;
	public JLabel label;
	public JPanel top;
	public JPanel bot;
	public JLabel turnLabel;
	public JLabel otherLabel;
	public JLabel firstLabel;
	public JLabel secondLabel;

	//Images
	ImageIcon turnImage;
	ImageIcon otherImage;
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
	Image ga = null;
	Image dr = null;
	Image fl = null;
	Image ae = null;
	Image ni = null;
	Image he = null;
	Image back = null;
	Image onepk = null;
	Image twopk = null;
	Image threepk = null;
	//Pokemon HP Labels
	JLabel tPicLabel;
	JLabel oPicLabel;
	//HP Bars
	JProgressBar topHP;
	JProgressBar botHP;

	JLabel topPK;
	JLabel botPK;

	// Pokemon information
	pokemon myPk;
	pokemon otherPk;

	String t1;
	String t2;

	Team myTeam;
	Team CPUTeam;

	Team team1;
	Team team2;

	CPUSwitch s;

	boolean mainScreen = true;
	boolean cont = true;
	int y;
	int fight;

	public CPUFight(pokemon p1, pokemon p2, Team te1, Team te2, int x, int fightNum) {
		//setting up the fight
		fight = fightNum;
		myPk = p1;
		otherPk = p2;
		myTeam = te1;
		CPUTeam = te2;
		//creating a brain for cpu moves
		b = new Brain(te1, te2, p1, p2);
		//getting the value of the move to be used before anything else, if it exists
		y = x;
		//getting all the images set up
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
			ga = ImageIO.read(getClass().getResource("/icons/Gardevoir.png"));
			he = ImageIO.read(getClass().getResource("/icons/Heracross.png"));
			fl = ImageIO.read(getClass().getResource("/icons/Flygon.png"));
			dr = ImageIO.read(getClass().getResource("/icons/Dragonite.png"));
			ae = ImageIO.read(getClass().getResource("/icons/Aerodactyl.png"));
			ni = ImageIO.read(getClass().getResource("/icons/Nidoqueen.png"));
			back = ImageIO.read(getClass().getResource("icons/background.jpg"));
			this.setContentPane(new JLabel(new ImageIcon(back)));
			onepk = ImageIO.read(getClass().getResource("icons/1.png"));
			twopk = ImageIO.read(getClass().getResource("icons/2.png"));
			threepk = ImageIO.read(getClass().getResource("icons/3.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Getting the right icons for pokemon
		if (myPk.name.compareTo("Lucario") == 0) {
			turnImage = (new ImageIcon(luc));
		}
		if (myPk.name.compareTo("Walrein") == 0) {
			turnImage = new ImageIcon(wal);
		}
		if (myPk.name.compareTo("Lapras") == 0) {
			turnImage = new ImageIcon(lap);
		}
		if (myPk.name.compareTo("Golem") == 0) {
			turnImage = new ImageIcon(gol);
		}
		if (myPk.name.compareTo("Houndoom") == 0) {
			turnImage = new ImageIcon(hou);
		}
		if (myPk.name.compareTo("Camerupt") == 0) {
			turnImage = new ImageIcon(cam);
		}
		if (myPk.name.compareTo("Electivire") == 0) {
			turnImage = new ImageIcon(el);
		}
		if (myPk.name.compareTo("Cradily") == 0) {
			turnImage = new ImageIcon(cra);
		}
		if (myPk.name.compareTo("Magmortar") == 0) {
			turnImage = new ImageIcon(ma);
		}
		if (myPk.name.compareTo("Gengar") == 0) {
			turnImage = new ImageIcon(ge);
		}
		if (myPk.name.compareTo("Espeon") == 0) {
			turnImage = new ImageIcon(esp);
		}
		if (myPk.name.compareTo("Breloom") == 0) {
			turnImage = new ImageIcon(br);
		}
		if (myPk.name.compareTo("Gardevoir") == 0) {
			turnImage = new ImageIcon(ga);
		}
		if (myPk.name.compareTo("Aerodactyl") == 0) {
			turnImage = new ImageIcon(ae);
		}
		if (myPk.name.compareTo("Heracross") == 0) {
			turnImage = new ImageIcon(he);
		}
		if (myPk.name.compareTo("Nidoqueen") == 0) {
			turnImage = new ImageIcon(ni);
		}
		if (myPk.name.compareTo("Flygon") == 0) {
			turnImage = new ImageIcon(fl);
		}
		if (myPk.name.compareTo("Dragonite") == 0) {
			turnImage = new ImageIcon(dr);
		}


		if (otherPk.name.compareTo("Lucario") == 0) {
			otherImage = new ImageIcon(luc);
		}
		if (otherPk.name.compareTo("Walrein") == 0) {
			otherImage = new ImageIcon(wal);
		}
		if (otherPk.name.compareTo("Lapras") == 0) {
			otherImage = new ImageIcon(lap);
		}
		if (otherPk.name.compareTo("Golem") == 0) {
			otherImage = new ImageIcon(gol);
		}
		if (otherPk.name.compareTo("Houndoom") == 0) {
			otherImage = new ImageIcon(hou);
		}
		if (otherPk.name.compareTo("Camerupt") == 0) {
			otherImage = new ImageIcon(cam);
		}
		if (otherPk.name.compareTo("Electivire") == 0) {
			otherImage = new ImageIcon(el);
		}
		if (otherPk.name.compareTo("Cradily") == 0) {
			otherImage = new ImageIcon(cra);
		}
		if (otherPk.name.compareTo("Magmortar") == 0) {
			otherImage = new ImageIcon(ma);
		}
		if (otherPk.name.compareTo("Gengar") == 0) {
			otherImage = new ImageIcon(ge);
		}
		if (otherPk.name.compareTo("Espeon") == 0) {
			otherImage = new ImageIcon(esp);
		}
		if (otherPk.name.compareTo("Breloom") == 0) {
			otherImage = new ImageIcon(br);
		}
		if (otherPk.name.compareTo("Gardevoir") == 0) {
			otherImage = new ImageIcon(ga);
		}
		if (otherPk.name.compareTo("Aerodactyl") == 0) {
			otherImage = new ImageIcon(ae);
		}
		if (otherPk.name.compareTo("Heracross") == 0) {
			otherImage = new ImageIcon(he);
		}
		if (otherPk.name.compareTo("Nidoqueen") == 0) {
			otherImage = new ImageIcon(ni);
		}
		if (otherPk.name.compareTo("Flygon") == 0) {
			otherImage = new ImageIcon(fl);
		}
		if (otherPk.name.compareTo("Dragonite") == 0) {
			otherImage = new ImageIcon(dr);
		}
		// Setting up the GUI
		this.setLayout(null);
		setSize(1000, 1000);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		label = new JLabel("What should " + myPk.name + " do?");

		turnLabel = new JLabel(myPk.name + ": " + myPk.HP + "/" + myPk.maxHP + " HP");
		otherLabel = new JLabel(otherPk.name + ": " + otherPk.HP + "/" + otherPk.maxHP + " HP");
		firstLabel = new JLabel("");
		secondLabel = new JLabel("");
		firstLabel.setFont(new Font("Serif", Font.BOLD, 24));
		firstLabel.setBounds(200, 470, 400, 200);
		secondLabel.setFont(new Font("Serif", Font.BOLD, 24));
		secondLabel.setBounds(600, 470, 400, 200);
		label.setFont(new Font("Serif", Font.BOLD, 26));
		label.setBounds(350, 650, 400, 100);
		turnLabel.setFont(new Font("Serif", Font.BOLD, 26));
		turnLabel.setBounds(650, 400, 350, 35);
		otherLabel.setFont(new Font("Serif", Font.BOLD, 26));
		otherLabel.setBounds(100, 100, 350, 35);
		fightButton1 = new JButton("Fight");
		pkmnButton2 = new JButton("Pokemon");
		bagButton3 = new JButton("Bag");
		runButton4 = new JButton("Run");
		backButton = new JButton("Back");
		fightButton1.setBounds(280, 750, 200, 50);
		pkmnButton2.setBounds(500, 750, 200, 50);
		bagButton3.setBounds(280, 800, 200, 50);
		runButton4.setBounds(500, 800, 200, 50);
		backButton.setBounds(380, 870, 200, 50);
		turnLabel.setForeground(new Color(255, 255, 255));
		otherLabel.setForeground(new Color(255, 255, 255));
		otherLabel.setBackground(new Color(255, 255, 255));
		fightButton1.setFont(new Font("Serif", Font.BOLD, 18));
		pkmnButton2.setFont(new Font("Serif", Font.BOLD, 18));
		bagButton3.setFont(new Font("Serif", Font.BOLD, 18));
		runButton4.setFont((new Font("Serif", Font.BOLD, 18)));
		backButton.setFont((new Font("Serif", Font.BOLD, 18)));
		fightButton1.addActionListener(this);
		pkmnButton2.addActionListener(this);
		bagButton3.addActionListener(this);
		runButton4.addActionListener(this);
		backButton.addActionListener(this);

		// Adding the components to the GUI
		this.add(otherLabel);
		this.add(turnLabel);
		this.add(firstLabel);
		this.add(secondLabel);
		this.add(label);
		this.add(fightButton1);
		this.add(pkmnButton2);
		this.add(bagButton3);
		this.add(runButton4);
		this.add(backButton);
		tPicLabel = new JLabel(turnImage);
		tPicLabel.setBounds(0, 100, 500, 500);
		this.add(tPicLabel);
		oPicLabel = new JLabel(otherImage);
		oPicLabel.setBounds(500, 0, 500, 350);
		this.add(oPicLabel);
		botHP = new JProgressBar(0, myPk.maxHP);
		botHP.setBounds(650, 450, 250, 35);
		botHP.setValue(myPk.HP);
		botHP.setStringPainted(true);
		this.add(botHP);
		topHP = new JProgressBar(0, otherPk.maxHP);
		topHP.setBounds(100, 150, 250, 35);
		topHP.setValue(otherPk.HP);
		topHP.setStringPainted(true);
		this.add(topHP);
		if (myTeam.alive() == 3) {
			botPK = new JLabel(new ImageIcon(threepk));
		} else if (myTeam.alive() == 2) {
			botPK = new JLabel(new ImageIcon(twopk));
		} else {
			botPK = new JLabel(new ImageIcon(onepk));
		}
		if (CPUTeam.alive() == 3) {
			topPK = new JLabel(new ImageIcon(threepk));
		} else if (CPUTeam.alive() == 2) {
			topPK = new JLabel(new ImageIcon(twopk));
		} else {
			topPK = new JLabel(new ImageIcon(onepk));
		}
		botPK.setBounds(650, 350, 250, 35);
		topPK.setBounds(100, 50, 250, 35);
		this.add(botPK);
		this.add(topPK);

		//If there is a move to be used because of a switch
		if (y == 1) {
			firstLabel.setText(myPk.move1(otherPk));
			otherLabel.setText(otherPk.name + ": " + otherPk.HP + "/" + otherPk.maxHP + " HP");
			topHP.setValue(otherPk.HP);
		}
		if (y == 2) {
			firstLabel.setText(myPk.move2(otherPk));
			otherLabel.setText(otherPk.name + ": " + otherPk.HP + "/" + otherPk.maxHP + " HP");
			topHP.setValue(otherPk.HP);
		}
		if (y == 3) {
			firstLabel.setText(myPk.move3(otherPk));
			otherLabel.setText(otherPk.name + ": " + otherPk.HP + "/" + otherPk.maxHP + " HP");
			topHP.setValue(otherPk.HP);
		}
		if (y == 4) {
			firstLabel.setText(myPk.move4(otherPk));
			otherLabel.setText(otherPk.name + ": " + otherPk.HP + "/" + otherPk.maxHP + " HP");
			topHP.setValue(otherPk.HP);
		}
		if (y == 11) {
			firstLabel.setText(otherPk.move1(myPk));
			turnLabel.setText(myPk.name + ": " + myPk.HP + "/" + myPk.maxHP + " HP");
			botHP.setValue(myPk.HP);
		}
		if (y == 12) {
			firstLabel.setText(otherPk.move2(myPk));
			turnLabel.setText(myPk.name + ": " + myPk.HP + "/" + myPk.maxHP + " HP");
			botHP.setValue(myPk.HP);
		}
		if (y == 13) {
			firstLabel.setText(otherPk.move3(myPk));
			turnLabel.setText(myPk.name + ": " + myPk.HP + "/" + myPk.maxHP + " HP");
			botHP.setValue(myPk.HP);
		}
		if (y == 14) {
			firstLabel.setText(otherPk.move4(myPk));
			turnLabel.setText(myPk.name + ": " + myPk.HP + "/" + myPk.maxHP + " HP");
			botHP.setValue(myPk.HP);

		}
		//checking if that move fainted the pokemon
		if (otherPk.HP <= 0) {
			topHP.setValue(0);
			otherLabel.setText(otherPk.name + ": " + 0 + "/" + otherPk.maxHP + " HP");
			// if no more pokemon left
			if (CPUTeam.alive() == 0) {
				JOptionPane.showMessageDialog(null, otherPk.name + " fainted!\nYou win!");
				if (fight < 4) {
					if (fight == 1) {
						JOptionPane.showMessageDialog(null, "On to fight 2!");
						Swap s = new Swap(myTeam, CPUTeam, fight);
						s.setVisible(true);
						dispose();
					} else if (fight == 2) {
						JOptionPane.showMessageDialog(null, "On to fight 3!");
						Swap s = new Swap(myTeam, CPUTeam, fight);
						s.setVisible(true);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "On to fight 4!");
						Swap s = new Swap(myTeam, CPUTeam, fight);
						s.setVisible(true);
						dispose();
					}
				} else if (fight == 4) {
					JOptionPane.showMessageDialog(null, "You've cleared the game!");
					System.exit(0);
				}

			}cont=false;

		}
		if (myPk.HP <= 0) {
			botHP.setValue(0);
			turnLabel.setText(myPk.name + ": " + 0 + "/" + myPk.maxHP + " HP");
			// if no more pokemon left
			if (myTeam.alive() == 0) {
				JOptionPane.showMessageDialog(null, myPk.name + " fainted!\nYou lost!");
				System.exit(0);
			}
			// if pokemon left

			// getting the switch
			s = new CPUSwitch(myTeam, myPk, CPUTeam, otherPk, true, 0, null, fight);
			s.setVisible(true);
			dispose();
			cont = false;
		}
		if (cont == false) {
			kill();
		}
		backButton.setEnabled(false);

	}

	public void kill() {
		if (cont == false) {
			dispose();
		}
	}

	public void actionPerformed(ActionEvent e) {
		//weird bug when pokemon faints bc of switch move, so it has to be coded this way
		if (cont == false) {
			dispose();
			if (myPk.HP <= 0) {
				JOptionPane.showMessageDialog(null, myPk.name + " fainted!\nWhich pokemon will you replace it with?");
			}
			if (otherPk.HP <= 0) {
				JOptionPane.showMessageDialog(null, otherPk.name + " fainted!\nReplacing...");
				pokemon next = b.switchTo(otherPk, myPk);
				JOptionPane.showMessageDialog(null, "The computer sent out " + next.name + " !");
				CPUFight f = new CPUFight(myPk, next, myTeam, CPUTeam, 0, fight);
				f.setVisible(true);
			}
		} else {
			// If the main screen
			if (mainScreen) {
				backButton.setEnabled(true);
				// Fight
				if (e.getSource() == fightButton1) {
					label.setBounds(325, 650, 400, 40);
					label.setText("What move should " + myPk.name + " use?");
					fightButton1.setText(myPk.showMove1());
					pkmnButton2.setText(myPk.showMove2());
					bagButton3.setText(myPk.showMove3());
					runButton4.setText(myPk.showMove4());
					mainScreen = false;

				}
				// Pokemon
				if (e.getSource() == pkmnButton2) {
					pokemon p = b.switchTo(otherPk, myPk);
					if (myTeam.alive() == 1) {
						s = new CPUSwitch(myTeam, myPk, CPUTeam, otherPk, false, 0, otherPk, fight);
						s.setVisible(true);
						dispose();
					} else if (p != null) {
						s = new CPUSwitch(myTeam, myPk, CPUTeam, p, false, 0, otherPk, fight);
						s.setVisible(true);
						dispose();
					} else {
						int x = b.moveToUse(otherPk, myPk);
						s = new CPUSwitch(myTeam, myPk, CPUTeam, otherPk, false, x, otherPk, fight);
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
				//resetting stuff if they press back
				if (e.getSource() == backButton) {
					mainScreen = true;
					fightButton1.setText("Fight");
					pkmnButton2.setText("Pokemon");
					bagButton3.setText("Bag");
					runButton4.setText("Run");
					label.setText("What should " + myPk.name + " do?");
					label.setBounds(350, 650, 400, 100);
					backButton.setEnabled(false);
				}

				// First move
				if (e.getSource() == fightButton1) {
					firstLabel.setText("");
					secondLabel.setText("");
					pokemon p = b.switchTo(otherPk, myPk);
					//if the computer switches
					if (p != null) {
						JOptionPane.showMessageDialog(null, "The computer switched to " + p.name + " !");
						CPUFight h = new CPUFight(myPk, p, myTeam, CPUTeam, 1, fight);
						h.setVisible(true);
						dispose();
					} else {
						//getting the cpu move
						JOptionPane.showMessageDialog(null, "Thinking...");
						int mov = b.moveToUse(otherPk, myPk);
						if (myPk.speed > otherPk.speed) {
							firstLabel.setText(myPk.move1(otherPk));
							// if pokemon fainted
							if (otherPk.HP <= 0) {
								topHP.setValue(0);
								otherLabel.setText(otherPk.name + ": " + 0 + "/" + otherPk.maxHP + " HP");
								// if no more pokemon left
								if (CPUTeam.alive() == 0) {
									JOptionPane.showMessageDialog(null, otherPk.name + " fainted!\nYou win!");
									//checking for the next fight in the sequence
									if (fight < 4) {
										if (fight == 1) {
											JOptionPane.showMessageDialog(null, "On to fight 2!");
											Swap s = new Swap(myTeam, CPUTeam, fight);
											s.setVisible(true);
											dispose();
										} else if (fight == 2) {
											JOptionPane.showMessageDialog(null, "On to fight 3!");
											Swap s = new Swap(myTeam, CPUTeam, fight);
											s.setVisible(true);
											dispose();
										} else {
											JOptionPane.showMessageDialog(null, "On to fight 4!");
											Swap s = new Swap(myTeam, CPUTeam, fight);
											s.setVisible(true);
											dispose();
										}
									} else if (fight == 4) {
										JOptionPane.showMessageDialog(null, "You've cleared the game!");
										System.exit(0);
									}

								} else {
									// if pokemon left
									JOptionPane.showMessageDialog(null, otherPk.name + " fainted!\nReplacing...");
									// getting the switch
									pokemon next = b.switchTo(otherPk, myPk);
									JOptionPane.showMessageDialog(null, "The computer sent out " + next.name + " !");
									CPUFight f = new CPUFight(myPk, next, myTeam, CPUTeam, 0, fight);
									f.setVisible(true);
									dispose();
									cont = false;
								}
							} else {
								otherLabel.setText(otherPk.name + ": " + otherPk.HP + "/" + otherPk.maxHP + " HP");
								topHP.setValue(otherPk.HP);
								if (mov == 11) {
									secondLabel.setText(otherPk.move1(myPk));
								} else if (mov == 12) {
									secondLabel.setText(otherPk.move2(myPk));
								} else if (mov == 13) {
									secondLabel.setText(otherPk.move3(myPk));
								} else {
									secondLabel.setText(otherPk.move4(myPk));
								}

								if (myPk.HP <= 0) {
									botHP.setValue(0);
									turnLabel.setText(myPk.name + ": " + 0 + "/" + myPk.maxHP + " HP");
									// if no more pokemon left
									if (myTeam.alive() == 0) {
										JOptionPane.showMessageDialog(null, myPk.name + " fainted!\nYou lost!");
										System.exit(0);
									}
									// if pokemon left
									JOptionPane.showMessageDialog(null,
											myPk.name + " fainted!\nWhich pokemon will you replace it with?");
									// getting the switch
									s = new CPUSwitch(myTeam, myPk, CPUTeam, otherPk, true, 0, null, fight);
									s.setVisible(true);
									dispose();
									cont = false;

								}
								turnLabel.setText(myPk.name + ": " + myPk.HP + "/" + myPk.maxHP + " HP");
								botHP.setValue(myPk.HP);
							}
						} else {

							if (mov == 11) {
								firstLabel.setText(otherPk.move1(myPk));
							} else if (mov == 12) {
								firstLabel.setText(otherPk.move2(myPk));
							} else if (mov == 13) {
								firstLabel.setText(otherPk.move3(myPk));
							} else {
								firstLabel.setText(otherPk.move4(myPk));
							}

							if (myPk.HP <= 0) {
								botHP.setValue(0);
								turnLabel.setText(myPk.name + ": " + 0 + "/" + myPk.maxHP + " HP");
								// if no more pokemon left
								if (myTeam.alive() == 0) {
									JOptionPane.showMessageDialog(null, otherPk.name + " fainted!\nYou lost!");
									System.exit(0);
								}
								// if pokemon left
								JOptionPane.showMessageDialog(null,
										myPk.name + " fainted!\nWhich pokemon will you replace it with?");
								// getting the switch
								s = new CPUSwitch(myTeam, myPk, CPUTeam, otherPk, true, 0, null, fight);
								s.setVisible(true);
								dispose();
								cont = false;

							} else {
								turnLabel.setText(myPk.name + ": " + myPk.HP + "/" + myPk.maxHP + " HP");
								botHP.setValue(myPk.HP);

								secondLabel.setText(myPk.move1(otherPk));
								if (otherPk.HP <= 0) {
									topHP.setValue(0);
									otherLabel.setText(otherPk.name + ": " + 0 + "/" + otherPk.maxHP + " HP");
									// if no more pokemon left
									if (CPUTeam.alive() == 0) {
										JOptionPane.showMessageDialog(null, otherPk.name + " fainted!\nYou win!");
										if (fight < 4) {
											if (fight == 1) {
												JOptionPane.showMessageDialog(null, "On to fight 2!");
												Swap s = new Swap(myTeam, CPUTeam, fight);
												s.setVisible(true);
												dispose();
											} else if (fight == 2) {
												JOptionPane.showMessageDialog(null, "On to fight 3!");
												Swap s = new Swap(myTeam, CPUTeam, fight);
												s.setVisible(true);
												dispose();
											} else {
												JOptionPane.showMessageDialog(null, "On to fight 4!");
												Swap s = new Swap(myTeam, CPUTeam, fight);
												s.setVisible(true);
												dispose();
											}
										} else if (fight == 4) {
											JOptionPane.showMessageDialog(null, "You've cleared the game!");
											System.exit(0);
										}

									} else {
										// if pokemon left
										JOptionPane.showMessageDialog(null, otherPk.name + " fainted!\nReplacing...");
										// getting the switch
										pokemon next = b.switchTo(otherPk, myPk);
										JOptionPane.showMessageDialog(null,
												"The computer sent out " + next.name + " !");
										CPUFight f = new CPUFight(myPk, next, myTeam, CPUTeam, 0, fight);
										f.setVisible(true);
										dispose();
										cont = false;
									}
								}
								otherLabel.setText(otherPk.name + ": " + otherPk.HP + "/" + otherPk.maxHP + " HP");
								topHP.setValue(otherPk.HP);
							}
						}
					}
					//if no pokemon fainted, reset the screen and buttons
					mainScreen = true;
					fightButton1.setText("Fight");
					pkmnButton2.setText("Pokemon");

					bagButton3.setText("Bag");
					runButton4.setText("Run");
					label.setText("What should " + myPk.name + " do?");

					label.setBounds(350, 650, 400, 100);
		
					//second move
				} else if (e.getSource() == pkmnButton2) {
					firstLabel.setText("");
					secondLabel.setText("");
					pokemon p = b.switchTo(otherPk, myPk);
					//if cpu switches
					if (p != null) {
						JOptionPane.showMessageDialog(null, "The computer switched to " + p.name + " !");
						CPUFight h = new CPUFight(myPk, p, myTeam, CPUTeam, 2, fight);
						h.setVisible(true);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Thinking...");
						int mov = b.moveToUse(otherPk, myPk);
						if (myPk.speed > otherPk.speed) {
							firstLabel.setText(myPk.move2(otherPk));

							// if pokemon fainted
							if (otherPk.HP <= 0) {
								topHP.setValue(0);
								otherLabel.setText(otherPk.name + ": " + 0 + "/" + otherPk.maxHP + " HP");
								// if no more pokemon left
								if (CPUTeam.alive() == 0) {
									JOptionPane.showMessageDialog(null, otherPk.name + " fainted!\nYou win!");
									if (fight < 4) {
										if (fight == 1) {
											JOptionPane.showMessageDialog(null, "On to fight 2!");
											Swap s = new Swap(myTeam, CPUTeam, fight);
											s.setVisible(true);
											dispose();
										} else if (fight == 2) {
											JOptionPane.showMessageDialog(null, "On to fight 3!");
											Swap s = new Swap(myTeam, CPUTeam, fight);
											s.setVisible(true);
											dispose();
										} else {
											JOptionPane.showMessageDialog(null, "On to fight 4!");
											Swap s = new Swap(myTeam, CPUTeam, fight);
											s.setVisible(true);
											dispose();
										}
									} else if (fight == 4) {
										JOptionPane.showMessageDialog(null, "You've cleared the game!");
										System.exit(0);
									}

								} else {
									// if pokemon left
									JOptionPane.showMessageDialog(null, otherPk.name + " fainted!\nReplacing...");
									// getting the switch
									pokemon next = b.switchTo(otherPk, myPk);
									JOptionPane.showMessageDialog(null, "The computer sent out " + next.name + " !");
									CPUFight f = new CPUFight(myPk, next, myTeam, CPUTeam, 0, fight);
									f.setVisible(true);
									dispose();
									cont = false;
								}
							} else {
								//cpu move
								otherLabel.setText(otherPk.name + ": " + otherPk.HP + "/" + otherPk.maxHP + " HP");
								topHP.setValue(otherPk.HP);
								if (mov == 11) {
									secondLabel.setText(otherPk.move1(myPk));
								}
								if (mov == 12) {
									secondLabel.setText(otherPk.move2(myPk));
								}
								if (mov == 13) {
									secondLabel.setText(otherPk.move3(myPk));
								}
								if (mov == 14) {
									secondLabel.setText(otherPk.move4(myPk));
								}

								if (myPk.HP <= 0) {
									botHP.setValue(0);
									turnLabel.setText(myPk.name + ": " + 0 + "/" + myPk.maxHP + " HP");
									// if no more pokemon left
									if (myTeam.alive() == 0) {
										JOptionPane.showMessageDialog(null, myPk.name + " fainted!\nYou lost!");
										System.exit(0);
									}
									// if pokemon left
									JOptionPane.showMessageDialog(null,
											myPk.name + " fainted!\nWhich pokemon will you replace it with?");
									// getting the switch
									s = new CPUSwitch(myTeam, myPk, CPUTeam, otherPk, true, 0, null, fight);
									s.setVisible(true);
									dispose();
									cont = false;
								}
								turnLabel.setText(myPk.name + ": " + myPk.HP + "/" + myPk.maxHP + " HP");
								botHP.setValue(myPk.HP);
							}
						} else {

							if (mov == 11) {
								firstLabel.setText(otherPk.move1(myPk));
							}
							if (mov == 12) {
								firstLabel.setText(otherPk.move2(myPk));
							}
							if (mov == 13) {
								firstLabel.setText(otherPk.move3(myPk));
							}
							if (mov == 14) {
								firstLabel.setText(otherPk.move4(myPk));
							}

							if (myPk.HP <= 0) {
								botHP.setValue(0);
								turnLabel.setText(myPk.name + ": " + 0 + "/" + myPk.maxHP + " HP");
								// if no more pokemon left
								if (myTeam.alive() == 0) {
									JOptionPane.showMessageDialog(null, myPk.name + " fainted!\nYou lost!");
									System.exit(0);
								}
								// if pokemon left
								JOptionPane.showMessageDialog(null,
										myPk.name + " fainted!\nWhich pokemon will you replace it with?");
								// getting the switch
								s = new CPUSwitch(myTeam, myPk, CPUTeam, otherPk, true, 0, null, fight);
								s.setVisible(true);
								dispose();
								cont = false;
							} else {
								turnLabel.setText(myPk.name + ": " + myPk.HP + "/" + myPk.maxHP + " HP");
								botHP.setValue(myPk.HP);

								secondLabel.setText(myPk.move2(otherPk));
								if (otherPk.HP <= 0) {
									topHP.setValue(0);
									otherLabel.setText(otherPk.name + ": " + 0 + "/" + otherPk.maxHP + " HP");
									// if no more pokemon left
									if (CPUTeam.alive() == 0) {
										JOptionPane.showMessageDialog(null, otherPk.name + " fainted!\nYou win!");
										if (fight < 4) {
											if (fight == 1) {
												JOptionPane.showMessageDialog(null, "On to fight 2!");
												Swap s = new Swap(myTeam, CPUTeam, fight);
												s.setVisible(true);
												dispose();
											} else if (fight == 2) {
												JOptionPane.showMessageDialog(null, "On to fight 3!");
												Swap s = new Swap(myTeam, CPUTeam, fight);
												s.setVisible(true);
												dispose();
											} else {
												JOptionPane.showMessageDialog(null, "On to fight 4!");
												Swap s = new Swap(myTeam, CPUTeam, fight);
												s.setVisible(true);
												dispose();
											}
										} else if (fight == 4) {
											JOptionPane.showMessageDialog(null, "You've cleared the game!");
											System.exit(0);
										}

									} else {
										// if pokemon left
										JOptionPane.showMessageDialog(null, otherPk.name + " fainted!\nReplacing...");
										// getting the switch
										pokemon next = b.switchTo(otherPk, myPk);
										JOptionPane.showMessageDialog(null,
												"The computer sent out " + next.name + " !");
										CPUFight f = new CPUFight(myPk, next, myTeam, CPUTeam, 0, fight);
										f.setVisible(true);
										dispose();
										cont = false;
									}
								}
								otherLabel.setText(otherPk.name + ": " + otherPk.HP + "/" + otherPk.maxHP + " HP");
								topHP.setValue(otherPk.HP);
							}
						}
					}
					mainScreen = true;
					fightButton1.setText("Fight");
					pkmnButton2.setText("Pokemon");

					bagButton3.setText("Bag");
					runButton4.setText("Run");
					label.setText("What should " + myPk.name + " do?");

					label.setBounds(350, 650, 400, 100);

				}
				if (e.getSource() == bagButton3) {
					firstLabel.setText("");
					secondLabel.setText("");
					pokemon p = b.switchTo(otherPk, myPk);
					if (p != null) {
						JOptionPane.showMessageDialog(null, "The computer switched to " + p.name + " !");
						CPUFight h = new CPUFight(myPk, p, myTeam, CPUTeam, 3, fight);
						h.setVisible(true);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Thinking...");
						int mov = b.moveToUse(otherPk, myPk);
						if (myPk.speed > otherPk.speed) {
							firstLabel.setText(myPk.move3(otherPk));
							// if pokemon fainted
							if (otherPk.HP <= 0) {
								topHP.setValue(0);
								otherLabel.setText(otherPk.name + ": " + 0 + "/" + otherPk.maxHP + " HP");
								// if no more pokemon left
								if (CPUTeam.alive() == 0) {
									JOptionPane.showMessageDialog(null, otherPk.name + " fainted!\nYou win!");
									if (fight < 4) {
										if (fight == 1) {
											JOptionPane.showMessageDialog(null, "On to fight 2!");
											Swap s = new Swap(myTeam, CPUTeam, fight);
											s.setVisible(true);
											dispose();
										} else if (fight == 2) {
											JOptionPane.showMessageDialog(null, "On to fight 3!");
											Swap s = new Swap(myTeam, CPUTeam, fight);
											s.setVisible(true);
											dispose();
										} else {
											JOptionPane.showMessageDialog(null, "On to fight 4!");
											Swap s = new Swap(myTeam, CPUTeam, fight);
											s.setVisible(true);
											dispose();
										}
									} else if (fight == 4) {
										JOptionPane.showMessageDialog(null, "You've cleared the game!");
										System.exit(0);
									}

								} else {
									// if pokemon left
									JOptionPane.showMessageDialog(null, otherPk.name + " fainted!\nReplacing...");
									// getting the switch
									pokemon next = b.switchTo(otherPk, myPk);
									JOptionPane.showMessageDialog(null, "The computer sent out " + next.name + " !");
									CPUFight f = new CPUFight(myPk, next, myTeam, CPUTeam, 0, fight);
									f.setVisible(true);
									dispose();
									cont = false;
								}
							} else {
								otherLabel.setText(otherPk.name + ": " + otherPk.HP + "/" + otherPk.maxHP + " HP");
								topHP.setValue(otherPk.HP);
								if (mov == 11) {
									secondLabel.setText(otherPk.move1(myPk));
								}
								if (mov == 12) {
									secondLabel.setText(otherPk.move2(myPk));
								}
								if (mov == 13) {
									secondLabel.setText(otherPk.move3(myPk));
								}
								if (mov == 14) {
									secondLabel.setText(otherPk.move4(myPk));
								}

								if (myPk.HP <= 0) {
									botHP.setValue(0);
									turnLabel.setText(myPk.name + ": " + 0 + "/" + myPk.maxHP + " HP");
									// if no more pokemon left
									if (myTeam.alive() == 0) {
										JOptionPane.showMessageDialog(null, myPk.name + " fainted!\nYou lost!");
										System.exit(0);
									}
									// if pokemon left
									JOptionPane.showMessageDialog(null,
											myPk.name + " fainted!\nWhich pokemon will you replace it with?");
									// getting the switch
									s = new CPUSwitch(myTeam, myPk, CPUTeam, otherPk, true, 0, null, fight);
									s.setVisible(true);
									dispose();
									cont = false;
								}
								turnLabel.setText(myPk.name + ": " + myPk.HP + "/" + myPk.maxHP + " HP");
								botHP.setValue(myPk.HP);
							}
						} else {

							if (mov == 11) {
								firstLabel.setText(otherPk.move1(myPk));
							}
							if (mov == 12) {
								firstLabel.setText(otherPk.move2(myPk));
							}
							if (mov == 13) {
								firstLabel.setText(otherPk.move3(myPk));
							}
							if (mov == 14) {
								firstLabel.setText(otherPk.move4(myPk));
							}

							if (myPk.HP <= 0) {
								botHP.setValue(0);
								turnLabel.setText(myPk.name + ": " + 0 + "/" + myPk.maxHP + " HP");
								// if no more pokemon left
								if (myTeam.alive() == 0) {
									JOptionPane.showMessageDialog(null, myPk.name + " fainted!\nYou lost!");
									System.exit(0);
								}
								// if pokemon left
								JOptionPane.showMessageDialog(null,
										myPk.name + " fainted!\nWhich pokemon will you replace it with?");
								// getting the switch
								s = new CPUSwitch(myTeam, myPk, CPUTeam, otherPk, true, 0, null, fight);
								s.setVisible(true);
								dispose();
								cont = false;
							} else {
								turnLabel.setText(myPk.name + ": " + myPk.HP + "/" + myPk.maxHP + " HP");
								botHP.setValue(myPk.HP);

								secondLabel.setText(myPk.move3(otherPk));
								if (otherPk.HP <= 0) {
									topHP.setValue(0);
									otherLabel.setText(otherPk.name + ": " + 0 + "/" + otherPk.maxHP + " HP");
									// if no more pokemon left
									if (CPUTeam.alive() == 0) {
										JOptionPane.showMessageDialog(null, otherPk.name + " fainted!\nYou win!");
										if (fight < 4) {
											if (fight == 1) {
												JOptionPane.showMessageDialog(null, "On to fight 2!");
												Swap s = new Swap(myTeam, CPUTeam, fight);
												s.setVisible(true);
												dispose();
											} else if (fight == 2) {
												JOptionPane.showMessageDialog(null, "On to fight 3!");
												Swap s = new Swap(myTeam, CPUTeam, fight);
												s.setVisible(true);
												dispose();
											} else {
												JOptionPane.showMessageDialog(null, "On to fight 4!");
												Swap s = new Swap(myTeam, CPUTeam, fight);
												s.setVisible(true);
												dispose();
											}
										} else if (fight == 4) {
											JOptionPane.showMessageDialog(null, "You've cleared the game!");
											System.exit(0);
										}

									} else {
										// if pokemon left
										JOptionPane.showMessageDialog(null, otherPk.name + " fainted!\nReplacing...");
										// getting the switch
										pokemon next = b.switchTo(otherPk, myPk);
										JOptionPane.showMessageDialog(null,
												"The computer sent out " + next.name + " !");
										CPUFight f = new CPUFight(myPk, next, myTeam, CPUTeam, 0, fight);
										f.setVisible(true);
										dispose();
										cont = false;
									}
								}
								otherLabel.setText(otherPk.name + ": " + otherPk.HP + "/" + otherPk.maxHP + " HP");
								topHP.setValue(otherPk.HP);
							}
						}

					}
					mainScreen = true;
					fightButton1.setText("Fight");
					pkmnButton2.setText("Pokemon");

					bagButton3.setText("Bag");
					runButton4.setText("Run");
					label.setText("What should " + myPk.name + " do?");

					label.setBounds(350, 650, 400, 100);

				}
				if (e.getSource() == runButton4) {
					firstLabel.setText("");
					secondLabel.setText("");
					pokemon p = b.switchTo(otherPk, myPk);
					if (p != null) {
						JOptionPane.showMessageDialog(null, "The computer switched to " + p.name + " !");
						CPUFight h = new CPUFight(myPk, p, myTeam, CPUTeam, 4, fight);
						h.setVisible(true);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Thinking...");
						int mov = b.moveToUse(otherPk, myPk);
						if (myPk.speed > otherPk.speed) {
							firstLabel.setText(myPk.move4(otherPk));
							// if pokemon fainted
							if (otherPk.HP <= 0) {
								topHP.setValue(0);
								otherLabel.setText(otherPk.name + ": " + 0 + "/" + otherPk.maxHP + " HP");
								// if no more pokemon left
								if (CPUTeam.alive() == 0) {
									JOptionPane.showMessageDialog(null, otherPk.name + " fainted!\nYou win!");
									if (fight < 4) {
										if (fight == 1) {
											JOptionPane.showMessageDialog(null, "On to fight 2!");
											Swap s = new Swap(myTeam, CPUTeam, fight);
											s.setVisible(true);
											dispose();
										} else if (fight == 2) {
											JOptionPane.showMessageDialog(null, "On to fight 3!");
											Swap s = new Swap(myTeam, CPUTeam, fight);
											s.setVisible(true);
											dispose();
										} else {
											JOptionPane.showMessageDialog(null, "On to fight 4!");
											Swap s = new Swap(myTeam, CPUTeam, fight);
											s.setVisible(true);
											dispose();
										}
									} else if (fight == 4) {
										JOptionPane.showMessageDialog(null, "You've cleared the game!");
										System.exit(0);
									}

								} else {
									// if pokemon left
									JOptionPane.showMessageDialog(null, otherPk.name + " fainted!\nReplacing...");
									// getting the switch
									pokemon next = b.switchTo(otherPk, myPk);
									JOptionPane.showMessageDialog(null, "The computer sent out " + next.name + " !");
									CPUFight f = new CPUFight(myPk, next, myTeam, CPUTeam, 0, fight);
									f.setVisible(true);
									dispose();
									cont = false;
								}
							} else {
								otherLabel.setText(otherPk.name + ": " + otherPk.HP + "/" + otherPk.maxHP + " HP");
								topHP.setValue(otherPk.HP);
								if (mov == 11) {
									secondLabel.setText(otherPk.move1(myPk));
								}
								if (mov == 12) {
									secondLabel.setText(otherPk.move2(myPk));
								}
								if (mov == 13) {
									secondLabel.setText(otherPk.move3(myPk));
								}
								if (mov == 14) {
									secondLabel.setText(otherPk.move4(myPk));
								}

								if (myPk.HP <= 0) {
									botHP.setValue(0);
									turnLabel.setText(myPk.name + ": " + 0 + "/" + myPk.maxHP + " HP");
									// if no more pokemon left
									if (myTeam.alive() == 0) {
										JOptionPane.showMessageDialog(null, myPk.name + " fainted!\nYou lost!");
										System.exit(0);
									}
									// if pokemon left
									JOptionPane.showMessageDialog(null,
											myPk.name + " fainted!\nWhich pokemon will you replace it with?");
									// getting the switch
									s = new CPUSwitch(myTeam, myPk, CPUTeam, otherPk, true, 0, null, fight);
									s.setVisible(true);
									dispose();
									cont = false;
								}
								turnLabel.setText(myPk.name + ": " + myPk.HP + "/" + myPk.maxHP + " HP");
								botHP.setValue(myPk.HP);
							}
						} else {

							if (mov == 11) {
								firstLabel.setText(otherPk.move1(myPk));
							}
							if (mov == 12) {
								firstLabel.setText(otherPk.move2(myPk));
							}
							if (mov == 13) {
								firstLabel.setText(otherPk.move3(myPk));
							}
							if (mov == 14) {
								firstLabel.setText(otherPk.move4(myPk));
							}

							if (myPk.HP <= 0) {
								botHP.setValue(0);
								turnLabel.setText(myPk.name + ": " + 0 + "/" + myPk.maxHP + " HP");
								// if no more pokemon left
								if (myTeam.alive() == 0) {
									JOptionPane.showMessageDialog(null, myPk.name + " fainted!\nYou lost!");
									System.exit(0);
								}
								// if pokemon left
								JOptionPane.showMessageDialog(null,
										myPk.name + " fainted!\nWhich pokemon will you replace it with?");
								// getting the switch
								s = new CPUSwitch(myTeam, myPk, CPUTeam, otherPk, true, 0, null, fight);
								s.setVisible(true);
								dispose();
								cont = false;
							} else {
								turnLabel.setText(myPk.name + ": " + myPk.HP + "/" + myPk.maxHP + " HP");
								botHP.setValue(myPk.HP);

								secondLabel.setText(myPk.move4(otherPk));
								if (otherPk.HP <= 0) {
									topHP.setValue(0);
									otherLabel.setText(otherPk.name + ": " + 0 + "/" + otherPk.maxHP + " HP");
									// if no more pokemon left
									if (CPUTeam.alive() == 0) {
										JOptionPane.showMessageDialog(null, otherPk.name + " fainted!\nYou win!");
										if (fight < 4) {
											if (fight == 1) {
												JOptionPane.showMessageDialog(null, "On to fight 2!");
												Swap s = new Swap(myTeam, CPUTeam, fight);
												s.setVisible(true);
												dispose();
											} else if (fight == 2) {
												JOptionPane.showMessageDialog(null, "On to fight 3!");
												Swap s = new Swap(myTeam, CPUTeam, fight);
												s.setVisible(true);
												dispose();
											} else {
												JOptionPane.showMessageDialog(null, "On to fight 4!");
												Swap s = new Swap(myTeam, CPUTeam, fight);
												s.setVisible(true);
												dispose();
											}
										} else if (fight == 4) {
											JOptionPane.showMessageDialog(null, "You've cleared the game!");
											System.exit(0);
										}

									} else {
										// if pokemon left
										JOptionPane.showMessageDialog(null, otherPk.name + " fainted!\nReplacing...");
										// getting the switch
										pokemon next = b.switchTo(otherPk, myPk);
										JOptionPane.showMessageDialog(null,
												"The computer sent out " + next.name + " !");
										CPUFight f = new CPUFight(myPk, next, myTeam, CPUTeam, 0, fight);
										f.setVisible(true);
										dispose();
										cont = false;
									}
								}
								otherLabel.setText(otherPk.name + ": " + otherPk.HP + "/" + otherPk.maxHP + " HP");
								topHP.setValue(otherPk.HP);
							}
						}
					}
					mainScreen = true;
					fightButton1.setText("Fight");
					pkmnButton2.setText("Pokemon");

					bagButton3.setText("Bag");
					runButton4.setText("Run");
					label.setText("What should " + myPk.name + " do?");

					label.setBounds(350, 650, 400, 100);

				}

			}

		}
	}

}
