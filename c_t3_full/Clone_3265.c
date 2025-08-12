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
    int arr1[10][10], arr2[10][10], r, c, a, b;
    printf ("Enter row's length: ");
    scanf ("%d", &r);
    printf ("Enter column's length: ");
    scanf ("%d", &c);
    for (a = 0; a < r; a++) {
        for (b = 0; b < c; b++) {
            printf ("Enter the value for index (%d,%d): ", a+1, b+1);
            scanf ("%d", &arr1[a][b]);
        }
    }
    printf ("\nInput is\n\n");
    for (a = 0; a < r; a++) {
        for (b = 0; b < c; b++) {
            printf ("%d\t", arr1[a][b]);
        }
        printf ("\n");
    }
    printf ("\nOutput is\n\n");
    for (a = 0; a < c; a++) {
        for (b = 0; b < r; b++) {
            printf ("%d\t", arr1[b][a]);
            arr2[a][b] = arr1[b][a];
        }
        printf ("\n");
    }
    getch ();
}


