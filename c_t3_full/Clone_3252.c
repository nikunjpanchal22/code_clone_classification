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
    int **frame;
    length = 5;
    printf ("Length: %u\n", length);
    frame = (int**)calloc (length, sizeof(int*));
    printf ("%p\n", frame);
    int i;
    for (i=0; i<length; i++) {
        frame[i] = (int*)calloc (length, sizeof(int));
        printf ("%d %p\n", i, frame [i]);
    }
    setFrame (frame, length, length);
    for (i=0; i<length; i++) {
        free (frame[i]);
    }
    free (frame);
    return 0;
}


