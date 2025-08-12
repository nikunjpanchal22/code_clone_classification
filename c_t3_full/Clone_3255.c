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
    int dimension;
    int **box;
    dimension = 5;
    printf ("Dimension: %u\n", dimension);
    box = (int**)calloc (dimension, sizeof(int*));
    printf ("%p\n", box);
    int t;
    for (t=0; t<dimension; t++) {
        box[t] = (int*)calloc (dimension, sizeof(int));
        printf ("%d %p\n", t, box [t]);
    }
    setupBox (box, dimension, dimension);
    for (t=0; t<dimension; t++) {
        free (box[t]);
    }
    free (box);
    return 0;
}


