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
void main()
{
    char files[128];
    char elemnt[] = "hello";
    char attach[] = ".txt";
    if (strlen(elemnt) + 1 > sizeof(files)) {
        fprintf(stderr, "%s : Name is too long\n", elemnt);
        exit(EXIT_FAILURE);
    }
    strcpy(files, elemnt);
    if (strlen(files) + strlen(attach) + 1 > sizeof(files)) {
        fprintf(stderr, "Filename is too long!\n");
        exit(EXIT_FAILURE);
    }
    strcat(files, attach);
    printf("Filename is %s\n", files);
    exit(EXIT_SUCCESS);
}


