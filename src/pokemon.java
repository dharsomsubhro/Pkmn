
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
	
	
	public pokemon(int sped, int hp,int atk,int dfns, int sAttk,int sDef, String nam, int type) {
		speed=sped;
		HP=hp;
		attack=atk;
		defense=dfns;
		sAttack=sAttk;
		sDefense=sDef;
		name=nam;	
		type1=type;
		monotype=true;
		type2=0;
	}
	public pokemon(int sped, int hp,int atk,int dfns, int sAttk,int sDef, String nam, int typ1, int typ2) {
		speed=sped;
		HP=hp;
		attack=atk;
		defense=dfns;
		sAttack=sAttk;
		sDefense=sDef;
		name=nam;	
		type1=typ1;
		type2=typ2;
		monotype=false;
	}
}
