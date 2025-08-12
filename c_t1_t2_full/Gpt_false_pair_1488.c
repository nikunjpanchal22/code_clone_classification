int main (void) {
    char a, b, cstring [99];
    printf ("please enter something");
    fgets (cstring, 35, stdin);
    sscanf (cstring, "%c %c", & a, & b);
    printf ("thanks, now some more");
    fgets (cstring, 35, stdin);
    return 0;
}


 int main (void) {
    char a, b, cstring[99];
    printf ("Please enter something:");
    fgets (cstring, 99, stdin);
    sscanf (cstring, "%c %c", &a, &b);
    printf ("thanks, now type some more:");
    fgets (cstring, 99, stdin);
    return 0;
}
