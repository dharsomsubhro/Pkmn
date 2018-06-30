
public class pokemon {

	protected int speed;
	protected int HP;
	protected int attack;
	protected int defense;
	protected int sAttack;
	protected int sDefense;
	protected String name;
	protected boolean monotype;
	protected int type1;
	protected int type2;
	protected int maxHP;

	public pokemon(int sped, int hp, int atk, int dfns, int sAttk, int sDef, String nam, int type) {
		speed = sped;
		HP = hp;
		attack = atk;
		defense = dfns;
		sAttack = sAttk;
		sDefense = sDef;
		name = nam;
		type1 = type;
		monotype = true;
		type2 = 0;
		maxHP=hp;
	}

	public pokemon(int sped, int hp, int atk, int dfns, int sAttk, int sDef, String nam, int typ1, int typ2) {
		speed = sped;
		HP = hp;
		attack = atk;
		defense = dfns;
		sAttack = sAttk;
		sDefense = sDef;
		name = nam;
		type1 = typ1;
		type2 = typ2;
		monotype = false;
		maxHP=hp;
	}

	public void showMoves() {

	}

	public String showMove1() {
		return "";
	}

	public String showMove2() {
		return "";
	}

	public String showMove3() {
		return "";
	}

	public String showMove4() {
		return "";
	}

	public String move1(pokemon p) {
		return "";
	}

	public String move2(pokemon p) {
		return "";
	}

	public String move3(pokemon p) {
		return "";
	}

	public String move4(pokemon p) {
		return "";
	}

}
