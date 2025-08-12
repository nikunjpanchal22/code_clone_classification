int main (void) {
    char *num, *p;
    num = malloc (sizeof (char) * 100);
    if (num == NULL)
        exit (1);
    memset (num, 0, sizeof (char) * 100);
    p = num;
    strncpy (num, "123056", 100 - 1);
    *(p + 3) = '4';
    printf ("%s\n", num);
    free (num);
    return 0;
}



int main (void) {
    char *num, *p;
    num = malloc (sizeof (char) * 100);
    if (num == NULL)
        exit (1);
    memset (num, 0, 100);
    p = num;
    strcpy (num, "123056");
    *(p + 3) = '4';
    printf ("%s\n", num);
    free (num);
    return 0;
}
