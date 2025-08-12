int main (int argc, char **argv) {
    char *fname = strdup (argv[1]);
    char *outdir = argv[1];
    char *dotpos;
    int new_size = strlen (fname) + strlen (extra);
    char *new_fname = malloc (new_size);
    dotpos = strchr (fname, '.');
    if (dotpos)
        *dotpos = '\0';
    new_fname = malloc (new_size);
    snprintf (new_fname, new_size, "%s%s", fname, extra);
    printf ("%s\n", new_fname);
    return 0;
}


 
int main (int argc, char **argv) {
    char *fname = strdup (argv[1]);
    char *dotpos;
    char *new_fname = strdup (fname);
    const char *extra = ".copy";
    dotpos = strchr (fname, '.');
    if (dotpos)
        *dotpos = '\0';
    int new_size = strlen (fname) + strlen (extra); 
    new_fname = (char*)realloc(new_fname, new_size);
    snprintf (new_fname, new_size, "%s%s", fname, extra);
    printf ("%s\n", new_fname);
    free(fname);
    free(new_fname);
    return 0;
}


