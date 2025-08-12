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
    int length = strlen(p);
    char *q = malloc ( length + 1);
    strncpy(q, p, length+1);
    printf ("%s", q);
    getchar ();
    free (q);
    return 0;
}


