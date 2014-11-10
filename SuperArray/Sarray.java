public class Sarray{

    private int[] data;
    private int last;
    public Sarray(){
	this(10);
    }
    public Sarray(int n){
	data=new int[n];
	last=0;
    }
    
    public void add(int n){
	if (last==data.length-1){
	    int[] ph = data;
	    data= new int[data.length+1];
	    for ( int i=0; i<ph.length;i++){
		data[i]=ph[i];
	    }
	    
	}
	last++;
	data[last]=n;
    }
    public void add(int index, int n){
	if (index<=last){
	    if (data.length-1==last){
		int PlaceHolder[] = data;
		data = new int[data.length+1];
		for (int i=0;i<index; i++){
		    data[i]=PlaceHolder[i];
		}
		data[index]=n;
		for (int i=index+1; i<data.length+1; i++){
		    data[i]=PlaceHolder[i-1];
		}
	    } else {
		for (int i=last+1; i>index; i--){
		    data[i] = data[i-1];
		}
		data[index]= n;
	    }
	    last++;
	}else{
	    add(n);
	}
    }
    
    public int get(int index){
	if (index<=last)
	    return data[index];
	else
	    System.out.println("No value in Index");
    }
    public void set(int index, int i){
	if (index<data.length){
	    data[index]=i;
	}
    }
    public int size(){
	return last+1;
    }
    public void remove(int index){
	for (int i=index; i<last; i++){
	    data[i]=data[i+1];
	}
	data[last]=0;
	last--;
    }
}

