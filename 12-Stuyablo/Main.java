import java.util.*;
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
