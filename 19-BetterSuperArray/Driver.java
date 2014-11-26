public class Driver{
    public static void main(String[] args){
	Sarray blah= new Sarray(10);
	try{
	    blah.add(5,10);
	}
	catch(ArrayIndexOutOfBoundsException e){
	    System.out.println("Oops, you've gone too far. That item doesn't exist yet.");

	}
    }

}
