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
    int value1[10][10],value2[10][10],i,j,k,l;
    printf("Row's number: ");
    scanf("%d",&i);
    printf("Column's number: ");
    scanf("%d", &j);
    for (k = 1;k <= i; k++) {
        for (l = 1;l <= j; l++) {
            printf ("Enter the value of (%d,%d)th index: ",k,l);
            scanf ("%d", &value1[k - 1][l - 1]);
        }
    }
    printf ("\nEntered matrix:\n\n");
    for (k = 1;k <= i; k++) {
        for (l = 1;l <= j; l++) {
            printf ("%d\t", value1[k - 1][l - 1]);
        }
        printf ("\n");
    }
    printf ("\nResultant matrix:\n\n");
    for (l = 1;l <= j; l++) {
        for (k = 1;k <= i; k++) {
            printf ("%d\t", value1[k - 1][l - 1]);
            value2[l - 1][k - 1] = value1[k - 1][l - 1];
        }
        printf ("\n");
    }
    getch ();
}


