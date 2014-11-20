import java.util.*;
import java.io.*;
public class WordSearch{
    
    private char[][] board;
    
    String[] wordBank = {"DOG","CAT","FROG","HORSE","MOUSE","BAT","RABBIT","GIRAFFE","WHALE"};
    
    public WordSearch(int row,int col){
	board = new char[row][col];
	for (int r=0;r<board.length;r++){
	    for (int c=0;c<board[r].length;c++){
		board[r][c]='*';
	    }
	}
    }
    
    public WordSearch(){
	this(20,30);
    }
    
    public String toString(){
	String ans = "";
	for (int r=0;r<board.length;r++){
	    for (int c=0;c<board[r].length;c++){
		ans+=board[r][c];
	    }
	    ans+="\n";
	}
	return ans;
    }
    
    public boolean check(int r,int c,char a){
	if(r>=board.length || c>=board[r].length){
	    return false;
	}
	return board[r][c] == '*'|| board[r][c]==a;
    }
    
    public void add(String word){
	Random r = new Random();
	int xinc = 0;
	int yinc = 0;
	while (xinc==0 && yinc==0){
	    xinc = r.nextInt(3)-1;
	    yinc = r.nextInt(3)-1;
	}
	boolean test= false;
	int startr=0;
	int startc=0;
	while(!test){
	    startr = r.nextInt(board.length);
	    startc = r.nextInt(board[0].length);
	    int tempr = startr;
	    int tempc = startc;
	    for (int i=0;i<word.length();i++){
		test=check(tempr,tempc,word.charAt(i));
		if (!test){
		    break;
		}
		tempr += xinc;
		tempc += yinc;
	    }
	}
	for (int i=0;i<word.length();i++){
	    board[startr+i*xinc][startc+i*yinc]=word.charAt(i);
	}
    }
    
    
    
    
    
    public static void main(String[] args){
	int r = 20;
	int c = 30;
	try{
	    if (args.length==1){
		r=Integer.parseInt(args[0]);
	    }else if (args.length!=0){
		r=Integer.parseInt(args[0]);
		c=Integer.parseInt(args[1]);
	    }}
	catch(Exception e){}
	    WordSearch w = new WordSearch(r,c);
	System.out.println(w);
	w.add("Horse");
	System.out.println(w);
    }
}