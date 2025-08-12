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
    char q[strlen (p + 1)];
    strcpy (q, p);
    printf ("%s", q);
    getchar ();
    return 0;
}
