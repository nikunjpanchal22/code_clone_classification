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
    int cnt;
    int **pile;
    cnt = 5;
    printf ("Count: %u\n", cnt);
    pile = (int**)calloc (cnt, sizeof(int*));
    printf ("%p\n", pile);
    int i;
    for (i=0; i<cnt; i++) {
        pile[i] = (int*)calloc (cnt, sizeof(int));
        printf ("%d %p\n", i, pile [i]);
    }
    setupPile (pile, cnt, cnt);
    for (i=0; i<cnt; i++) {
        free (pile[i]);
    }
    free (pile);
    return 0;
}


