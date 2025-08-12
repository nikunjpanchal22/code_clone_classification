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
    char *res = _getdcwd (0, buf, PATH_MAX);
    if (res) {
        printf ("This source is at %s.\n", buf);
    }
    else {
        perror ("_getdcwd");
        exit (EXIT_FAILURE);
    }
    return 0;
}
