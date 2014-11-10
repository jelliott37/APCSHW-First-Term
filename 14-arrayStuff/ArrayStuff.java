import java.util.Random;
public class ArrayStuff{
    public static void main(String[] args){
	int m=20,
	    maxval=20;

	if (args.length > 0){
	    m = Integer.parseInt(args[0]);
	}
	if (args.length > 1){
	    maxval = Integer.parseInt(args[1]);
	}
	ArrayStuff n = new ArrayStuff(maxval,m);
	//System.out.println(n);
	//System.out.println(n.mode2nd());
	System.out.println(n.mode());
    }
    public Random rand = new Random();
    public int[] stuff;
    public ArrayStuff(){
	this(20,100);
    }
    public ArrayStuff(int n){
	this(n,100);
    }
    public ArrayStuff(int n, int m){
	stuff=new int[m];
	for (int i = 0; i < stuff.length;i++){
	    stuff[i]=rand.nextInt(n);
	}
	
    }
    public String toString(){
	String fin="{";
	for (int i:stuff){
	    fin+=" "+i+",";
	}
	return fin+"}";
    }
    public int find(int[] stuff, int n){
	for (int i=0; i<stuff.length;i++){
	    if (stuff[i]==n){
		return i;
	    }
	}
	return -1;
    }
    public int mode2nd(){ //This does work now
	int max = 0;
	int standby=stuff[0];
	for (int i:stuff){
	    //System.out.println(""+i+", "+freq(i)+", " + max + ", " + standby);
	    if (freq(i)>max){
		standby=i;
		max=freq(i);
	    }
	}
	return standby;
    } 	
    public int modeVal(){
	int max = 0;
	int standby=stuff[0];
	for (int i=0; i < stuff.length;i++){
	    int blah=freq(stuff[i]);
	    if (blah>max){
		standby=stuff[i];
		max=blah;
	    }
	}
	return max;
    } 
    public int mode(){
	int max=maxVal(stuff);
	int[] blah=new int[max+1];
	for (int i : stuff){
	    blah[i]++;
	}
	return find(blah, maxVal(blah));
    }
    public int freq(int i){
	int count=0;
	for (int k:stuff){
	    if (k==i){
		count++;
	    }
	}
	return count;
    }
    public int maxVal(int[] second){
	int champ=second[0];
	for (int i = 0; i < second.length;i++){
	    if (second[i]>champ){
		champ=second[i];
	    }
	}
	return champ;
    }
    public int maxMirror(int[] nums){
	int champ=0;
	for (int i = 0; i<nums.length; i ++){
	    int iter=0;
	    int top=i;
	    int bottom=0;
	    boolean mirroring=false;
	    while (top < nums.length && bottom<nums.length){
		if(mirroring){
		    if(nums[top]!= nums[nums.length-bottom-1]){
			if (iter>champ){
			    champ=iter;
			}
			mirroring=false;
			top=i;
		    }
		    else{
			iter++;
			top++;
			bottom++;
          
		    }
		}
		else{
		    if (nums[top]!= nums[nums.length-bottom-1]){
			bottom++;
		    }
		    else{
			iter=1;
			mirroring=true;
			top++;
			bottom++;
		    }
		}
      
	    }
	    if (iter>champ){
		champ=iter;
	    }
	}

	return champ;
    }
}
