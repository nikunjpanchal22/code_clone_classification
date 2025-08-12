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
    char a[35], b[35], cstring[99];
    printf ("Input something:");
    fgets (cstring, 99, stdin);
    sscanf (cstring, "%s %s", a, b);
    printf ("Thanks, now type more:");
    fgets (cstring, 99, stdin);
    return 0;
}
