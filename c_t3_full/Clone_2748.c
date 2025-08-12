int main (void) {
    int i;
    int j;
    int side;
    printf ("Enter side\n");
    scanf ("%d", & side);
    for (int m = 0; m < side; m++) {
        for (j = 0; j < side; j++) {
            for (i = 0; i < side; i++) {
                for (int k = 0; k < side; k++)
                    printf ("*");
                printf (" ");
            }
            printf ("\n");
        }
        printf ("\n");
    }
    system ("Pause");
    return 0;
}





int main () {
    int a, b, c, d, edge;
    printf ("Enter side\n");
    scanf ("%d", & edge);
    for (a = 0; a < edge; a++) {
        for (b = 0; b < edge; b++) {
            for (c = 0; c < edge; c++) {
                for (d = 0; d < edge; d++)
                    printf ("*");
                printf (" ");
            }
            printf ("\n");
        }
        printf ("\n");
    }
    system ("Pause");
    return 0;
}


