int main (int argc, char *argv []) {
    char filename [128];
    char *name = "hello";
    char *extension = ".txt";
    if (sizeof (filename) < strlen (name) + 1) {
        fprintf (stderr, "Name '%s' is too long\n", name);
        return EXIT_FAILURE;
    }
    strncpy (filename, name, sizeof (filename));
    if (sizeof (filename) < (strlen (filename) + strlen (extension) + 1)) {
        fprintf (stderr, "Final size of filename is too long!\n");
        return EXIT_FAILURE;
    }
    strncat (filename, extension, (sizeof (filename) - strlen (filename)));
    printf ("Filename is %s\n", filename);
    return EXIT_SUCCESS;
}





#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
    char file[128];
    char nm[] = "hello";
    char ex[] = ".txt";
    if (sizeof(file) - 1 < strlen(nm)) {
        fputs("Name is too long\n", stderr);
        return EXIT_FAILURE;
    }
    snprintf(file, sizeof(file), "%s%s", nm, ex);
    if (sizeof(file) - 1 < strlen(file)) {
        fputs("Filename is too long\n", stderr);
        return EXIT_FAILURE;
    }
    printf ("Filename is %s\n", file);
    return EXIT_SUCCESS;
}


