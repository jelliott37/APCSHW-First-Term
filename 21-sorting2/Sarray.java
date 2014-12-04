public class Sarray{

    private String[] data;
    protected int last;
    public Sarray(){
	this(10);
    }
    public String toString(){
	String val="";
	for (int i = 0; i <last;i++){
	    val+=get(i)+ ",";
	}
	return val;
    }
    public Sarray(int n){
	data=new String[n];
	last=0;
    }

    public int find(String n){
	for (int i = 0;i<data.length;i++){
	    if (data[i].equals(n)) return i;
	}
	return -1;
    }
    
    public void add(String n){
	if (last==data.length-1){
	    String[] ph = data;
	    data= new String[data.length+1];
	    for ( int i=0; i<ph.length;i++){
		data[i]=ph[i];
	    }
	    
	}
	data[last]=n;
	last++;
    }
    public void add(int index, String n){
	if (index<=last){
	    if (data.length-1==last){
		String PlaceHolder[] = data;
		data = new String[data.length+1];
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
	    throw new ArrayIndexOutOfBoundsException();
	}
    }
    

    public void bsort(){
	int check=1;
	while (check>0){
	    check=0;
	    for (int i = 0; i <last-1;i++){
		if(get(i).compareTo(get(i+1))>0){
		    String ph = get(i);
		    set(i,get(i+1));
		    set(i+1,ph);
		    check++;
		}
	    }
	}
    }
    public void ssort(){
	for (int i = 0; i <data.length-1;i++){
	    String champ= data[i];
	    int location=i;
	    for (int k = i; k<data.length-1;k++){
		if (data[k].compareTo(data[location])<0){
		    champ=data[k];
		    location=k;
		}
	    }
	    data[location]=data[i];
	    data[i]=champ;
	}
    }
    public void isort(){
	int index;
	String ph="";
	for (int i = 0; i<last-1;i++){
	    int k;
	    ph=data[i];
	    for (k = i; i>0&&ph.compareTo(data[k-1])<=0;k--){
		data[k]=data[k-1];
	    }
	    data[k]=ph;
	}
    }

    public String get(int index){
	if (index<=last)
	    return data[index];
	else
	    throw new ArrayIndexOutOfBoundsException();
    }
    public void set(int index, String i){
	if (index<data.length){
	    data[index]=i;
	}
    }
    public int size(){
	return last+1;
    }
    public void remove(int index){
	if (index<=last){
	    for (int i=index; i<last; i++){
		data[i]=data[i+1];
	    }
	    data[last]=null;
	    last--;
	}
	else
	    throw new ArrayIndexOutOfBoundsException();
    }
}

