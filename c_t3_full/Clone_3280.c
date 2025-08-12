void main () {
    char *p = "krishna";
    char *q = (char *) malloc (sizeof (char) * (strlen (p) + 1));
    strcpy (q, p);
    printf ("%s", q);
    getchar ();
    free (q);
    return 0;
}





int main() {
    char *t = "krishna";
    size_t l = strlen(t) + 1;
    char *r = malloc(l);
    while (*r++ = *t++);
    printf ("%s", r);
    getchar();
    free(r);
    return 0;
}


