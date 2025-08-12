void main () {
    char *p = "krishna";
    char *q = (char *) malloc (sizeof (char) * (strlen (p) + 1));
    strcpy (q, p);
    printf ("%s", q);
    getchar ();
    free (q);
    return 0;
}





int main(){
    char *a = "krishna";
    char *b = (char*) malloc((strlen(a)+1));
    int i=0;
    while ((b[i] = a[i]) != '\0') i++;
    printf("%s",b);
    getchar();
    free(b);
    return 0;
}


