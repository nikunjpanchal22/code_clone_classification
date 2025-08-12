void main () {
    clrscr ();
    int in [10] [10];
    int out [10] [10];
    int row, column, i, j;
    printf ("enter row");
    scanf ("%d", & row);
    printf ("Enter column");
    scanf ("%d", & column);
    for (i = 1; i <= row; i++) {
        for (j = 1; j <= column; j++) {
            printf ("Enter (%d,%d)th value", i, j);
            scanf ("%d", & in [i - 1] [j - 1]);
        }
    }
    printf ("\ninput is\n\n");
    for (i = 0; i < row; i++) {
        for (j = 0; j < column; j++) {
            printf ("%d\t", in [i] [j]);
        }
        printf ("\n");
    }
    printf ("\nOutput is\n\n");
    for (i = 0; i < column; i++) {
        for (j = 0; j < row; j++) {
            printf ("%d\t", in [j] [i]);
            out[i][j] = in[j][i];
        }
        printf ("\n");
    }
    getch ();
}




void main() {
    system("clear");
    int in[10][10];
    int out[10][10];
    int row, col, i, j;
    puts("Enter row");
    scanf("%d", &row);
    puts("Enter column");
    scanf("%d", &col);
    for (i = 0; i < row; ++i) {
        for (j = 0; j < col; ++j) {
            printf("Enter value (%d,%d)\n", i + 1, j + 1);
            scanf("%d", &in[i][j]);
        }
    }
    puts("Input is");
    for (i = 0; i < row; ++i) {
        for (j = 0; j < col; ++j) {
            printf("%d  ", in[i][j]);
        }
        putchar('\n');
    }
    puts("Output is");
    for (i = 0; i < col; ++i) {
        for (j = 0; j < row; ++j) {
            printf("%d  ", in[j][i]);
            out[i][j] = in[j][i];
        }
        putchar('\n');
    }
    getchar();
}


