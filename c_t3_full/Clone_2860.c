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



 

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main (int argc, char **argv) {
    char *extra = "_extra";
    char *fname = strdup (argv[1]);
    char *outdir = argv[1];
    char *dotpos;
    int new_size = strlen (fname) + strlen (extra) + 1;
    char *new_fname;
    dotpos = strchr (fname, '.');
    if (dotpos)
        *dotpos = '\0';
    new_fname = malloc (new_size);
    sprintf (new_fname, "%s%s", fname, extra);
    printf ("%s\n", new_fname);
    free(fname);
    free(new_fname);
    return 0;
}


