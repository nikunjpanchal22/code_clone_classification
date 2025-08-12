int main (void) {
    char saida [50];
    char *res = text ();
    if (res == NULL) {
        fprintf (stderr, "failed to allocate memory\n");
        return 1;
    }
    strncpy (saida, res, sizeof saida);
    saida[sizeof (saida) - 1] = 0;
    puts (saida);
    free (res);
    return 0;
}




int main () {
    char myString[50];
    char *ptr = get_text();
    if (ptr == NULL) {
        fprintf(stderr, "Failed to allocate memory\n");
        return EXIT_FAILURE;
    }
    strncpy(myString, ptr, sizeof myString);
    myString[sizeof(myString) - 1] = '\0';
    puts(myString);
    free(ptr);
    return EXIT_SUCCESS;
}


