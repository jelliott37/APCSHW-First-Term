import java.util.Random;
public class BaseChar{

    private int hp,mp,atk,def,spd,acc,lck;
    private boolean poisonState=false;
    private String name, weapon;
    Random r = new Random();

    public BaseChar(int h, int m, int a, int d, int s, int ac, int c, String n){
	hp= r.nextInt(2)+h-1;
	mp=r.nextInt(2)+m-1;
	atk=r.nextInt(2)+a-1;
	def=r.nextInt(2)+d-1;
	spd=r.nextInt(2)+s-1;
	acc=r.nextInt(2)+ac-1;
	lck=r.nextInt(2)+c-1;
	name=n;
    }
    public String toString(){
	return name;
    }
    
    public int getHP(){
	return hp;
    }
    public int getMP(){
	return mp;
    }   
    public void setMP(int m){
	mp=m;
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
	if (r.nextInt(100)+1<acc){
	    if (other.getDef()>this.getAtk()){
		return "" + this + " could deal no damage to " + other;
	    }
	    if (r.nextInt(100)+1<lck){
		other.setHP(other.getHP()+2*(other.getDef()-this.getAtk()));
		return "" + this + " attacked " + other + " with " + weapon + " and injured " + other;
	    }
	    other.setHP(other.getHP()+other.getDef()-this.getAtk());
	    return "" + this + " attacked " + other + " with " + weapon + " and injured " + other;
	}
	return "" + this + " missed " + other;
    }

}
