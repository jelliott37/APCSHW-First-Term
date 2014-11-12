import java.util.*;
public class Driver{
    public static void main(String[] args){
	ArrayList<Integer> ai= new ArrayList<Integer>();
	for (int i = 0 ; i < 20; i ++){
	    Random rand = new Random();
	    ai.add(rand.nextInt(5));
	}
	System.out.println(ai);
	for (int i = 19 ; i >0; i --){
	    if (ai.get(i)==ai.get(i-1)){
		    ai.remove(i);
		}
       
	}
	System.out.println(ai);
    }

}
