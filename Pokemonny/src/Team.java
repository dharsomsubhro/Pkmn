
public class Team {
	
	public boolean isTurn;
	public pokemon[] pkmn=new pokemon[6];
	pokemon curr;

	public Team(pokemon one, pokemon two, pokemon three, pokemon four, pokemon five, pokemon six, boolean turn) {
		pkmn[0]=one;
		pkmn[1]=two;
		pkmn[2]=three;
		pkmn[3]=four;
		pkmn[4]=five;
		pkmn[5]=six;
		isTurn=turn;
		curr=one;
	}

	
	public int alive() {
		int x=0;
		if(pkmn[0]!=null && pkmn[0].HP>0) {
			
			x++;
		}
		if(pkmn[1]!=null&& pkmn[1].HP>0) {
			
			x++;
		}
		if(pkmn[2]!=null&& pkmn[2].HP>0) {
			
			x++;
		}
		if(pkmn[3]!=null&& pkmn[3].HP>0) {
			
			x++;
		}
		if(pkmn[4]!=null&& pkmn[4].HP>0) {
			x++;
		}
		if(pkmn[5]!=null&& pkmn[5].HP>0) {
			
			x++;
		}
		return x;
		
		
	}

}
