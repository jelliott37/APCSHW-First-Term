public class Main {

    public static void main(String[] args){

	// we are declaring g to be of type Greeter
	Greeter g1 = new Greeter();
	// local variable
	Greeter g2,g3;

	g2= new Greeter();
	//call greet method on instance g
        g3=g1;

      
	
	System.out.println("g1: "+g1);	
	System.out.println("g2: "+g2);	
	System.out.println("g3: "+g3);	
    }
}
