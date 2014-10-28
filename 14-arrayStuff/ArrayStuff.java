public class ArrayStuff{
    public int[] stuff;
    public ArrayStuff(){
	this(100)
    }
    public ArrayStuff(int n){
	stuff=new int[n];
    }
    public int find(int n){
	for (int i=0; i<stuff.length;i++){
	    if (stuff[i]==n){
		return i
	    }
	}
	return -1;
    }
    public int maxVal(){
	int champ=stuff[0];
	for (int i = 0; i < stuff.length;i++){
	    if (stuff[i]>champ){
		champ=stuff[i];
	    }
	}
	return champ;
    }
}