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


 int main (void) {
    char *saida = calloc(50, sizeof(char));
    char *res = text();

    if (res == NULL) {
        fprintf (stderr, "failed to allocate memory\n");
        return 1;
    }

    strcpy(saida, res);
    printf("%s\n", saida);
    free(res);
    free (saida);
    return 0;
}


