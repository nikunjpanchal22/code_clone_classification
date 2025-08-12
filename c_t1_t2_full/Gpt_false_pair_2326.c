int main () {
    unsigned int c;
    unsigned char *cptr = (unsigned char *) &c;
    while (1) {
        scanf ("%d", & c);
        printf ("Signed value: %d\n", c);
        printf ("Unsigned value: %u\n", c);
        printf ("%u.%u.%u.%u \n", * cptr, * (cptr + 1), * (cptr + 2), * (cptr + 3));
    }
}


 int main () { 
    int c;
    unsigned char *cptr = (unsigned char *) &c; 
    while (1) {
        scanf ("%d", &c); 
        printf ("Signed value: %d\n", c); 
        printf ("Unsigned value: %u\n", (unsigned int) c); 
        printf ("%u.%u.%u.%u \n", *cptr, *(cptr + 1), *(cptr + 2), *(cptr + 3));
    }
}
