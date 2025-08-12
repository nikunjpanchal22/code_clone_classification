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
    int j = strlen (p);

    char *q = (char *) malloc (j + 1);
    strlcpy (q, p, j + 1);
    q[j] = '\0';

	printf ("%s", q);
    getchar ();
    free (q);
    return 0;
}


