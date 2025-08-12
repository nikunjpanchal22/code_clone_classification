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



int main(void)
{
    char result[50];
    char *string = getMessage();
    if (string == NULL)
    {
        perror("Memory allocation failed\n");
        return 1;
    }
    strncpy(result, string, sizeof result);
    result[sizeof (result) - 1] = '\0';
    printf("%s", result);
    free(string);
    return 0;
}


