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
    char file_name[128];
    char *name = "hello";
    char *extension = ".txt";
    if ((strlen(name) + 1) >= sizeof(file_name)) {
        printf("Name is too long\n");
        return EXIT_FAILURE;
    }
    snprintf(file_name, sizeof(file_name), "%s", name);
    if ((strlen(file_name) + strlen(extension) + 1) >= sizeof(file_name)) {
        printf("Filename is too long!\n");
        return EXIT_FAILURE;
    }
    strncat(file_name, extension, (sizeof(file_name) - strlen(file_name)));
    printf ("Filename is %s\n", file_name);
    return EXIT_SUCCESS;
}


