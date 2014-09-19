public class Driver {
    public static void main(String[]Args){
	String name = "mike zamansky";
	int index = name.indexOf(' ');
	System.out.println(name);
	System.out.println(index);
	String first = name.substring(0,index);
	String last = name.substring(index+1);
	System.out.println(first);
	System.out.println(last);
   }
}
