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
    char ss[] = "krishna";
    char *buffer = (char*)malloc( (strlen(ss) + 1) * sizeof(char) );
    for (int i = 0; i <= strlen(ss); i++) {
        buffer[i] = ss[i];
    }
    printf ("%s", buffer);
    getchar();
    free(buffer);
    return 0;
}


