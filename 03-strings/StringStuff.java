
public class StringStuff {
    public void test1(){
	String s1 = "hello";
	String s2 = "hello";
	String s3 = new String("hello");
	String s4 = new String("Hello");
        System.out.println("s1==s2: "+(s1==s2));
	System.out.println("s1==s3: "+(s1==s3));
	System.out.println("s1==s4: "+(s1==s4));
	System.out.println("s2==s3: "+(s2==s3));
	System.out.println("s2==s4: "+(s2==s4));
	System.out.println("s3==s4: "+(s3==s4));
	
	System.out.println(s1.equals(s2));
	System.out.println(s2.equals(s3));
	System.out.println(s1.equals(s3));
	System.out.println(s1.equals(s4));
	System.out.println(s1.equalsIgnoreCase(s4));
	
	System.out.println("aaa".compareTo("aaa"));
	System.out.println("aaa".compareTo("AAA"));
	System.out.println("aaa".compareTo("abc"));
	System.out.println("AAA".compareTo("aaa"));
	System.out.println("abc".compareTo("aaa"));
	System.out.println("aaaaaaaaaaaa".compareTo("aaa"));

	System.out.println("hello world".indexOf(" "));
	System.out.println("hello world".substring(0,5));
    }
}
