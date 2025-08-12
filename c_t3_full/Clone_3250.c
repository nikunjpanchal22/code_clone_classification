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
    int num;
    int **table;
    num = 5;
    printf ("Num: %u\n", num);
    table = (int**)calloc (num, sizeof(int*));
    printf ("%p\n", table);
    int i;
    for (i=0; i<num; i++) {
        table[i] = (int*)calloc (num, sizeof(int));
        printf ("%d %p\n", i, table [i]);
    }
    initTable (table, num, num);
    for (i=0; i<num; i++) {
        free (table[i]);
    }
    free (table);
    return 0;
}


