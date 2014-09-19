public class Greeter {
    private String greeting;
    
    public Greeter(){ 
	greeting="Hello World!";
    }


    
    public Greeter(String s){
	greeting =s;
    }

    public void setGreeting(String s){
	greeting = s;
    }
    
    public String getGreeting(){
	return greeting;
    }
    
    public String greetPerson(String person){
	return greeting + " " +  person;
    }

    public String loudGreet(){
	return greeting.toUpperCase();
    }
    public String greet(){
	return greeting;
    }
    
    public String ungreet(){
	return "Goodbye";
    }
}
