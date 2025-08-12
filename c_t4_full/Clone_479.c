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
    int m;
    m=0;
    do {
        int j;
        j=0;
        do {
            int i;
            i=0;
            do {
                int k;
                k=0;
                
                do {
                    printf ("*");
                    k++;
                }
                while (k < side);
                printf (" ");
                i++;
            }
            while (i < side);
            printf ("\n");
            j++;
        }
        while (j < side);
        printf ("\n");
        m++;
    }
    while (m < side);
    system ("Pause");
    return 0;
}


