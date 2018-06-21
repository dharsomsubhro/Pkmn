import java.util.Random;
import java.util.Scanner;

public class Action {
	public static void crunch(pokemon p1, pokemon p2) {
		Random rand=new Random();
		int y=rand.nextInt(38)+217;
		int x=(((22*p1.sAttack*95)/p2.sDefense)/50)+(3*y)/255;
		p2.HP-=x;
	}
	public static void surf(pokemon p1, pokemon p2) {
		Random rand=new Random();
		int y=rand.nextInt(38)+217;
		int x=(((22*p1.attack*80)/p2.defense)/50)+(2*y)/255;
		p2.HP-=x;
	}
	public static void nastyPlot(pokemon p1, pokemon p2) {
		p1.sAttack*=2;
	}

	public static void main(String[] args) {
		Lucario luke=new Lucario(90,70,110,70,115,70);
		Lapras lappy=new Lapras(130, 60, 85, 80, 85, 95);
		pokemon turn=luke;
		pokemon other=lappy;
		System.out.println("It's "+turn.name +"'s turn");
		System.out.println("Fight        Bag\nPokemon      Run");
		Scanner sc=new Scanner(System.in);
		
		while(true) {	
			String s=sc.next();
			s=s.toLowerCase();
			if(s.compareTo("fight")==0) {
				System.out.println("What move?\nCrunch\tNasty Plot\nSurf");
				s=sc.next();
				s=s.toLowerCase();
				if(s.compareTo("crunch")==0) {
					crunch(turn, other);
					if(other.HP<=0) {
						System.out.println(other.name+" fainted!");
						break;
					}
					pokemon temp=turn;
					turn=other;
					other=temp;
					System.out.println("Lucario has "+ luke.HP +" HP");
					System.out.println("Lapras has "+ lappy.HP +" HP");
					System.out.println("It's "+turn.name +"'s turn");
				}
				else if(s.compareTo("nastyplot")==0) {
					nastyPlot(turn, other);
					pokemon temp=turn;
					turn=other;
					other=temp;
					System.out.println("Lucario has "+ luke.sAttack +" Special Attack");
					System.out.println("Lapras has "+ lappy.sAttack +" Special Attack");
					System.out.println("It's "+turn.name +"'s turn");
				}
				else if(s.compareTo("surf")==0) {
					surf(turn, other);
					if(other.HP<=0) {
						System.out.println(other.name+" fainted!");
						break;
					}
					pokemon temp=turn;
					turn=other;
					other=temp;
					System.out.println("Lucario has "+ luke.HP +" HP");
					System.out.println("Lapras has "+ lappy.HP +" HP");
					System.out.println("It's "+turn.name +"'s turn");
				}
				else {
					System.out.println("Enter a valid move");
					
				}
			}
			else if(s.compareTo("bag")==0) {
				System.out.println("Not ready yet");
			}
			else if(s.compareTo("run")==0) {
				System.out.println("Can't do that");
			}
			else if(s.compareTo("pokemon")==0) {
				System.out.println("Not ready yet");
			}
			else {
				System.out.println("Enter a legal command");
			}
			System.out.println("Fight        Bag\nPokemon      Run");
			
		}
	}		

}
