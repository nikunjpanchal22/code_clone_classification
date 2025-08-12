int main () {
    char *p = "krishna";
    int size = strlen (p) + 1;
    char *q = (char *) malloc (size);
    char *qi = q;
    do {
        *q++ = *p;
    }
    while (*p++ != '\0');
    q = qi;
    printf ("%s", q);
    getch ();
    return 0;
}



 int main() 
{
    char *p = "krishna";
    int length = strlen(p) + 1;
    char *q = (char *)malloc(length);
    
    for (int i = 0; i < length; i++) {
        q[i] = p[i];
    }
    printf("%s\n", q);
    free(q);
    getch ();
    return 0;
}


