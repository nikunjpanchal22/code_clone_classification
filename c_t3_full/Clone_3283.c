void main () {
    char *p = "krishna";
    char *q = (char *) malloc (sizeof (char) * (strlen (p) + 1));
    strcpy (q, p);
    printf ("%s", q);
    getchar ();
    free (q);
    return 0;
}





#include<string.h>
int main() {
    char *s = "krishna";
    char *t = (char*)calloc(1, strlen(s) + 1);
    if(t) memcpy(t, s, strlen(s));
    printf("%s", t);
    getchar();
    free(t);
    return 0;
}


