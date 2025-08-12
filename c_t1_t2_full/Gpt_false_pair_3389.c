int main (void) {
    char line [256];
    int i;
    int x, y = 0;
    while (y < 5) {
        printf ("Please Insert X value\n");
        if (fgets (line, sizeof (line), stdin)) {
            if (validateLine (line)) {
                if (1 != sscanf (line, "%d", &x)) {
                    printf ("should never happen");
                    exit (1);
                }
                break;
            }
            else {
                printf ("Illegal input %s", line);
            }
        }
        y++;
    }
    if (y < 5)
        printf ("x=%d\n", x);
    else
        printf ("no more retries\n");
    return 0;
}


int main (void) {
    int i;
    int x, y = 0;
    while (y < 5) {
        char *input = getUserInput();
        if (isValidInput(input)) {
            if (1 != sscanf (input, "%d", &x)) {
                printf ("should never happen");
                exit (1);
            }
            break;
        }
        else {
            printf ("Illegal input %s", input);
        }
        y++;
    }
    if (y < 5)
        printf ("x=%d\n", x);
    else
        printf ("no more retries\n");
    return 0;
}
