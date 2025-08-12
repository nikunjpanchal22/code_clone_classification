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
   
    int loop = length;
    while (loop != 0) {
        *q = *p;
        p++;
        q++;
        loop--;
    }
    q = q - length;
   
    printf("%s\n", q);
    free(q);
    getch ();
    return 0;
}


