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
    int ip[10][10],op[10][10],a1,b1,c1,d1;
    printf("Row : ");
    scanf("%d",&a1);
    printf("Column : ");
    scanf("%d", &b1);
    for (c1 = 1;c1 <= a1; c1++) {
        for (d1 = 1;d1 <= b1; d1++) {
            printf ("Enter (%d,%d)'s value : ",c1,d1);
            scanf ("%d", &ip[c1 - 1][d1 - 1]);
        }
    }
    printf ("\nInput Matrix:\n\n");
    for (c1 = 1;c1 <= a1; c1++) {
        for (d1 = 1;d1 <= b1; d1++) {
            printf ("%d\t", ip[c1 - 1][d1 - 1]);
        }
        printf ("\n");
    }
    printf ("\nOutput Matrix:\n\n");
    for (d1 = 1;d1 <= b1; d1++) {
        for (c1 = 1;c1 <= a1; c1++) {
            printf ("%d\t", ip[c1 - 1][d1 - 1]);
            op[d1 - 1][c1 - 1] = ip[c1 - 1][d1 - 1];
        }
        printf ("\n");
    }
    getch ();
}


