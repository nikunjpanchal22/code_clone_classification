int main (int argc, char **argv) {
    char inputBuffer [1024];
    char *ptr = NULL;
    int integer = 8888;
    FILE *xfin;
    --argc;
    ++argv;
    if (argc > 0)
        xfin = fopen (*argv, "r");
    else
        xfin = stdin;
    while (fgets (inputBuffer, sizeof (inputBuffer), xfin)) {
        ptr = inputBuffer;
        int done = 0;
        while (!done) {
            char *newPtr = ASCIItoInt (ptr, &integer);
            if (newPtr == NULL) {
                if (*ptr != '\0')
                    ++ptr;
                else
                    done = 1;
            }
            else {
                printf ("%d\n", integer);
                ptr = newPtr;
            }
        }
    }
    if (argc > 0)
        fclose (xfin);
    return 0;
}


int main (int argc, char **argv) {
    char inputBuffer [1024];
    char *ptr = NULL;
    int integer = 8888;
    FILE *xfin;
    --argc;
    ++argv;
    if (argc > 0)
        xfin = fopen (*argv, "r");
    else
        xfin = stdin;
    while (fgets (inputBuffer, sizeof (inputBuffer), xfin)) {
        ptr = inputBuffer;
        int done = 0;
        while (!done) {
            char *newPtr = ParseASCIIString (ptr, &integer);
            if (newPtr == NULL) {
                if (*ptr != '\0')
                    ++ptr;
                else
                    done = 1;
            }
            else {
                printf ("%d\n", integer);
                ptr = newPtr;
            }
        }
    }
    if (argc > 0)
        fclose (xfin);
    return 0;
}
