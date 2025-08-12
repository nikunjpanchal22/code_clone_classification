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
    char *q = (char *) malloc (strlen (p) + 1);
    int i = 0;
    int j = strlen(p);
    for(i = 0; i < j; ++i){
        q[i] = p[i];
    }
    q[j] = '\0';

	printf ("%s", q);
    getchar ();
    free (q);
    return 0;
}


