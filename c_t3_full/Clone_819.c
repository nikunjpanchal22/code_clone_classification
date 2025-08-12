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


 int main (void) 
{
    char buffer[PATH_MAX + 1];
    char *result = realpath ("this_source.c", buffer);
    if (result == NULL) {
        perror ("realpath");
        exit (EXIT_FAILURE);
    }
    else {
        printf ("This source is at %s.\n", buffer);
    }
    return 0;
}


