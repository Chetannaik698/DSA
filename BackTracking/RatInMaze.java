package BackTracking;

public class RatInMaze {
    static int[] dr = {-1, +1, 0, 0};
  static int[] dc = {0, 0, +1, -1};
  static char[] dir = {'U', 'D', 'R', 'L'};

  public static void rec(int[][] maze, int row, int col, int n, String path) {
    if(col >= n || row >= n || col < 0 || row < 0) {
      // matrix out of bound
      return;
    }

    if(maze[row][col] == -1 || maze[row][col] == 1) {
      // already visited cell or blocked cell
      return;
    }

    if(row == n - 1 && col == n - 1) {
      System.out.println(path);
      return;
    }

    maze[row][col] = -1; // visited mark

    for(int idx = 0; idx < 4; idx++) {
        int nr = row + dr[idx];
        int nc = col + dc[idx];
        rec(maze, nr, nc, n, path + dir[idx]);
    }

    maze[row][col] = 0; // unvisited mark 
  }

  public static void main(String[] args) {
    int[][] mat = {{0, 0, 0, 1}, {0, 1, 0, 1}, {0, 0, 0, 0}, {0, 1, 1, 0}};

    rec(mat, 0, 0, mat.length, "");
  }
}
