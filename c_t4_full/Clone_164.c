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
    char input[100];
    printf ("Enter an integer (enter 0 to exit):\n");
    while(1) {
        printf ("-> ");
        fgets(input, sizeof(input), stdin);
        if (input[0] == '0') {
            break;
        } 
        number = atoi(input); 
        if (number > 0) {
            p++;
        }
        else if (number < 0) {
            n++;
        }
    }
    printf ("Read %d positive and %d negative numbers\n", p, n);
    return 0;
}


