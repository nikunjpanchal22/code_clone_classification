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
    char *extra = ".copy";
    int new_length = strlen (fname) + strlen (extra);
    char *new_fname = malloc (new_length + 1);
    new_fname[new_length] = '\0';
    dotpos = strchr (fname, '.');
    if (dotpos)
        *dotpos = '\0';
    strcpy(new_fname, fname);
    strcat(new_fname, extra);
    printf ("%s\n", new_fname);
    free(fname);
    free(new_fname);
    return 0;
}


