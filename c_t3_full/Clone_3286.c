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
    char *str = "krishna";
    char *copy = (char *) calloc(strlen(str) + 1, sizeof(char));
    strncpy(copy, str, strlen(str));
    printf("%s", copy);
    getchar();
    free(copy);
    return 0;
}


