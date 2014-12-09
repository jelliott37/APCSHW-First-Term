import java.io.*;
import java.util.*;
public class Interval {
    private int low, high;
    private Random r = new Random();
    public Interval(){
	int m1=r.nextInt(200)-100;
	int m2=r.nextInt(200)-100;
	if (m2==m1){
	    m2+=1;
	}
	setLow(Math.min(m1,m2));
	setHigh(Math.max(m1,m2));
    }

    public String toString(){
	return "["+low+", " +high+"]";
    }

    public int getLow(){
	return low;
    }
    public int getHigh(){
	return high;
    }
    public void setHigh(int h){
	high=h;
    }
    public void setLow(int l){
	low=l;
    }

}
    
