public class Search{
    public Comparable lsearch(Comparable[] a, Comparable b){
	for (Comparable c: a){
	    if(c.compareTo(b)==0){
		return c;
	    }
	}
	return null;
    }
    public Comparable bsearch(Comparable[] a, Comparable b){
	int low = 0;
	int high = a.length;
	while (low<high){
	    
	}
    }
}
