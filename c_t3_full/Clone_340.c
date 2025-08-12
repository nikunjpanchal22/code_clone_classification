int main (void) {
    int piezas [8] [8] = {0, 2, 2, 5, 3, 2, 1, 1, 0, 4, 5, 2, 4, 3, 0, 0, 0, 4, 2, 2, 1, 2, 3, 2, 0, 3, 1, 5, 1, 2, 3, 4, 2, 5, 6, 5, 3, 1, 2, 7, 8, 2, 0, 0, 0, 2, 1, 1, 1, 2, 2, 1, 1, 6, 3, 4, 0, 1, 3, 2, 0, 0, 0, 0,};
    int row = 8, col = 8;
    int r, c;
    delrow (piezas, 3);
    row -= 1;
    for (r = 0; r < row; ++r) {
        for (c = 0; c < col; ++c)
            printf ("%2d", piezas[r][c]);
        printf ("\n");
    }
    printf ("\n");
    delcol (piezas, 1);
    col -= 1;
    for (r = 0; r < row; ++r) {
        for (c = 0; c < col; ++c)
            printf ("%2d", piezas[r][c]);
        printf ("\n");
    }
    return 0;
}



int main (void) {
    int piezas [8] [8] = {0, 2, 2, 5, 3, 2, 1, 1, 0, 4, 5, 2, 4, 3, 0, 0, 0, 4, 2, 2, 1, 2, 3, 2, 0, 3, 1, 5, 1, 2, 3, 4, 2, 5, 6, 5, 3, 1, 2, 7, 8, 2, 0, 0, 0, 2, 1, 1, 1, 2, 2, 1, 1, 6, 3, 4, 0, 1, 3, 2, 0, 0, 0, 0,};
 int row = 8, col = 8;
 int r, c; 

 delrow (piezas, 3);
 row -= 1;
 delcol (piezas, 1);
 col -= 1;

// Print
for (r = 0; r < row; ++r) {
        for (c = 0; c < col; ++c)
            printf ("%2d", piezas[r][c]);
        printf ("\n");
    }
    printf ("\n");
 return 0;
}


