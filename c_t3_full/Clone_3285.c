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
    const char name[] = "krishna";
    char *str = (char*)calloc(strlen(name) + 1, sizeof(char));
    snprintf(str, strlen(name)+1, "%s", name);
    printf("%s", str);
    getchar();
    free(str);
    return 0;
}


