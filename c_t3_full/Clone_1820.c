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
    int xSize, ySize;
    int **board;
    xSize = ySize = 5;
    printf ("X: %u; Y: %u\n", xSize, ySize);
    board = (int**) calloc (xSize, sizeof (int*));
    board[0] = (int*) calloc (xSize*ySize, sizeof (int));
    printf ("%p\n", board);
    int **temp = board;
    for (int i = 0; i < xSize; i++) {
        board[i] = &(board[0][i*ySize]);
        printf ("%d %p\n", i, board [i]);
    }
    initializeBoard (board, xSize, ySize);
    temp = board;
    for (int i = 0; i < xSize; i++) {
        free (*temp);
        (temp)++;
    }
    free (board[0]);
    free (board);
    return 0;
}


