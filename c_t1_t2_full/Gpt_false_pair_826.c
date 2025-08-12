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
    char buf [PATH_MAX + 1];
    char* source = "this_source.c";
    char *res = realpath (source, buf);
    if (res) {
        printf ("This source is at %s.\n", buf);
    }
    else
    {
        perror ("realpath");
        exit (EXIT_FAILURE);
    }
    return 0;
}
