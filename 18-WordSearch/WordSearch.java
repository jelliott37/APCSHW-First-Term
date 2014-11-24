import java.util.*;
import java.io.*;
public class WordSearch{
    
    private char[][] board;
    
    ArrayList<String> wordBank=new ArrayList<String>();
    
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
		ans+=board[r][c]+" ";
	    }
	    ans+="\n\n";
	}
	return ans;
    }
    
    public boolean check(int r,int c,char a){
	
	if(r<0||c<0){
	    return false;
	}
	else if (r>=board.length || c>=board[r].length){
	    return false;
	}
	return board[r][c] == '*'|| board[r][c]==a;
        
 
	
    }
    
    public boolean find(int r,int c,char[] a,int dr, int dc){
	for (char i:a){
	    
	    if(r<0||c<0){
		return false;
	    }
	    else if (r>=board.length || c>=board[0].length){
		return false;
	    }
	    else if(board[r][c]!=i){
		return false;
	    }
	    r+=dr;
	    c+=dc;
	}
	return true;

        
 
	
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
	int iter=0;
	while(!test&&iter<5){
	    startr = r.nextInt(board.length);
	    startc = r.nextInt(board[0].length);
	    int tempr = startr;
	    int tempc = startc;
	    for (int i=0;i<word.length();i++){
		test=check(tempr,tempc,word.charAt(i));
		if (!test){
		    iter++;
		    break;
		}
		tempr += xinc;
		tempc += yinc;
	    }
	}
	if (iter!=5){
	    for (int i=0;i<word.length();i++){
		board[startr+i*xinc][startc+i*yinc]=word.charAt(i);
	    }
	}
    }
    
    public void fill(){
	Random r = new Random();
	for (int i = 0; i < board.length;i++){
	    for (int j = 0; j<board[i].length;j++){
		if (board[i][j]=='*'){
		    board[i][j]=(char)(r.nextInt(26)+'A');
		    // System.out.println(board[i][j]);
		}
	    }
	}
    }
    
    public void getWordBank(Scanner sc){
	while(sc.hasNext()){
	    wordBank.add(sc.next());
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
	    }
	}
	catch(Exception e){}
	Scanner sc = null;
	try{
	    sc = new Scanner(new File("words.txt"));
	}
	catch(Exception e){
	    System.out.println("No words.txt file in current directory");
	    System.exit(0);
	}
	WordSearch w = new WordSearch(r,c);
	w.getWordBank(sc);
	System.out.println(w);
	for (String s : w.wordBank){ 
	    w.add(s);
	}
	w.fill();
	System.out.println(w);
	Scanner scan= new Scanner(System.in());
	for(String s : w.wordBank){
	    boolean found=false;
	    while(!found){
		System.out.println("Please find this word:"+s);
		System.out.println("Input the number of rows from the top");
		int row=scan.nextInt();
		System.out.println("Input the number of columns from the left");
		int col = scan.nextInt();
		System.out.println("");
	    }
	}
    }
}
