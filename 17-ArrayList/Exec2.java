import java.util.*;
import java.io.*;

public class Exec2{
    public static void main(String[] args){
	int lastNum = 10;
	if (args.length > 0){
	    try {
		lastNum = Integer.parseInt(args[0]);
	    } catch(Exception e){lastNum = 10;}
	}
	Integer[] ai = new Integer[lastNum+1];
	for (int i = 0; i <= lastNum; i++){
	    ai[i]=i;
	}
	//System.out.println("Original Array: " + ai);
	//Time Efficient :D :D :D :D :D
	/* Try 1
	   ArrayList<Integer> answer = new ArrayList<Integer>();
	   Random r = new Random();
	   while (ai.size() != 0){
	   int a = r.nextInt(ai.size());
	   answer.add(ai.get(a));
	   ai.remove(a);
	   }
	*/
	//Try 2
	Random r = new Random();
	while (lastNum >= 0){
	    int a = r.nextInt(lastNum + 1);
	    int b = ai[a];
	    for (int i = a; i <ai.length-1;i++){
		ai[i]=ai[i+1];
	    }
	    ai[ai.length-1]=b;
	    lastNum--;
	}

	System.out.println("Randomized:");
	for (int i = 0 ; i < ai.length;i++){
	    System.out.println(ai[i]);
	}
    }
}