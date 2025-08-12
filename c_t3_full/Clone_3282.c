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
    char *temp = dest;
    while (*temp++ = *src++);
    printf("%s", dest);
    getchar();
    free(dest);
    return 0;
}  




int main() {
    char src[] = "krishna";
    char *dest = (char*) malloc( (strlen(src) + 1) * sizeof(char));
    for (int i = 0; i <= strlen(src); i++) {
        dest[i] = src[i];
    }
    printf("%s", dest);
    getchar();
    free(dest);
    return 0;
}


