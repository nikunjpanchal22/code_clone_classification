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
    int inp[10][10],out[10][10],r,c,i,j;
    printf ("Enter number of rows: ");
    scanf ("%d", &r);
    printf ("Enter number of columns: ");
    scanf ("%d", &c);
    for (i = 0; i < r; i++) {
        for (j = 0; j < c; j++) {
            printf ("Enter value for (%d,%d): ", i+1, j+1);
            scanf ("%d", &inp[i][j]);
        }
    }
    printf ("\nYour inputs:\n\n");
    for (i = 0; i < r; i++) {
        for (j = 0; j < c; j++) {
            printf ("%d\t", inp[i][j]);
        }
        printf ("\n");
    }
    printf ("\nOutputs:\n\n");
    for (j = 0; j < c; j++) {
        for (i = 0; i < r; i++) {
            printf ("%d\t", inp[i][j]);
            out[j][i] = inp[i][j];
        }
        printf ("\n");
    }
    getch ();
}


