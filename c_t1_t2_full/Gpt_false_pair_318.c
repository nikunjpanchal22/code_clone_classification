int main (void) {
    int n;
    int divisor;
    int answer = 0;
    int current_buffer_size = INITIAL_BUFFER_SIZE;
    char *line = malloc (current_buffer_size);
    if (line == NULL) {
        return EXIT_FAILURE;
    }
    setvbuf (stdin, (char *) NULL, _IOFBF, 0);
    scanf ("%d%d\n", & n, & divisor);
    while (n > 0) {
        unsigned long dividend;
        char *endp;
        int offset = 0;
        while (fgets (line +offset, current_buffer_size, stdin)) {
            if (line[strlen (line) - 1] == '\n') {
                break;
            }
            else {
                int new_buffer_size = 2 * current_buffer_size;
                char *tmp = realloc (line, new_buffer_size);
                if (tmp) {
                    line = tmp;
                    offset = current_buffer_size - 1;
                    current_buffer_size = new_buffer_size;
                }
                else {
                    break;
                }
            }
        }
        errno = 0;
        dividend = strtoul (line, &endp, 10);
        if (!((endp == line) || errno)) {
            if (dividend % divisor == 0) {
                answer += 1;
            }
        }
        n -= 1;
    }
    printf ("%d\n", answer);
    return 0;
}


 int main (void) {
    int n;
    int divisor;
    int answer = 0;
    int current_buffer_size = INITIAL_BUFFER_SIZE;
    char *line = malloc (current_buffer_size);
    if (line == NULL) {
        return EXIT_FAILURE;
    }
    setvbuf (stdin, (char *) NULL, _IOFBF, 0);
    scanf ("%d%d\n", & n, & divisor);
    while (n > 0) {
        unsigned long dividend;
        char *endp;
        int offset = 0;
        while (fgets (line +offset, current_buffer_size, stdin)) {
            if (line[strlen (line) - 1] == '\n') {
                break;
            }
            else {
                int new_buffer_size = current_buffer_size * 2;
                char *tmp = (char *) realloc (line, new_buffer_size);
                if (tmp) {
                    line = tmp;
                    offset = current_buffer_size - 1;
                    current_buffer_size = new_buffer_size;
                }
                else {
                    break;
                }
            }
        }
        errno = 0;
        dividend = (unsigned long) strtoul (line, &endp, 10);
        if (endp != line) {
            if (dividend % divisor == 0) {
                answer += 1;
            }
        }
        n -= 1;
    }
    printf ("%d\n", answer);
    return 0;
}
