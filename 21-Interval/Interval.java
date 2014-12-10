import java.util.Random;
public class Interval{
    private int min, max;
    private Random r;
    public Interval{
	min=1;
	max=2;
    }
    public Interval(int l, int h){
	min=l;
	max=h;
    }
    public int compareTo(Interval i){
	if (min==i.getMin() && max==i.getMax()){
	    return 0;
	}
	else if (min>i.getMin()){
	    return 1;
	}
	return -1;
    }
    public int getMin(){
	return min;
    }
    public int getMax(){
	return max;
    }
}