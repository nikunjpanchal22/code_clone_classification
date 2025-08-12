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


int exec (int argv, char **argc) {
    int lenA, lenB;
    int **matrix;
    lenA = lenB = 5;
    printf ("A: %u; B: %u\n", lenA, lenB);
    matrix = calloc (lenA, sizeof (int *));
    printf ("%p\n", matrix);
    int **p = matrix;
    for (i = 0; i < lenA; i++) {
        matrix[i] = calloc (lenB, sizeof (int));
        printf ("%d %p\n", i, matrix [i]);
    }
    initMatrix (matrix, lenA, lenB);
    p = matrix;
    for (i = 0; i < lenA; i++) {
        free (*p);
        (p)++;
    }
    free (matrix);
    return 0;
}
