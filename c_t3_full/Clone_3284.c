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
    char *src = "krishna";
    char *dest = malloc(strlen(src) + 1);
    memcpy(dest, src, strlen(src) + 1);
    printf("%s", dest);
    getchar();
    free(dest);
    return 0;
}


