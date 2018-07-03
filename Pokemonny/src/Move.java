
public class Move {

	public int type;
	public String name;
	public boolean STAB;
	public int power;
	public boolean physical;
	
	public Move(String nam, int typ,boolean stab, int p, boolean phys) {
		type=typ;
		name=nam;
		STAB=stab;
		power=p;
		physical=phys;
	}

}
