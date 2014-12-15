public class Searching{
    private Comparable[] a;
    private int last=0;
    public Searching(int b){
	a= new Comparable[b];
    }
    public void additem(Comparable item){
	if (last<a.length){
	    a[last]= item;
	    last++;
	}
    }
    public Comparable lsearch(Comparable b){
	for (Comparable c: a){
	    if(c.compareTo(b)==0){
		return c;
	    }
	}
	return null;
    }
    public Comparable bsearch(Comparable b){
	int low = 0;
	int high = a.length;
	while (low<high){
	    int mid = (high + low)/2;
	    if (a[mid].comparesTo(b)==0){
		return a[mid];
	    }
	    else if(a[mid].comparesTo(b)<0){
		low=mid;
	    }
	    else{
		high=mid;
	    }
	}
	return null;
    }
    public Comparable rbsearch(int low, int high, Comparable item){
	int mid = (high+low)/2;
	if (a[mid].comparesTo(b)==0){
	    return a[mid];
	}
	else if (low>=high){
	    return null;
	}
	else if (a[mid].comparesTo(b)<0){
	    rbsearch(mid, high, item);
	}
	else {
	    rbsearch(low, mid, item);
	}
    }
    public static void main(String[] args){
	
    }
}
