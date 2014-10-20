public class BaseChar{

    private int hp,mp,atk,def,spd,acc,lck;
    private boolean poisonState=false;
    private String name, weapon;


    public BaseChar(int h, int m, int a, int d, int s, int ac, int c, String n){
	     Random r = new Random();
	hp= r.nextInt(2)+h+1;
	mp=m;
	atk=a;
	def=d;
	spd=s;
	acc=ac;
	lck=c;
	name=n;
	//I'll add some degree of randomness later.
    }
    public String toString(){
	return name;
    }
    
    public int getHP(){
	return hp;
    }
    public void setHP(int h){
        hp = h;
    }
    public int getAtk(){
	return atk;
    }
    public int getDef(){
	return def;
    }
    public int getSpd(){
	return spd;
    }
    public int getLck(){
	return lck;
    }
    public String getWeapon(){
	return weapon;
    }
    public boolean isPoisoned(){
	return poisonState;
    }
    public String poison(){
	if (!poisonState){
	    poisonState = true;
	    return "" + this + "was poisoned.";
	}
	return "" + this + "was already poisoned.";
    }
    public String attack(BaseChar other){
	if (other.getDef()>this.getAtk()){
	    return "" + this + " could deal no damage to " + other;
	}
	other.setHP(other.getHP()+other.getDef()-this.getAtk());
	return "" + this + " attacked " + other + " with " + weapon + " and injured " + other;
    }

}
