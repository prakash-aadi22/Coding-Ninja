import java.util.Scanner;

public class q_2_Rat_In_a_Maze_All_Paths {

    static void ratInAMaze(int[][] maze, int n) {
        int[][] path = new int[maze.length][maze.length];
        printAllPaths(maze, 0, 0, path, n);
    }

    public static void printAllPaths(int[][] maze, int i, int j, int[][] path, int n) {
        if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
            return;
        }
        path[i][j] = 1;
        if (i == n - 1 && j == n - 1) {
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    System.out.print(path[r][c] + " ");
                }
            }
            path[i][j] = 0;
            System.out.println();
            return;
        }

        //top
        printAllPaths(maze, i - 1, j, path, n);
        //down
        printAllPaths(maze, i + 1, j, path, n);
        //left
        printAllPaths(maze, i, j - 1, path, n);
        //right
        printAllPaths(maze, i, j + 1, path, n);

        path[i][j] = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] maze = new int[20][20];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        ratInAMaze(maze, n);
    }
}
