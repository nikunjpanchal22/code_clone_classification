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
    char* sourceName = "this_source.c";
    char *rpResult = realpath (sourceName, buf);
    if (rpResult == NULL) {
        perror ("realpath");
        exit (EXIT_FAILURE);
    }
    else {
        printf ("This source is at %s.\n", buf);
    }
    return 0;
}


