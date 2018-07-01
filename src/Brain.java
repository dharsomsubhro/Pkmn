
public class Brain {

	Team CPUTeam;
	Team userTeam;
	pokemon userPokemon;
	pokemon CPUpokemon;
	
	public Brain(Team uTeam, Team cTeam, pokemon p1, pokemon p2) {
		userTeam=uTeam;
		CPUTeam=cTeam;
		userPokemon=p1;
		CPUpokemon=p2;
	}
	
	public pokemon switchTo() {
		pokemon p=null;
		if(CPUTeam.pkmn[0].HP>0) {
			if(CPUpokemon==CPUTeam.pkmn[0]) {
				return null;
			}
			return CPUTeam.pkmn[0];
		}
		if(CPUTeam.pkmn[1].HP>0) {
			if(CPUpokemon==CPUTeam.pkmn[1]) {
				return null;
			}
			return CPUTeam.pkmn[1];
		}
		if(CPUTeam.pkmn[2].HP>0) {
			if(CPUpokemon==CPUTeam.pkmn[2]) {
				return null;
			}
			return CPUTeam.pkmn[2];
		}
		
		return p;
	}
	
	public int moveToUse() {
		return 11;
	}

}
