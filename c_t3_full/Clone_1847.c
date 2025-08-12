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
    char *q = (char*)malloc(size), *p_ptr = p, *q_ptr = q;   
    do
    {
        *q_ptr = *p_ptr;
        p_ptr++;
        q_ptr++;
     } while (*p_ptr != '\0');    
    
    printf("%s\n", q);
    free(q);
    getch ();
    return 0;
}


