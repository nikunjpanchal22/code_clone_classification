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
    int size = strlen (p) + 1;
    char *q = (char*)malloc(size);   
    while (*p != '\0')
    {
        *q = *p;
        p++;
        q++;
     } 
    q = q - size;
    printf("%s\n", q);
    free(q);
    getch ();
    return 0;
}


