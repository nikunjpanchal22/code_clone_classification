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
    int n = strlen (p);
    q = (char *) malloc (sizeof (char) * n + 1);

    while (*p != '\0')
    {
        *q = *p; 
        q++; 
        p++; 
    }

    *q = '\0';
    q = q - n;

    printf ("%s", q);
    getchar ();
    free (q);
    return 0;
}


