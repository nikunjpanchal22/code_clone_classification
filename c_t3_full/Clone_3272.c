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




#include<stdio.h>
#include<conio.h>
void main () {
    clrscr ();
    int la[10][10],lc[10][10], a0, a1, x, y;
    printf ("Rows number is ");
    scanf ("%d", &a0);
    printf ("Columns number is ");
    scanf ("%d", &a1);
    for (x = 1; x <= a0; x++) {
        for (y = 1; y <= a1; y++) {
            printf ("Enter (%d,%d)th value", x, y);
            scanf ("%d", &la[x - 1][y - 1]);
        }
    }
    printf ("\nInput:\n\n");
    for (x = 1; x <= a0; x++) {
        for (y = 1; y <= a1; y++) {
            printf ("%d\t", la[x - 1][y - 1]);
        }
        printf ("\n");
    }
    printf ("\nOutput:\n\n");
    for (x = 1; x <= a1; x++) {
        for (y = 1; y <= a0; y++) {
            printf ("%d\t", la[y - 1][x - 1]);
            lc[x - 1][y - 1] = la[y - 1][x - 1];
        }
        printf ("\n");
    }
    getch ();
}


