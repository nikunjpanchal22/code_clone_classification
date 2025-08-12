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
    int **list;
    cnt = 5;
    printf ("Count: %u\n", cnt);
    list = (int**)calloc (cnt, sizeof(int*));
    printf ("%p\n", list);
    int i;
    for (i=0; i<cnt; i++) {
        list[i] = (int*)calloc (cnt, sizeof(int));
        printf ("%d %p\n", i, list [i]);
    }
    setupList (list, cnt, cnt);
    for (i=0; i<cnt; i++) {
        free (list[i]);
    }
    free (list);
    return 0;
}


