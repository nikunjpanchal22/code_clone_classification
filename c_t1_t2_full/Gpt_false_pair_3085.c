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
    char buf [FILENAME_MAX + 1];
    char *res = _fullpath ("this_source.c", buf, FILENAME_MAX);
    if (res) {
        printf ("This source is at %s.\n", buf);
    }
    else {
        perror ("_fullpath");
        exit (EXIT_FAILURE);
    }
    return 0;
}
