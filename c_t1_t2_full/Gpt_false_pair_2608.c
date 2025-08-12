void main () {
    int m, row, col;
    int array [2] [5] [2] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 18, 21, 3, 4, 5, 6, 7, 81, 9, 11};
    int (*p) [5] [2];
    p = array;
    for (m = 0; m < 2; m++) {
        for (row = 0; row < 5; row++) {
            for (col = 0; col < 2; col++) {
                printf ("\n the vale is %d", * ((int *) (p + m) + (row * 2) + col));
            }
        }
    }
}


void main () {
    int m, row, col;
    int array [2] [5] [2] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 18, 21, 3, 4, 5, 6, 7, 81, 9, 11};
    int (*p) [5] [2];
    p = array;
    for (m = 0; m < 2; m++) {
        for (row = 0; row < 5; row++) {
            int *ptr = p[m][row];
            for (col = 0; col < 2; col++) {
                printf ("\n the vale is %d", *(ptr+col));
            }
        }
    }
}
