package W06;

// Try it answer for video #33 (try it yourself first): a noughts and crosses board in a 2D char array.
// Print the board row by row and count the X marks.
public class W06E30 {
    public static void main(String[] args) {
        char[][] board = {
            {'X', 'O', 'X'},
            {' ', 'X', 'O'},
            {'O', ' ', 'X'}
        };
        int xCount = 0;
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                System.out.print("[" + board[r][c] + "]");
                if (board[r][c] == 'X') {
                    xCount++;
                }
            }
            System.out.println();
        }
        System.out.println("X marks: " + xCount);
    }
}
