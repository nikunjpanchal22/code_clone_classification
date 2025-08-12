public static void main (String [] args) {
    int [] [] matrix = new int [] [] {{1, 2, 2}, {2, 2, 3}, {0, 1, 2}};
    int result = 1;
    for (int i = 0;
    i < matrix.length; i ++) {
        result = result * matrix [i] [i];
    }
    System.out.println ("Result: " + result);
}





public static void main (String [] args) {
    int [][] grid = {{1, 2, 2}, {2, 2, 3}, {0, 1, 2}};
    int finalResult = 1;
    for (int i = 0; i < grid.length; i++)
        finalResult *= grid[i][i];
    System.out.println ("Final Result: " + finalResult);
}


