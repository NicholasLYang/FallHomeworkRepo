/**
 * Creates a word search puzzle
 *
 */
public class WordSearch{

    private char[][] board;

    public WordSearch(int r, int c)
    {
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
				
    }
    public WordSearch()
    {
	this(20,30);
    }

    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

	
    public boolean checkH(String w, int row, int col){
	boolean print = true;
	int r = row,c = col;
	if (col + w.length() > board[0].length)
	    {
		return false;
	    }
	if (row > board.length)
	    {
		return false;
	    }
	for (int i=0;i<w.length();i++){
	    if (board[r][c] != '.') {
		if(board[r][c] != w.charAt(i)){
		    return false;
		}
	    }
	    c++;
	}
	

	return true;
    }

    public void addWordH(String w, int row, int col){
	int r=row,c=col;
	if(checkH(w,r,c)){
	    for (int i = 0; i < w.length(); i++){
		board[r][c]=w.charAt(i);
		c++;
	    }
	}
	else System.out.println("Conflict");
    }
    public void addReverseWordH(String w, int row, int col)
    {
	String reverse = new StringBuilder(w).reverse().toString();
	
	this.addWordH(reverse, row, col);

    }
    public boolean checkV(String w, int row, int col)
    {

	int r = row,c = col;
	if (col > board[0].length)
	    {
		return false;
	    }
	if (row + w.length() > board.length)
	    {
		return false;
	    }
	for (int i=0;i<w.length();i++){
	    if (board[r][c] != '.') {
		if(board[r][c] != w.charAt(i)){
		    return false;
		}
	    }
	    r++;
	}
	

	return true;
    }	
    public void addWordV(String w, int row, int col)
    {
	int r = row;
	int c = col;
	if (this.checkV(w, r, c))
	    {
	    for (int i = 0; i < w.length(); i++){
		board[r][c]=w.charAt(i);
		r++;
	    }
	}
	else System.out.println("Conflict");	
    }
    public void addReverseWordV(String w, int row, int col)
    {
	String reverse = new StringBuilder(w).reverse().toString();
	this.addWordV(reverse, row, col);
    }
	    
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	w.addWordH("hello",3,5);
	w.addReverseWordH("world",4,8);
	w.addWordV("height", 3, 5);
	w.addReverseWordV("help", 11, 12);
				
	System.out.println(w);
    }
}