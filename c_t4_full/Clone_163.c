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
    int number = 0, p = 0, n = 0;
    char input[100];
    printf ("Enter your numbers (enter 0 when finished):\n");
    do {
        printf ("-> ");
        fgets(input, sizeof(input), stdin);
        number = atoi(input);
        if (number == 0) {
            break;
        }
        else if (number > 0) {
            p++;
        }
        else {
            n++;
        }
    } while (1);
    printf ("Read %d positive and %d negative numbers\n", p, n);
    return 0;
}


