//done with Jeanne
public class Shapes{
    public String box(int r, int c){
	String row = "";
	int reset = c;    
	while (r > 0){
	    c = reset;
	    while (c > 0){
		row = row + "*";
		c = c - 1;
	    }
	    row = row + "\n";
	    r = r - 1;
	}
	return row;
    }

    public String tri1(int s){
	String triangle = "";
	int tall = s;
	int fat = 1;
	int it = 1;
	while (tall > 0){
	    while (it > 0){
		triangle+="*";
		it-=1;
	    }
	    fat+=1;
	    it = fat;
	    triangle+="\n";
	    tall-=1;
	}
	return triangle;
    }

    public String tri2(int s){
	String triangle = "";
	int tall = s;
	int fat = 1;
	int it = 1;
	int space = s;
	while (tall > 0){
	    while (space > it){
		triangle+=" ";
		space-=1;
	    }
	    while (it > 0){
		triangle+="*";
		it-=1;
	    }
	    fat+=1;
	    it = fat;
	    triangle+="\n";
	    space=s;
	    tall-=1;
	}
	return triangle;
    }
    
    public String tri3(int h){
	int width=0;
	String s="";
	/*int i=1;
	  while (i<h){
	      int blah=0;
	      while (blah<h-i){
		  s+=" ";
		  blah++;
	      }
	      while (blah<h+i-1){
		  s+="*";
		  blah++;
	      }
	      s+="\n";
	      i++;
	      }*/
	
	for (int i=1;i<h;i++){
	      for (int blah=0;blah<h-i;blah++){
		  s+=" ";
	      }
	 
	      for (int blah=h-i;blah<h+i-1;blah++){
		  s+="*";
	      }
	      s+="\n";
       }
       return s;
	
    }
}
