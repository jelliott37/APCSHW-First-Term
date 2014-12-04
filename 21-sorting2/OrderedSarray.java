public class OrderedSarray extends Sarray{
    public OrderedSarray(int n){
	super(n);
    }
    public OrderedSarray(){
	this(10);
    }
    public void add(String n){
	for(int i = 0; i<size()-1;i++){
	    int test=super.get(i).compareTo(super.get(i+1));
	    if (test>0){
		super.add(i,n);
	    }
	    else super.add(n);
	}
	super.last++;

    }
    public void add(int index, String n){
	add(n);
    }
    public void set(int index, String n){
	super.remove(index);
	add(n);
    }
}
