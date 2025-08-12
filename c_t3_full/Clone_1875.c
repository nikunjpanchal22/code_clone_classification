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
	char *saida = malloc(50 * sizeof(char));
	if (!saida) {
		fprintf (stderr, "failed to allocate memory\n");
        return 1;
	}
	char *res = text ();
	memcpy(saida, res, 49);
	saida[49] = 0;
	puts (saida);
	free (res);
	free (saida);
	return 0;
}


