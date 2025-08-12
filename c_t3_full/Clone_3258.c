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
    int length;
    int **fusion;
    length = 5;
    printf ("Length: %u\n", length);
    fusion = (int**)calloc (length, sizeof(int*));
    printf ("%p\n", fusion);
    int i;
    for (i=0; i<length; i++) {
        fusion[i] = (int*)calloc (length, sizeof(int));
        printf ("%d %p\n", i, fusion [i]);
    }
    setupFusion (fusion, length, length);
    for (i=0; i<length; i++) {
        free (fusion[i]);
    }
    free (fusion);
    return 0;
}


