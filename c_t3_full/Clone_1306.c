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
    char *outdir = argv[1];
    char *dotpos;
    char *newfilename;
    const char *extra = ".copy";
    int strlength = strlen (fname) + strlen (extra);
    newfilename = malloc (strlength);
    dotpos = strchr(fname, '.');
    if (dotpos) {
        *dotpos = '\0';
    }
    sprintf (newfilename, "%s%s", fname, extra);
    printf("%s\n", newfilename);
    free(fname);
    free(newfilename);
    return 0;
}


