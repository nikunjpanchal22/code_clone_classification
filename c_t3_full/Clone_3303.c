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
    char destination[50];
    char *source = load_text();
    if (source == NULL) {
        fprintf(stderr, "Failed to assign memory\n");
        return 1;
    }
    strncpy(destination, source, sizeof(destination));
    destination[sizeof(destination) - 1] = '\0';
    printf("%s", destination);
    free(source);
    return 0;
}


