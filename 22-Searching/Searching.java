public class Searching{
    private String[] a;
    private int last=0;
    public Searching(int b){
	a= new String[b];
    }
    public void additem(String item){
	if (last<a.length){
	    a[last]= item;
	    last++;
	}
    }
    public String lsearch(String b){
	for (String c: a){
	    if(c.compareTo(b)==0){
		return c;
	    }
	}
	return null;
    }
    public String bsearch(String b){
	int low = 0;
	int high = a.length;
	while (low<high){
	    int mid = (high + low)/2;
	    if (a[mid].compareTo(b)==0){
		return a[mid];
	    }
	    else if(a[mid].compareTo(b)<0){
		low=mid;
	    }
	    else{
		high=mid;
	    }
	}
	return null;
    }
    public String rbsearch(int low, int high, String b){
	int mid = (high+low)/2;
	if (a[mid].compareTo(b)==0){
	    return a[mid];
	}
	else if (low>=high){
	    return null;
	}
	else if (a[mid].compareTo(b)<0){
        return rbsearch(mid, high, b);
	}
	else {
        return rbsearch(low, mid, b);
	}
    }
    public static void main(String[] args){
	
    }
}
