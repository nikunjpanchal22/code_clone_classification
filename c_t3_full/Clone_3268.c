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
    int x[10][10],y[10][10],i,j,k,l;
    printf("Enter number of rows: ");
    scanf("%d",&i);
    printf("Enter number of columns: ");
    scanf("%d",&j);
    for (k = 0;k < i; k++) {
        for (l = 0;l < j; l++) {
            printf ("Enter the value at %d row and %d column: ",k+1,l+1);
            scanf ("%d", &x[k][l]);
        }
    }
    printf ("\nInput Matrix:\n\n");
    for (k = 0;k < i; k++) {
        for (l = 0;l < j; l++) {
            printf ("%d\t", x[k][l]);
        }
        printf ("\n");
    }
    printf ("\nOutput Matrix:\n\n");
    for (l = 0;l < j; l++) {
        for (k = 0;k < i; k++) {
            printf ("%d\t", x[k][l]);
            y[l][k] = x[k][l];
        }
        printf ("\n");
    }
    getch ();
}


