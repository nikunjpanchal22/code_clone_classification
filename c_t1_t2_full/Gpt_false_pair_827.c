int main (void) {
    char buf [PATH_MAX + 1];
    char *res = realpath ("this_source.c", buf);
    if (res) {
        printf ("This source is at %s.\n", buf);
    }
    else {
        perror ("realpath");
        exit (EXIT_FAILURE);
    }
    return 0;
}


 int main (void) {
    char buffer[PATH_MAX + 1];
    char* sourceFile = "this_source.c";
    char *res = realpath (sourceFile, buffer);
    if (res) {
        printf ("This source is at %s.\n", buffer);
    }
    else {
        perror ("realpath");
        exit (EXIT_FAILURE);
    }
    return 0;
}
