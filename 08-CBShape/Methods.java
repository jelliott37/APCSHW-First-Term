public class Methods{
    public String line(String s, int h){
	String retStr="";
	for(int i=0; i<h;i++){
	    retStr+=s;
	}
	return retStr;
    }
    public String frame(int r, int c){
	String box=line("*", c)+"\n";
	for (int i=0; i<r-2;i++){
	    box+="*" + line(" ", c-2) + "*"+"\n";
	}
	box+=line("*", c);
	return box;
    }
    public String stringSplosion(String str) {
	String retStr="";
	for (int i=0; i <= str.length(); i++){
	    retStr+=str.substring(0,i);
	}
	return retStr;
    }
    public String stringX(String str) {
	String retStr="";
	if (str.length()>=1){
	    retStr+=str.charAt(0);
	}
	for (int i=1; i<str.length()-1;i++){
	    if ( !(str.charAt(i)=='x')){
		retStr+=str.charAt(i);
		
	    }
	}
	if (str.length()>1){ 
	    retStr+=str.charAt(str.length()-1);
	}
	return retStr;
    }


}
