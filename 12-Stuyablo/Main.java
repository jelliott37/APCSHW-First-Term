import java.util.*;

public class Main{
    public static void main(String[] args){
	Mage[] m = new Mage[3];
	m[2]=new Mage("Bob");
	m[1]=new Mage("Arya");
	m[0] = new Mage("Larry");
	Arrays.sort(m);
	for (Mage s: m){
	    System.out.println(s);
	}
    }
}