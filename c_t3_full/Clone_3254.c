int main (int argc, char *argv []) {
    int xSize, ySize;
    int **board;
    xSize = ySize = 5;
    printf ("X: %u; Y: %u\n", xSize, ySize);
    board = calloc (xSize, sizeof (int *));
    printf ("%p\n", board);
    int **temp = board;
    for (i = 0; i < xSize; i++) {
        board[i] = calloc (ySize, sizeof (int));
        printf ("%d %p\n", i, board [i]);
    }
    initializeBoard (board, xSize, ySize);
    temp = board;
    for (i = 0; i < xSize; i++) {
        free (*temp);
        (temp)++;
    }
    free (board);
    return 0;
}




int main (int argc, char *argv []) {
    int dim;
    int **grid;
    dim = 5;
    printf ("Dim: %u\n", dim);
    grid = (int**)calloc (dim, sizeof (int*));
    printf ("%p\n", grid);
    int i;
    for (i=0; i<dim; i++) {
        grid[i] = (int*)calloc (dim, sizeof (int));
        printf ("%d %p\n", i, grid [i]);
    }
    setupGrid (grid, dim, dim);
    for (i=0; i<dim; i++) {
        free (grid[i]);
    }
    free (grid);
    return 0;
}


