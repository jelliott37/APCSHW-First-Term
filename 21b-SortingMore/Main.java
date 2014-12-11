import java.util.*;
<<<<<<< HEAD
import java.io.*;

public class Main{
    public static void main(String[] args){
	Mage[] blah= new Mage[2];
	blah[0]=new Mage("B");
	blah[1]=new Mage("A");
	Arrays.sort(blah);
	for (Mage i: blah){
	    System.out.println(i);
	}
    }
}
=======

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
>>>>>>> 29c90705e20c5985553f802c7fd769d7f86e0134
