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
    int arr1[10][10], arr2[10][10], a, b, c, d;
    printf ("Enter NO. of rows: ");
    scanf ("%d", &a);
    printf ("Enter NO. of columns: ");
    scanf ("%d", &b);
    for (c = 1; c <= a; c++) {
        for (d = 1; d <= b; d++) {
            printf ("Enter (%d,%d)th value: ", c, d);
            scanf ("%d", &arr1[c - 1][d - 1]);
        }
    }
    printf ("\nEntered data is\n\n");
    for (c = 1; c <= a; c++) {
        for (d = 1; d <= b; d++) {
            printf ("%d\t", arr1[c - 1][d - 1]);
        }
        printf ("\n");
    }
    printf ("\nOutput is\n\n");
    for (d = 1; d <= b; d++) {
        for (c = 1; c <= a; c++) {
            printf ("%d\t", arr1[c - 1][d - 1]);
            arr2[d - 1][c - 1] = arr1[c - 1][d - 1];
        }
        printf ("\n");
    }
    getch ();
}


