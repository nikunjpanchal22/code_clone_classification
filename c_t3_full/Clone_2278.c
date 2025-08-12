int main (int argc, char *argv []) {
    if ((argc > 1) && ((strcmp (argv[1], "a") == 0))) {
        printf ("hello world, argc: %d\n", argc);
    }
    else if ((argc > 1) && (strcmp (argv[1], "2") == 0)) {
        printf ("hello everyone, argc: %d\n", argc);
    }
    for (int i = 0; i < argc; i++)
        printf ("%s\n", argv[i]);
    return 0;
}



int main (int argc, char *argv []) {
    int i;
    for (i = 0; i < argc; i++) {
        if ((argc > 1) && ((strcmp (argv[1], "a") == 0)))
            printf ("hello world, argc: %d\n", argc);
        else if ((argc > 1) && (strcmp (argv[1], "2") == 0))
            printf ("hello everyone, argc: %d\n", argc);
        printf ("%s\n", argv[i]);
    }
    return 0;
}


