int main (void) {
    char *strings [10] = {}, *x;
    int i;
    size_t len;
    puts ("Enter 10 strings:");
    for (i = 0; i < 10; ++i)
        getline (&strings[i], &len, stdin);
    puts ("The strings that end with ed are:");
    for (i = 0; i < 10; ++i) {
        if ((x = strings[i])) {
            len = strlen (x);
            if (x[len - 1] == '\n')
                x[--len] = '\0';
            if (len > 1 && strcmp (x +len - 2, "ed") == 0)
                puts (x);
            free (x);
        }
    }
    return 0;
}


int main (void) {
    char *x;
    int i;
    size_t len;
    char *strings[10] = {}; 
    puts ("Enter 10 strings:");
    for (i = 0; i < 10; ++i)
        getline (&strings[i], &len, stdin);
    puts ("The strings that end with ed are:");
    for (i = 0; i < 10; ++i) {
        if ((x = strings[i])) {
            len = strlen (x);
            if (x[len - 1] == '\n')
                x[--len] = '\0';
            if (len > 1 && strcmp (x +len - 2, "ed") == 0)
                printf ("%s\n", x);
            free (x);
        }
    }
    return 0;
}
