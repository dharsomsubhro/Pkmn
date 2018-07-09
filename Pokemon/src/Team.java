
public class Team {

	public boolean isTurn;
	public pokemon[] pkmn = new pokemon[6];
	pokemon curr;
	int last;

	public Team(pokemon one, pokemon two, pokemon three, pokemon four, pokemon five, pokemon six, boolean turn) {
		pkmn[0] = one;
		pkmn[1] = two;
		pkmn[2] = three;
		pkmn[3] = four;
		pkmn[4] = five;
		pkmn[5] = six;
		isTurn = turn;
		curr = one;
		setLast();
	}

	//helper method for getting the last pokemon in the team
	private void setLast() {
		if(pkmn[0]==null) {
			last=0;
		}
		else if(pkmn[1]==null) {
			last=1;
		}
		else if(pkmn[2]==null) {
			last=2;
		}
		else if(pkmn[3]==null) {
			last=3;
		}
		else if(pkmn[4]==null) {
			last=4;
		}
		else {
			last=5;
		}
		
		
	}
	//returns how many pokemon are still alive in the team
	public int alive() {
		int x = 0;
		if (pkmn[0] != null && pkmn[0].HP > 0) {

			x++;
		}
		if (pkmn[1] != null && pkmn[1].HP > 0) {

			x++;
		}
		if (pkmn[2] != null && pkmn[2].HP > 0) {

			x++;
		}
		if (pkmn[3] != null && pkmn[3].HP > 0) {

			x++;
		}
		if (pkmn[4] != null && pkmn[4].HP > 0) {
			x++;
		}
		if (pkmn[5] != null && pkmn[5].HP > 0) {

			x++;
		}
		return x;

	}
	//adds a pokemon to the team for pick3
	public void add(pokemon p) {
		setLast();
		pkmn[last]=p;
	}
	//removes the last pokemon added to the team for pick3
	public void remove() {
		setLast();
		pkmn[last-1]=null;
	}
	//swaps the pokemon on the team with the new pokemon for swap
	public void swap(pokemon p1, pokemon p2) {
		if(p1==pkmn[0]) {
			pkmn[0]=p2;
		}
		else if(p1==pkmn[1]) {
			pkmn[1]=p2;
		}
		else if(p1==pkmn[2]) {
			pkmn[2]=p2;
		}
		else if(p1==pkmn[3]) {
			pkmn[3]=p2;
		}
		else if(p1==pkmn[4]) {
			pkmn[4]=p2;
		}
		else if(p1==pkmn[5]) {
			pkmn[5]=p2;
		}
	}

}
