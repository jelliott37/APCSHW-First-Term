
public class Driver(){
    public static void main(String[] args){
	
    }
    public boolean mixStart(String str) {
	return str.startsWith("ix", 1);
    }
    public String makeOutWord(String out, String word) {
	return out.substring(0,2) + word + out.substring(2);
    }
    public String firstHalf(String str) {
	return str.substring(0,str.length()/2);
    }
}