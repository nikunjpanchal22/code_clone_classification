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
    for (int m = 0; m < side; m++) {
        for (int j = 0; j < side; j++) {
            for (int i = 0; i < side; i++) {
                int k = 0;
                while (k < side * side * side) {
                    printf ("*");
                    k++;
                }
                printf (" ");
            }
            printf ("\n");
        }
        printf ("\n");
    }
    system ("Pause");
    return 0;
}


