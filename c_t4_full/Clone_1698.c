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
    char fnm[128];
    const char *name = "hello";
    const char *extension = ".txt";
    if ((sizeof(fnm) - 1) < strlen(name)) {
        printf("Name '%s' is too long\n", name);
        return EXIT_FAILURE;
    }
    strncpy(fnm, name, sizeof(fnm) - 1);
    if ((sizeof(fnm) - strlen(fnm) - 1) < strlen(extension)) {
        printf("Filename is too long!\n");
        return EXIT_FAILURE;
    }
    strncat(fnm, extension, sizeof(fnm) - strlen(fnm) - 1);
    printf("Filename is: %s\n", fnm);
    return EXIT_SUCCESS;
}


