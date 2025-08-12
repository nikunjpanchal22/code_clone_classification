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
    int first[10][10],second[10][10],xorg,yorg,m,n;
    printf ("Rows size: ");
    scanf ("%d", &xorg);
    printf ("Columns size: ");
    scanf ("%d", &yorg);
    for (m = 0; m < xorg; m++) {
        for (n = 0; n < yorg; n++) {
            printf ("Enter (%d,%d)th value: ", m+1, n+1);
            scanf ("%d", &first[m][n]);
        }
    }
    printf ("\nInitial Matrix:\n\n");
    for (m = 0; m < xorg; m++) {
        for (n = 0; n < yorg; n++) {
            printf ("%d\t", first[m][n]);
        }
        printf ("\n");
    }
    printf ("\nFinal Matrix:\n\n");
    for (n = 0; n < yorg; n++) {
        for (m = 0; m < xorg; m++) {
            printf ("%d\t", first[m][n]);
            second[n][m] = first[m][n];
        }
        printf ("\n");
    }
    getch ();
}


