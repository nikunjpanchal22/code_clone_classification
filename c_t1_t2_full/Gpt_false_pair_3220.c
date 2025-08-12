int main (void) {
    while (1) {
        int c;
        printf ("Enter a character (press q to exit): ");
        c = getchar ();
        if (c == '\n')
            continue;
        if (c == EOF) {
            putchar ('\n');
            break;
        }
        if (c == 'q')
            break;
        printf ("'%c' is integer: %d\n", c, c);
        if (empty_stdin () == EOF) {
            putchar ('\n');
            break;
        }
    }
    return 0;
}


int main (void) {
    while (1) {
        int input;
        printf ("Input a character (press q to quit): ");
        input = getchar ();
        if (input == '\n')
            continue;
        if (input == EOF) {
            putchar ('\n');
            break;
        }
        if (input == 'q')
            break;
        printf ("'%c' is character and its code is %d\n", input, input);
        if (empty_stdin () == EOF) {
            putchar ('\n');
            break;
        }
    }
    return 0;
}
