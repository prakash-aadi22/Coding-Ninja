import java.util.Scanner;

public class q_1_Rat_In_A_Maze {

    public static boolean ratInAMaze(int[][] maze) {
        int n = maze.length;
        int[][] path = new int[n][n];
        return solveMaze(maze, 0, 0, path);
    }

    public static boolean solveMaze(int[][] maze, int i, int j, int[][] path) {
        if (i < 0 || i >= maze.length || j < 0 || j >= maze.length || maze[i][j] == 0 || path[i][j] == 1) {
            return false;
        }
        path[i][j] = 1;
        if (i == maze.length - 1 && j == maze.length - 1) {
            return true;
        }
        if (solveMaze(maze, i - 1, j, path)) {
            return true;
        }
        if (solveMaze(maze, i, j + 1, path)) {
            return true;
        }
        if (solveMaze(maze, i + 1, j, path)) {
            return true;
        }
        if (solveMaze(maze, i, j - 1, path)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] maze = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        System.out.println(ratInAMaze(maze));
    }
}
