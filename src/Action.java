import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

public class Action {
	pokemon turn;
	pokemon other;

	String t1;
	String t2;
	public Action(pokemon p1, pokemon p2) {
		turn = p1;
		other = p2;
		t1=turn.name;
		t2=other.name;
	}

	public int fight() {

		System.out.println("It's " + turn.name + "'s turn");
		System.out.println("Fight        Bag\nPokemon      Run");
		Scanner sc = new Scanner(System.in);
		Moves m = new Moves();
		while (true) {
			String s = sc.next();
			s = s.toLowerCase();
			if (s.compareTo("fight") == 0) {
				System.out.println("What move?\nCrunch\tNasty Plot\nSurf");
				s = sc.next();
				s = s.toLowerCase();
				if (s.compareTo("crunch") == 0) {
					m.crunch(turn, other);
					if (other.HP <= 0) {
						System.out.println(other.name + " fainted!");
						if(other.name.compareTo(t1)==0) {
							return 1;
						}
						else {
							return 2;
						}
					}

					pokemon temp = turn;
					turn = other;
					other = temp;
					System.out.println(other.name + " has " + other.HP + " HP");
					System.out.println(turn.name + " has " + turn.HP + " HP");
					System.out.println("It's " + turn.name + "'s turn");
				} else if (s.compareTo("nastyplot") == 0) {
					m.nastyPlot(turn, other);
					pokemon temp = turn;
					turn = other;
					other = temp;
					System.out.println(other.name + " has " + other.sAttack + " Special Attack");
					System.out.println(turn.name + " has " + turn.sAttack + " Special Attack");
					System.out.println("It's " + turn.name + "'s turn");
				} else if (s.compareTo("surf") == 0) {
					m.surf(turn, other);
					if (other.HP <= 0) {
						System.out.println(other.name + " fainted!");
						if(other.name.compareTo(t1)==0) {
							return 1;
						}
						else {
							return 2;
						}
					}
					pokemon temp = turn;
					turn = other;
					other = temp;
					System.out.println(other.name + " has " + other.HP + " HP");
					System.out.println(turn.name + " has " + turn.HP + " HP");
					System.out.println("It's " + turn.name + "'s turn");
				} else {
					System.out.println("Enter a valid move");

				}
			} else if (s.compareTo("bag") == 0) {
				System.out.println("Not ready yet");
			} else if (s.compareTo("run") == 0) {
				System.out.println("Can't do that");
			} else if (s.compareTo("pokemon") == 0) {
				System.out.println("Not ready yet");
			} else {
				System.out.println("Enter a legal command");
			}
			System.out.println("Fight        Bag\nPokemon      Run");

		}
	}

}
