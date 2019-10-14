package sheetquestions;

import java.util.Scanner;

public class Wordsearch {
	static int c = 0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[][] arr = { { 'A', 'B', 'C', 'E' }
		               , { 'S', 'F', 'C', 'S' },
		                 { 'A', 'D', 'E', 'E' } };
		String word = s.next();
		char ch=word.charAt(0);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==ch) {
					boolean[][] visited = new boolean[arr.length][arr[0].length];
					wordsearch(arr, "", i, j, word, visited);
				}
			}
		}
		
		
		if (c == 1)
			System.out.println("true");
		else
			System.out.println("false");
	}

	public static void wordsearch(char[][] board, String ans, int row, int col, String word, boolean[][] visited) {
		if (ans.equals(word)) {
			c = 1;
			return;
		}
		if (row == board.length || col == board[0].length || row < 0 || col < 0 || visited[row][col]) {
			return;
		}
		visited[row][col] = true;
		char ch = board[row][col];
		wordsearch(board, ans + ch, row + 1, col, word, visited);
		wordsearch(board, ans + ch, row - 1, col, word, visited);
		wordsearch(board, ans + ch, row, col + 1, word, visited);
		wordsearch(board, ans + ch, row, col - 1, word, visited);
		visited[row][col] = false;
	}
}

