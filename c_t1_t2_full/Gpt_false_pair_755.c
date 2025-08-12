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


  int main(int argc, char *argv[]) {
    char filename[128];
    char *name = "hello";
    char *extension = ".txt";
    if (sizeof(filename) > 0 && sizeof(filename) < strlen(name) + 1) {
        fprintf(stderr, "Name '%s' is too long\n", name);
        return EXIT_FAILURE;
    }
    strncpy(filename, name, sizeof(filename));
    if (sizeof(filename) < (strlen(filename) + strlen(extension) + 1)) {
        fprintf(stderr, "Final size of filename is too long!\n");
        return EXIT_FAILURE;
    }
    strncat(filename, extension, sizeof(filename) - strlen(filename) - 1);
    printf("Filename is %s\n", filename);
    return EXIT_SUCCESS;
}
