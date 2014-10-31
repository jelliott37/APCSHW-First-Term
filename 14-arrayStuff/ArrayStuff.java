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
    public int freq(int i){
	int ph=stuff[i];
	int count=0;
	for (int k:stuff){
	    if (k==ph){
		ph++;
	    }
	}
	return ph;
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