void main () {
    char *p = "krishna";
    char *q = (char *) malloc (sizeof (char) * (strlen (p) + 1));
    strcpy (q, p);
    printf ("%s", q);
    getchar ();
    free (q);
    return 0;
}



void main () {
    char *p = "krishna";
    char *q;
    int i = 0;
    int j = strlen(p);

    q = (char *) malloc (sizeof (char) * (j + 1));
    for (i; p[i] != '\0'; i++)
    {
        q[i] = p[i];
    }
    q[i] = '\0';

	printf ("%s", q);
    getchar ();
    free (q);
    return 0;
}


