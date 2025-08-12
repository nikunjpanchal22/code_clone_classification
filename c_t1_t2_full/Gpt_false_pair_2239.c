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
    char str[100];
    strncpy(str,"krishna", sizeof(str)-1); // null terminate
    char *q = (char *) malloc (sizeof (char) * (strlen (str) + 1));
    strcpy (q, str);
    printf ("%s", q);
    getchar ();
    free (q);
    return 0;
}
