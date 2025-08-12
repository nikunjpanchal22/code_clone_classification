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
    char s[] = "krishna";
    char *pt = strdup(s);
    printf("%s", pt);
    getchar();
    free(pt);
    return 0;
}


