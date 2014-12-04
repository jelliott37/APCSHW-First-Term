public class Driver{
    public static void main(String[] args){
	Sarray blah= new Sarray(5);
	blah.add("1");
	blah.add("2");
	blah.add("asdf");
	blah.add("A");
	blah.add("ab");
	System.out.println(blah);
	blah.isort();
	System.out.println(blah);
    }

}
