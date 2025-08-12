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
    int aSize, bSize;
    int **array;
    aSize = bSize = 5;
    printf ("A: %u; B: %u\n", aSize, bSize);
    array = calloc (aSize, sizeof (int *));
    printf ("%p\n", array);
    int **tmp = array;
    for (i = 0; i < aSize; i++) {
        array[i] = calloc (bSize, sizeof (int));
        printf ("%d %p\n", i, array [i]);
    }
    initializeArray (array, aSize, bSize);
    tmp = array;
    for (i = 0; i < aSize; i++) {
        free (*tmp);
        (tmp)++;
    }
    free (array);
    return 0;
}
