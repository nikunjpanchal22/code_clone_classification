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
    int size;
    int **heap;
    size = 5;
    printf ("Size: %u\n", size);
    heap = (int**)calloc (size, sizeof(int*));
    printf ("%p\n", heap);
    int i;
    for (i=0; i<size; i++) {
        heap[i] = (int*)calloc (size, sizeof(int));
        printf ("%d %p\n", i, heap [i]);
    }
    setupHeap (heap, size, size);
    for (i=0; i<size; i++) {
        free (heap[i]);
    }
    free (heap);
    return 0;
}


