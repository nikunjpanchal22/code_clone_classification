int main (void) {
    int number, p = 0, n = 0;
    while (1) {
        printf ("-> ");
        if (scanf ("%d", &number) == 0) {
            fflush (stdin);
            printf ("Err...\n");
            continue;
        }
        fflush (stdin);
        if (number > 0)
            p++;
        else if (number < 0)
            n++;
        else
            break;
    }
    printf ("Read %d positive and %d negative numbers\n", p, n);
    return 0;
}


 int main (void) {
    int number, p = 0, n = 0;

    printf ("Enter your numbers (enter 0 when finished):\n");
    while (1) {
        printf ("-> ");
        if ((scanf("%d", &number)) == 1) { 
            if (number > 0) {
                p++;
            }
            else if (number < 0) {
                n++;
            }
            else {
                break;
            }
        }
        else {
            printf("Err...\n");
            while ((getchar()) != '\n');
        }
    }
    printf ("Read %d positive and %d negative numbers\n", p, n);
    return 0;
}


