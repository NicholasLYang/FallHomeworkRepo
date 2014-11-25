/**
 * Creates a word search puzzle
 *
 */
import java.io.*;
import java.util.*;

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
    public boolean check(String w, int row, int col, int direction)
    {
	boolean print = true;
	int r = row,c = col;
	// horizontal
	if (Math.abs(direction) == 0)
	    {
		print = !(col > board[0].length || row + w.length() > board.length);

	    }
	// vertical
	if (Math.abs(direction) == 1)
	    {
		print = !(col + w.length() > board[0].length || row > board.length);
	    }
	// left diagonal
	if (Math.abs(direction) == 2)
	    {
		print = !(col + w.length() > board[0].length || row + w.length() > board.length);
	    }
	// right diagonal
	if (Math.abs(direction) == 3)
	    {
		print = !(col - w.length() > 0 || row + w.length() > board.length);
	    }

	for (int i=0;i<w.length();i++){
	    if (board[r][c] != '.') {
		if(board[r][c] != w.charAt(i)){
		    return false;
		}
	    }
	  	// Horizontal
		if (Math.abs(direction) == 0) c++;
		// Vertical
		if (Math.abs(direction) == 1) r++;
		// Left Diagonal
		if (Math.abs(direction) == 2) 
		    {
			r++;
			c++;
		    }
		// Right Diagonal
		if (Math.abs(direction) == 3) 
		    {
			r++;
			c--;
		    }
	}
	

	return print;
    }	
	

    public void addWord(String w, int row, int col, int direction)
    {
	int r = row;
	int c = col;
	int d = direction;
	if (this.check(w, r, c, d))
	    {
		String reverse = new StringBuilder(w).reverse().toString();
	      	

	    for (int i = 0; i < w.length(); i++){
		 if (d < 0)
		    {
		
			board[r][c] = reverse.charAt(i);
		    }	
		 else
		     {
			 board[r][c]=w.charAt(i);
		     }
		// Horizontal
		if (Math.abs(d) == 0) c++;
		// Vertical
		if (Math.abs(d) == 1) r++;
		// Left Diagonal
		if (Math.abs(d) == 2) 
		    {
			r++;
			c++;
		    }
		// Right Diagonal
		if (Math.abs(d) == 3) 
		    {
			r++;
			c--;
		    }
		
			    
		
	    }
	}
	else System.out.println("Conflict");	
    }
	    
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);

	
	w.addWord("help",5,5,-2);
	System.out.println(w);
    }
}
