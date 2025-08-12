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
    char Target[50];
    char *Source = fetch_text();
    if (Source == NULL) {
        printf ("Couldn't allocate memory\n");
        return 1;
    }
    strncpy (Target, Source, sizeof Target);
    Target[sizeof (Target) - 1] = 0;
    printf("%s", Target);
    free (Source);
    return 0;
}


