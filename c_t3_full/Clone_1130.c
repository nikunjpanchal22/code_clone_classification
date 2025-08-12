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


 	int main (void) {
    int i;
    int j;
    int side;
    printf ("Enter side\n");
    scanf ("%d", & side);
    int m = 0;
    while (m < side) {
        j = 0;
        while (j < side) {
            i = 0;
            while (i < side) {
                int k = 0;
                while (k < side) {
                    printf ("*");
                    k++;
                }
                printf (" ");
                i++;
            }
            printf("\n");
            j++;
        }
        printf ("\n");
        m++;
    }
    system ("Pause");
    return 0;
}


